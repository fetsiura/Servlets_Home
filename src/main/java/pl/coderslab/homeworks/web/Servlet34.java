package pl.coderslab.homeworks.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/servlet34")
public class Servlet34 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");

        boolean flag = true;
        Cookie [] cookies = request.getCookies();

        for (Cookie cookie :cookies){
            if(cookie.getName().equals("visits")){

                int counter = Integer.parseInt(cookie.getValue());
                response.getWriter().append("Witaj, odwiedziłeś nas już "+counter+" razy");
                cookie.setValue(String.valueOf(++counter));
                response.addCookie(cookie);
                flag=false;
            }

        }
        if(flag) {
            Cookie cookie1 = new Cookie("visits","2");
            cookie1.setMaxAge(3600*24);
            response.addCookie(cookie1);
            response.getWriter().append("Witaj pierwszy raz na naszej stronie");
        }
    }
}
