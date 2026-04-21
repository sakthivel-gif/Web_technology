package com.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/CookieServlet")

public class CookieServlet extends HttpServlet {

protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {

String name = request.getParameter("username");

Cookie cookie = new Cookie("user", name);

cookie.setMaxAge(60*60);   // cookie valid for 1 hour

response.addCookie(cookie);

response.sendRedirect("showCookie");

}

}