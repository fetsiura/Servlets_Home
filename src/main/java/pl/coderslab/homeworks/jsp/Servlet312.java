package pl.coderslab.homeworks.jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/servlet312")
public class Servlet312 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String language = request.getParameter("takeLanguage");
        HttpSession session = request.getSession();
        if(!language.isEmpty()){
            Cookie cookie = new Cookie("language",language);
            System.out.println(language);
            cookie.setMaxAge(3600*24);
            response.addCookie(cookie);
        }
        response.sendRedirect(request.getContextPath()+"/servlet311");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
