<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page import="java.util.Date"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="POST" action="/Guia8/ServletPrincipal?accion=Login" id="formLogin">
            <div id="resultLogin"></div>
            <div><h1>Bienvenido</h1></div>
            <c:set var="FechaActual" value="<%= new java.util.Date() %>" />
            <c:set var="FormatoFecha" value="dd/MM/YYYY " />
            <div>
                <label>
                    <strong>
                        <c:out value="Fecha Actual: "/>
                        <fmt:formatDate value='${FechaActual}' pattern='${FormatoFecha}' />
                    </strong>
                </label>
            </div><br>
            
            <div><label>Usuario: </label></div>
            <div><input type="text" name="Usuario" id="idtfUsuario"></div><br>
            <div><label>Contraseña: </label></div>
            <div><input type="password" name="Contrasenia" id="idtfContraseña"></div><br>
            <div><input type="submit" value="Iniciar Sesión"></div><br>
        </form>
    </body>
</html>
