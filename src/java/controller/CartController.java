package controller;

import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import javax.json.Json;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CartController", urlPatterns = {"/add-product-cart"})
public class CartController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = request.getServletPath();
        if (path.equals("/add-product-cart")) {
            try {
                // Obtenha o JSON do corpo da solicitação
                BufferedReader reader = request.getReader();
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    sb.append(line);
                }
                String json = sb.toString();

                javax.json.JsonObject jsonObject = Json.createReader(new StringReader(json)).readObject();
                int productId = jsonObject.getInt("productId");
                String productName = jsonObject.getString("productName");
                double productPrice = jsonObject.getJsonNumber("productPrice").doubleValue();
                int productQtd = jsonObject.getInt("productQtd");
                
                javax.json.JsonObject responseJson = Json.createObjectBuilder()
                        .add("message", "Produto adicionado ao carrinho com sucesso!")
                        .build();
                response.setContentType("application/json");
                response.setCharacterEncoding("UTF-8");
                response.getWriter().write(responseJson.toString());
            } catch (Exception e) {
                e.printStackTrace();
                response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
                response.getWriter().write("Erro interno ao processar a solicitação.");
            }
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
