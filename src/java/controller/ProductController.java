package controller;

import com.google.gson.Gson;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import model.DAO.ProductDAO;
import model.bean.ProductDTO;

@WebServlet(name = "ProductController", urlPatterns = {"/category-product", "/product","/insert-products"})
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
        }else if (url.equals("/insert-product")){
            doPost(request, response);
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        List<ProductDTO> products = objProductDao.read();
        
        Gson gson = new Gson();
        String json = gson.toJson(products);
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(json);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Part filePart = request.getPart("image");
        InputStream inputStream = filePart.getInputStream();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[4096];
        int bytesRead = -1;
        
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead);
        }
        byte[] imageBytes = outputStream.toByteArray();
        
        objProduct.setName(request.getParameter("name"));
        objProduct.setCategoryId(Integer.parseInt(request.getParameter("category")));
        objProduct.setPrice(Float.parseFloat(request.getParameter("price")));
        objProduct.setImage(imageBytes);
        objProductDao.insertProduct(objProduct);
    }
}
