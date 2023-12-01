<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar Empleados</title>
    </head>
    <body>
        <h1>Modificar empleado</h1>
        <form method="POST" action="/Final/ServletPrincipal?accion=ModificarEmpleado">
            <div>
                <label>ID Empleado:</label>
                <input type="text" name="ID_Empleado" id="ID_Empleado" value="${item.ID_Empleado}" readonly /><br>
                <label>DUI:</label>
                <input type="text" name="DUI_Empleado" id="DUI_Empleado" value="${item.DUI_Empleado}" required /><br>
                <label>Nombres:</label>
                <input type="text" name="nombresEmpleado" id="nombresEmpleado" value="${item.nombresEmpleado}" required /><br>
                <label>Apellidos:</label>
                <input type="text" name="apellidosEmpleado" id="apellidosEmpleado" value="${item.apellidosEmpleado}" required /><br>
                <label>Usuario:</label>
                <input type="text" name="ID_Usuario" id="ID_Usuario" value="${item.ID_Usuario}" required /><br>
                <label>Fecha de nacimiento:</label>
                <input type="date" name="fechaNacEmpleado" id="fechaNacEmpleado" value="${item.fechaNacEmpleado}" required /><br>
                <label>Teléfono:</label>
                <input type="text" name="telefono" id="telefono" value="${item.telefono}" required /><br>
                <label>Correo:</label>
                <input type="email" name="correo" id="correo" value="${item.correo}" required /><br>
                <label>Dirección:</label>
                <input type="text" name="direccion" id="direccion" value="${item.direccion}" required /><br> 
                <label>ID Cargo:</label>
                <input type="text" name="ID_Cargo" id="ID_Cargo" value="${item.ID_Cargo}" required /><br><br>          
                <input type="submit" value="Modificar" onclick="return confirm('¿Desea modificar el empleado?')" /><br><br> 
            </div>
            <div>
                <a href="/Final?accion=GestionarEmpleados">Regresar</a><br><br>
            </div>             
        </form>
    </body>
</html>
