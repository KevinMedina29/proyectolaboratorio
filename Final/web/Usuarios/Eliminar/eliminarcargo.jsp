<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar Cargo</title>
    </head>
    <body>
        <h1>Eliminar Cargo</h1>
        
        <form method="POST" action="/Final/ServletPrincipal?accion=eliminarcargos">
            <div>
                <label>ID.empleado: ${param.ID_Cargo}</label><br>
                <label>cargo ${param.ID_Cargo}</label>
                
                <input type="hidden" name="ID_Cargo" id="id_cargo" value="${param.ID_Cargo}"><br><br>
                <input type="submit" value="Eliminar" onclick="return confirm('¿Desea eliminar el cargo?')" /><br><br>
            </div>
                <div>
                    <a href="/Final?accion=gestionarcargos">Regresar</a><br><br>
                </div>
        </form>
    </body>
</html>
