package controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DAO.OrderDAO;
import model.bean.CartDTO;
import model.bean.CartSingleton;
import model.bean.OrderDTO;

@WebServlet(name = "OrderController", urlPatterns = {"/finalize"})
public class OrderController extends HttpServlet {

    CartDTO objCart = new CartDTO();
    OrderDTO objOrder = new OrderDTO();
    OrderDAO objOrderDao = new OrderDAO();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = request.getServletPath();
        if (path.equals("/finalize")) {
            doPost(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<CartDTO> cartItens = CartSingleton.getInstance().getCarrinhoItens();
        double totalPrice = 0;
        for (CartDTO item : cartItens) {
            totalPrice += item.getQuantity() * item.getPriceUnitary();
        }
        objOrder.setUserId(1);
        objOrder.setAdressId(1);
        objOrder.setMethodPayment("pix");
        objOrder.setTotalPrice(totalPrice);
        objOrderDao.insertOrder(objOrder);
        CartSingleton.getInstance().limparCarrinho();
        String path = "/WEB-INF/jsp/index.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(path);
        dispatcher.forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
