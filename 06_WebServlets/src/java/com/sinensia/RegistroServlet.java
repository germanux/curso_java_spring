package com.sinensia;

import com.sinensia.modelo.MySQLCliente;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Los servlets heredan de la clase HttpServlet
 *
 * @author Admin - German
 */
public class RegistroServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest peticion,
            HttpServletResponse respuesta)
            throws ServletException, IOException {
        respuesta.setContentType("text/html;charset=UTF-8");
        try (PrintWriter salida = respuesta.getWriter()) {
            salida.println("<html><head>");
            salida.println("<title>Web servlet desde Java</title>");
            salida.println("</head><body>");
            salida.println("<h1>Respuesta al registro</h1>");
            salida.println("<h2>Ruta del servlet: "
                    + peticion.getContextPath() + ", metodo: "
                    + peticion.getMethod() + "</h2>");
            salida.println("<ul>");
            for (int i = 0; i < 3; i++) {
                salida.println("<li>Num " + i + "</li>");
            }
            salida.println("</ul>");
            
            String nombre = peticion.getParameter("nombre");
            String strEdad = peticion.getParameter("edad");
            int edad = Integer.parseInt(strEdad);
            String email = peticion.getParameter("email");
            String strActivo = peticion.getParameter("activo");
            boolean activo = false;
            if (strActivo != null)  
                activo = true;
            // boolean activo = strActivo != null;
            
            salida.println("<p>nombre = " + nombre + "</p>");
            salida.println("<p>edad = " + edad+ "</p>");
            salida.println("<p>email = " + email+ "</p>");
            salida.println("<p>activo = " + activo+ "</p>");
            
            MySQLCliente bdCliente = new MySQLCliente();
            if (bdCliente.crear(nombre, email, "Passwd1234", edad, activo)) {                
                salida.println("<p>Guardado correctamente</p>");
            } else {
                salida.println("<p>Guardado ERRONEAMENTE</p>");
            }
            
            salida.println("</body></html>");
            salida.println("");
            salida.println("");
        }
    }

    @Override
    public String getServletInfo() {
        return "Registro clientes";
    }
}
