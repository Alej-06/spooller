package net.ausiasmarch.controller;

import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import net.ausiasmarch.exception.ResourceNotFoundException;
import net.ausiasmarch.model.UsuarioBean;
import net.ausiasmarch.service.UsuarioService;

@WebServlet("/usuario")
public class UsuarioController extends HttpServlet{

    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, java.io.IOException {
            

            //sacar el id de ususario de la request
           String idParam = request.getParameter("id");
              Long id = Long.valueOf(idParam);
            UsuarioService oUsuarioService = new UsuarioService();

        try {
            UsuarioBean oUsuarioBean = oUsuarioService.get(id);
            request.setAttribute("usuario", oUsuarioBean);
            request.getRequestDispatcher("/usuario.jsp").forward(request, response);
        } catch (SQLException | ResourceNotFoundException ex) {
            //Pendiente de logging y de generar un mensaje adecuado para el usuario
            request.setAttribute("errorMessage", "Error en la base de datos: " + ex.getMessage());
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
              
        
    }

}
