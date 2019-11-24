/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.abarregas.controllers;

import es.albarregas.beans.Elecciones;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Francisco_Antonio
 */
@WebServlet(name = "eleccion", urlPatterns = {"/eleccion"})
public class eleccion extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
                String url = null;
        Elecciones eleccion = new Elecciones();
        HttpSession sesion = request.getSession();
        boolean edificio = false;
        boolean contenido = false;

        //volver al index si los dos checkbox están desmarcados
        if (request.getParameter("check1") == null && request.getParameter("check2") == null) {
            url = "/index.jsp";
        } else {
            //comprobar los checkbox por separado
            //checkbox de edificio 
            if (request.getParameter("check1") != null) {
                edificio = true;
                url = "/JSP/edificio.jsp";
            } else {
                edificio = false;
            }

            //checkbox de contenido.
            if (request.getParameter("check2") != null) {
                contenido = true;
            } else {
                contenido = false;
            }
        }

  
        eleccion.setEdificio(edificio);
        eleccion.setContenido(contenido);
        

        if(eleccion.getEdificio() && !eleccion.getContenido()){ 
            url = "/JSP/edificio.jsp";
        } else if(!eleccion.getEdificio() && eleccion.getContenido()){
            url = "/JSP/contenido.jsp";
        }

        sesion.setAttribute("eleccion", eleccion);

        request.getRequestDispatcher(url).forward(request, response);
    }


}
