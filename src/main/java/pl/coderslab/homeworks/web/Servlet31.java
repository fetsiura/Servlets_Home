package pl.coderslab.homeworks.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/servlet31")
public class Servlet31 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");

        Map<String, Double> currencies = new HashMap<>();
        currencies.put("eur-usd",1.15);
        currencies.put("usd-eur",0.87);
        currencies.put("eur-pln",4.63);
        currencies.put("pln-eur",0.22);
        currencies.put("usd-pln",4.04);
        currencies.put("pln-usd",0.25);

        String sum = request.getParameter("sum");
        String currency = request.getParameter("currency");

        if(!sum.isEmpty() && !currency.isEmpty()){
            try{
                double sumToCast = Double.parseDouble(sum);

                for(Map.Entry<String,Double> entry:currencies.entrySet()){
                    if(entry.getKey().equals(currency)){
                        String [] cast = entry.getKey().split("-");
                        response.getWriter().append("Kwota "+sum+" "+cast[0]+" = ")
                                .append(sumToCast*entry.getValue()+cast[1]);
                        response.getWriter().append("<br><a href=\"servlet31.html\">GO TO CAST</a>");

                    }
                }

            }catch (NumberFormatException e){
                response.getWriter().append("błędny format");
                response.getWriter().append("<br><a href=\"servlet31.html\">GO TO CAST</a>");

            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
