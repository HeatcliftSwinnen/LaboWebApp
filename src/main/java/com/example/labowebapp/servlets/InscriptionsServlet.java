package com.example.labowebapp.servlets;

import com.example.labowebapp.models.entities.Client;
import com.example.labowebapp.models.forms.ClientForm;
import com.example.labowebapp.services.ClientService;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import java.io.IOException;
import java.util.Set;

@WebServlet(name = "inscriptions", urlPatterns = "/inscriptions")
public class InscriptionsServlet extends HttpServlet {

    @Inject
    private ClientService clientService;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("./WEB-INF/pages/Inscriptions.jsp").forward(request,response);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String email = request.getParameter("mail");

        ClientForm clientForm = new ClientForm(email);

        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<ClientForm>> constraints = validator.validate(clientForm);

        if(constraints.size() > 0){

            for (ConstraintViolation<ClientForm> constraint : constraints) {
                if(constraint.getPropertyPath().toString().equals("name")){

                    request.setAttribute("nameError",constraint.getMessage());
                }
                System.out.println(constraint.getRootBeanClass().getSimpleName()+
                        "." + constraint.getPropertyPath() + " " + constraint.getMessage());
            }
            request.setAttribute("mail",email);
            request.getRequestDispatcher("/WEB-INF/pages/Inscriptions.jsp").forward(request,response);
        }else{
            Client client = clientService.add(clientForm);
            response.sendRedirect(request.getContextPath() + "/index.jsp");
        }
    }




}
