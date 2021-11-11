package pl.coderslab.homeworks.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servlet32")
public class Servlet32 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String binaryS = request.getParameter("binar");
            String catchAnother = binaryS.replaceAll("[0-1]","");
            if (catchAnother.equals("[2-9]")) {
                response.getWriter().append("not a binary number");
            } else {
                int binary = Integer.parseInt(binaryS,2);
                response.getWriter().append("" +binary);
            }

        }catch (NumberFormatException e) {
            response.getWriter().append("not a binary number");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
