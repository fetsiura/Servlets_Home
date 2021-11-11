package pl.coderslab.homeworks.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/servlet33")
public class Servlet33 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        HttpSession session = request.getSession();
        List<String> values = new ArrayList<>();

        String one = request.getParameter("1");
        String two = request.getParameter("2");
        String three = request.getParameter("3");
        String four = request.getParameter("4");
        String five = request.getParameter("5");
        if(!one.isEmpty() && !two.isEmpty() && !three.isEmpty() && !four.isEmpty() && !five.isEmpty()){
            values.add(one);
            values.add(two);
            values.add(three);
            values.add(four);
            values.add(five);
            session.setAttribute("values",values);
        }
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        HttpSession session = request.getSession();
        List<String> values = new ArrayList<>();

        if(session.getAttribute("values")!=null){
            values= (List<String>) session.getAttribute("values");
        }

        if(values.size()!=0){
            response.getWriter().append("<form action=\"\" method=\"post\">\n" +
                    "<input type=\"text\" name=\"1\" placeholder=\"one\" value=\"" + values.get(0) + "\"><br>\n" +
                    "<input type=\"text\" name=\"2\" placeholder=\"two\" value=\"" + values.get(1) + "\"><br>\n" +
                    "<input type=\"text\" name=\"3\" placeholder=\"thee\" value=\"" + values.get(2) + "\"><br>\n" +
                    "<input type=\"text\" name=\"4\" placeholder=\"four\" value=\"" + values.get(3) + "\"><br>\n" +
                    "<input type=\"text\" name=\"5\" placeholder=\"five\" value=\"" + values.get(4) + "\"><br>\n" +
                    "    <button type=\"submit\">SEND</button>\n" +
                    "</form>");
        } else {
            response.getWriter().append("<form action=\"/servlet33\" method=\"post\">\n" +
                    "    <input type=\"text\" name=\"1\" placeholder=\"one\"> <br>\n" +
                    "    <input type=\"text\" name=\"2\" placeholder=\"two\"> <br>\n" +
                    "    <input type=\"text\" name=\"3\" placeholder=\"three\"> <br>\n" +
                    "    <input type=\"text\" name=\"4\" placeholder=\"four\"> <br>\n" +
                    "    <input type=\"text\" name=\"5\" placeholder=\"five\"> <br>\n" +
                    "    <br>\n" +
                    "    <button type=\"submit\">CHECK</button>\n" +
                    "</form>");
        }

    }
}
