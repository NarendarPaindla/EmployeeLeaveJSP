package com.example.servlet;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
        // Invalidate the session if one exists
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate();
        }
        // Redirect to the login page with a logout message
        response.sendRedirect("login.jsp?msg=Logged out successfully.");
    }
}
