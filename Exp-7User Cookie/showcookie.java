package com.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.*;

@WebServlet("/showCookie")

public class ShowCookieServlet extends HttpServlet {

protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {

response.setContentType("text/html");

PrintWriter out = response.getWriter();

Cookie cookies[] = request.getCookies();

String name = "Guest";

if(cookies != null){

for(Cookie c : cookies){

if(c.getName().equals("user")){
name = c.getValue();
}

}

}

out.println("<html>");
out.println("<head>");
out.println("<title>Welcome</title>");

out.println("<style>");
out.println("body{font-family:Arial;background:#f2f2f2;text-align:center;padding-top:120px;}");
out.println(".card{background:white;padding:40px;border-radius:12px;width:400px;margin:auto;box-shadow:0 10px 25px rgba(0,0,0,0.2);}");
out.println("a{display:inline-block;margin-top:20px;text-decoration:none;background:#667eea;color:white;padding:10px 20px;border-radius:6px;}");
out.println("</style>");

out.println("</head>");

out.println("<body>");

out.println("<div class='card'>");

out.println("<h2>Welcome " + name + "</h2>");
out.println("<p>You are successfully logged in using Cookies.</p>");

out.println("<a href='index.html'>Logout</a>");

out.println("</div>");

out.println("</body>");
out.println("</html>");

}

}