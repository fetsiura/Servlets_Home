package pl.coderslab.homeworks.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servlet241")
public class Servlet241 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        for(int i =1;i<9;i++){
            response.getWriter()
                    .append("<a href=http://localhost:8080/servlet242?number=")
                    .append(i+">Some "+i+"</a><br>");
        }
    }
}
