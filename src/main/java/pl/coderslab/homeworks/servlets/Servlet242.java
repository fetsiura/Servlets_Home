package pl.coderslab.homeworks.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servlet242")
public class Servlet242 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");

        String number = request.getParameter("number");
        String products[] = {
                "Asus Transformer;2999.99",
                "iPhone 6';3499.18",
                "Converse Sneakers;125.00",
                "LG OLED55B6P OLED TV;6493.91",
                "Samsung HT-J4100;800.99",
                "Alpine Swiss Dress Belt;99.08",
                "60 Watt LED;1.50",
                "Arduino Nano;3.26",
        };
        if(!number.isEmpty()){

            try {
                int n = Integer.parseInt(number);

                String [] res = products[n-1].split(";");
                response.getWriter().append(res[0]+" - "+ res[1]+"<br>");

            }catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }
}
