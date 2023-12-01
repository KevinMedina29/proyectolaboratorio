<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar empleado</title>
    </head>
    <body>
        <h1>Eliminar empleado</h1>

        <form method="POST" action="/Final/ServletPrincipal?accion=EliminarEmpleado">
            <div>
                <label>ID Empleado: ${item.ID_Empleado}</label><br>
                <label>DUI: ${item.DUI_Empleado}</label><br>
                <label>Nombres: ${item.nombresEmpleado}</label><br>
                <label>Apellidos: ${item.apellidosEmpleado}</label><br>
                <label>Usuario: ${item.ID_Usuario}</label><br>
                <label>Fecha de nacimiento: ${item.fechaNacEmpleado}</label><br>
                <label>Teléfono: ${item.telefono}</label><br>
                <label>Correo: ${item.correo}</label><br>
                <label>Dirección: ${item.direccion}</label>
                <label>ID Cargo: ${item.ID_Cargo}</label><br>   
                <input type="hidden" name="ID_Empleado" id="ID_Empleado" value="${item.ID_Empleado}" /><br><br>
                <input type="submit" value="Eliminar" onclick="return confirm('¿Desea eliminar el empleado?')" /><br><br>
            </div>
            <div>
                <a href="/Final?accion=GestionarEmpleados">Regresar</a><br><br>
            </div>             
        </form>
    </body>
</html>
