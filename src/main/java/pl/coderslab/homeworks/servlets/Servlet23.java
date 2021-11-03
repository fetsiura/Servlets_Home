package pl.coderslab.homeworks.servlets;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

@WebServlet("/servlet23")
public class Servlet23 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String inputFile = "/WEB-INF/oop.txt";
        ServletContext context = getServletContext();
        InputStream inputStream = context.getResourceAsStream(inputFile);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        Scanner scanner = new Scanner(inputStreamReader);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            response.getWriter().append(line+"<br>");
        }
    }
}
