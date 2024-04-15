package controller;

import com.google.gson.Gson;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DAO.UserDAO;
import model.bean.UserDTO;

@WebServlet(name = "UserController", urlPatterns = {"/register-user", "/login-user", "/insert", "/users", "/login"})
public class UserController extends HttpServlet {

    UserDAO objUserDao = new UserDAO();
    UserDTO objUser = new UserDTO();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = request.getServletPath();
        switch (url) {
            case "/register-user": {
                String path = "/WEB-INF/jsp/register.jsp";
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(path);
                dispatcher.forward(request, response);
                break;
            }
            case "/login-user": {
                String path = "/WEB-INF/jsp/login.jsp";
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(path);
                dispatcher.forward(request, response);
                break;
            }
            case "/login": {
                String path = "/WEB-INF/jsp/index.jsp";
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(path);
                dispatcher.forward(request, response);
                break;
            }
            default:
                break;
        }
        if (url.equals("/insert")) {
            doPost(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        String url = request.getServletPath();
        if (url.equals("/users")) {
            List<UserDTO> users = objUserDao.read();

            Gson gson = new Gson();
            String json = gson.toJson(users);

            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write(json);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        objUser.setName(request.getParameter("name"));
        objUser.setCpf(request.getParameter("cpf"));
        objUser.setPhone(request.getParameter("phone"));
        objUser.setBirthDate(request.getParameter("date"));
        objUser.setUser(request.getParameter("user"));
        objUser.setPassword(request.getParameter("password"));
        objUserDao.insertUser(objUser);
        String path = "/WEB-INF/jsp/index.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(path);
        dispatcher.forward(request, response);
    }
}
