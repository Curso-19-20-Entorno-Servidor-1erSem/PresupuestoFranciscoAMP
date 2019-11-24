<%-- 
    Document   : contenido
    Created on : 24-nov-2019, 21:01:38
    Author     : Francisco_Antonio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="CSS/presupuestoStyle.css"/>
        <title>Gestor&iacute;a de Seguros NORMAS - Contenido.</title>
    </head>
    <body>
        <%@include file = "/INC/cabecera.inc" %>
        
        <div id="principal">

            <form action="Contenido" method="post">


                <h1>Detalle de la póliza de contenidos</h1>
                <p>Proporcione la información que necesitamos para hacer los cálculos y pulse enviar</p>
                <br>
                <table border="1">
                    <tr>
                        <td>Cubrir daños accidentales: </td>
                        <td>Cantidad que quiere asegurar: </td>
                        <td>Franquicia: </td>
                        
                    </tr>

                    <tr>
                        <td>
                            <input value="daniosAccidentales" class="checkboxtext" type="checkbox" name="daniosAccidentales"/>
                        </td>
                        
                        <td><select name="cantidadAsegurar" value="">
                                <option value="10000" selected>10.000</option>
                                <option value="20000">20.000</option>
                                <option value="30000">30.000</option>
                                <option value="40000">40.000</option>
                                <option value="50000">50.000</option>
                            </select>
                        </td>
                        <td>
                            <input value="0" name="radio" type="radio" checked/>Ninguna<br/>
                            <input value="500" name="radio" type="radio"/>500<br/>
                            <input value="1000" name="radio" type="radio"/>1.000
                        </td>
                        
                    </tr>
                </table>
                <br><br>
                <button type="submit" name="enviar" value="Enviar"/>Enviar


            </form>

        </div>
        
        <%@include file="/INC/piePagina.inc"%>
    </body>
</html>
