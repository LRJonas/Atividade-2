package com.example.exercicio_1;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name="requisicao", value="/requisicao")
public class Ex_2a extends HttpServlet{

    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String a = request.getMethod();
        String b = request.getRequestURI();
        String c = request.getProtocol();
        String d = request.getRemoteAddr();
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Metodo: " + a + "</h1>");
        out.println("<h1>URI: " + b + "</h1>");
        out.println("<h1>Protocolo: " + c + "</h1>");
        out.println("<h1>Endereco Remoto: " + d + "</h1>");


    }

}
