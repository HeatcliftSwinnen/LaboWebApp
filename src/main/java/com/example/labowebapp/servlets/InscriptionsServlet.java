package com.example.labowebapp.servlets;

import com.example.labowebapp.models.entities.Adresse;
import com.example.labowebapp.models.entities.Client;
import com.example.labowebapp.models.enums.Gender;
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
import java.time.LocalDate;
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

        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        LocalDate birthdate = LocalDate.parse(request.getParameter("birthdate"));
        Gender gender = Gender.valueOf(request.getParameter("gender"));
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        Adresse adresse = new Adresse(request.getParameter("adresse"));
        String telephoneNumber = request.getParameter("telephoneNumber");



        ClientForm clientForm= ClientForm.builder()
                .firstname(firstname)
                .lastname(lastname)
                .birthdate(birthdate)
                .gender(gender)
                .mail(email)
                .password(password)
                .adresse(adresse)
                .telephoneNumber(telephoneNumber)
                .build();

        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<ClientForm>> constraints = validator.validate(clientForm);

        if(constraints.size() > 0){

            for (ConstraintViolation<ClientForm> constraint : constraints) {
                if(constraint.getPropertyPath().toString().equals("email")){

                    request.setAttribute("emailError",constraint.getMessage());
                }
                System.out.println(constraint.getRootBeanClass().getSimpleName()+
                        "." + constraint.getPropertyPath() + " " + constraint.getMessage());
            }
            request.setAttribute("email",email);
            request.getRequestDispatcher("./WEB-INF/pages/Inscriptions.jsp").forward(request,response);
        }else{
            Client client = clientService.add(clientForm);
            response.sendRedirect(request.getContextPath() + "/index.jsp");
        }
    }
}
