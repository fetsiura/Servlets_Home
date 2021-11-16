package pl.coderslab.homeworks.jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/servlet311")
public class Servlet311 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String> lang = new HashMap<>();
        lang.put("en", "Hello");
        lang.put("pl", "Cześć");
        lang.put("de", "Hallo");
        lang.put("es", "Hola");
        lang.put("fr", "Salut");

        Cookie [] cookies = request.getCookies();
        HttpSession session = request.getSession();
        for(Cookie cookie : cookies){
            if(cookie.getName().equals("language")){
                request.setAttribute("tookLanguage",lang.get(cookie.getValue()));
            }
        }


        request.setAttribute("lang",lang);
        getServletContext().getRequestDispatcher("/WEB-INF/jsp311.jsp")
                .forward(request,response);
    }
}
