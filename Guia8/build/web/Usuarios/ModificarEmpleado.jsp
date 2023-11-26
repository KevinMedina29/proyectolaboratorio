<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar Empleados</title>
    </head>
    <body>
        <h1>Modificar empleado</h1>
        <form method="POST" action="/Guia8/ServletPrincipal?accion=ModificarEmpleado">
            <div>
                <label>ID Empleado:</label>
                <input type="text" name="ID_Empleado" id="ID_Empleado" value="${param.ID_Empleado}" readonly /><br>
                <label>DUI:</label>
                <input type="text" name="DUI_Empleado" id="DUI_Empleado" value="${param.DUI_Empleado}" required /><br>
                <label>Nombres:</label>
                <input type="text" name="nombresEmpleado" id="nombresEmpleado" value="${param.nombresEmpleado}" required /><br>
                <label>Apellidos:</label>
                <input type="text" name="apellidosEmpleado" id="apellidosEmpleado" value="${param.apellidosEmpleado}" required /><br>
                <label>Usuario:</label>
                <input type="text" name="ID_Usuario" id="ID_Usuario" value="${param.ID_Usuario}" required /><br>
                <label>Fecha de nacimiento:</label>
                <input type="date" name="fechaNacEmpleado" id="fechaNacEmpleado" value="${param.fechaNacEmpleado}" required /><br>
                <label>Teléfono:</label>
                <input type="text" name="telefono" id="telefono" value="${param.telefono}" required /><br>
                <label>Correo:</label>
                <input type="email" name="correo" id="correo" value="${param.correo}" required /><br>
                <label>Dirección:</label>
                <input type="text" name="direccion" id="direccion" value="${param.direccion}" required /><br> 
                <label>ID Cargo:</label>
                <input type="text" name="ID_Cargo" id="ID_Cargo" value="${param.ID_Cargo}" required /><br><br>          
                <input type="submit" value="Modificar" onclick="return confirm('¿Desea modificar el empleado?')" /><br><br> 
            </div>
            <div>
                <a href="/Guia8?accion=GestionEmpleados">Regresar</a><br><br>
            </div>             
        </form>
    </body>
</html>
