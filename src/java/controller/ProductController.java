package controller;

import com.google.gson.Gson;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DAO.ProductDAO;
import model.bean.ProductDTO;

@WebServlet(name = "ProductController", urlPatterns = {"/category-product", "/product","/list-products"})
@MultipartConfig
public class ProductController extends HttpServlet {

    ProductDTO objProduct = new ProductDTO();
    ProductDAO objProductDao = new ProductDAO();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = request.getServletPath();
        if (url.equals("/category-product")) {
            String path = "/WEB-INF/jsp/product-category.jsp";
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(path);
            dispatcher.forward(request, response);
        } else if (url.equals("/product")) {
            String path = "/WEB-INF/jsp/product.jsp";
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(path);
            dispatcher.forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String url = request.getServletPath();
        if(url.equals("/list-products")){
            List<ProductDTO> products = objProductDao.read();

            Gson gson = new Gson();
            String json = gson.toJson(products);
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write(json);  
        }
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
}
