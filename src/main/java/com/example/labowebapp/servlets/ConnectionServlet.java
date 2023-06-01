package com.example.labowebapp.servlets;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "connection",urlPatterns = "/connection")
public class ConnectionServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("./WEB-INF/pages/Connection.jsp").forward(request,response);
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Vérifier les informations de connexion
        // Par exemple, vérifiez si l'email et le mot de passe correspondent à un utilisateur enregistré dans votre système

        // Si les informations de connexion sont valides, effectuez les actions appropriées (par exemple, enregistrer l'utilisateur dans une session)

        // Redirigez l'utilisateur vers une page appropriée après la connexion
        response.sendRedirect("accueil.jsp");
    }

}
