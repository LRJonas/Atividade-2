package com.example.exercicio_1;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="cabecalhos", value="/cabecalhos")

public class Ex_2b extends HttpServlet {

    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String a = request.getHeader("host");
        String b = request.getHeader("user-agent");
        String c = request.getHeader("accept-encoding");
        String d = request.getHeader("accept-language");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Host: " + a + "</h1>");
        out.println("<h1>User Agent: " + b + "</h1>");
        out.println("<h1>Accept-Encoding: " + c + "</h1>");
        out.println("<h1>Accept-Languages: " + d + "</h1>");


    }

}
