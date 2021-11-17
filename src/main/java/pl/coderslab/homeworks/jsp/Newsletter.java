package pl.coderslab.homeworks.jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/newsletter")
public class Newsletter extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String name = request.getParameter("name");

        if(!email.isEmpty() && !name.isEmpty()){
            Subscriber subscriber = new Subscriber();
            subscriber.setName(name);
            subscriber.setEmail(email);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie [] cookies = request.getCookies();
        for(Cookie cookie : cookies) {
            if(!cookie.getName().equals("timeToSubscribe")) {
                Cookie cookie1 = new Cookie("timeToSubscribe", "");
                cookie1.setMaxAge(3600*24);
                response.addCookie(cookie1);
            }
        }

        getServletContext().getRequestDispatcher("/WEB-INF/newsletter.jsp")
                .forward(request,response);
    }
}
