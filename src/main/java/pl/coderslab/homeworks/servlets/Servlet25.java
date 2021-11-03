package pl.coderslab.homeworks.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@WebServlet("/servlet25")
public class Servlet25 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");

        Random random = new Random();
        List<Integer> integers = new ArrayList<>();
        for(int i =0;i<10;i++){

            integers.add(random.nextInt(101));
        }

        response.getWriter().append(integers.toString()+" <br>" );
        Collections.sort(integers);
        response.getWriter().append(integers.toString()+" <br>" );

    }
}
