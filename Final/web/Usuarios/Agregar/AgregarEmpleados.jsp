<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Empleados</title>
    </head>
    <body>
        <c:if test="${exito!=null}">
            <c:if test="${exito}">
                <p><strong style="color: darkgreen;">La información se guardó correctamente</strong></p>
            </c:if>
            <c:if test="${!exito}">
                <p><strong style="color: red;">No se guardó la información</strong></p>
            </c:if>
        </c:if>   
        <h1>Agregar nuevo empleado</h1>

        <form method="POST" action="/Final/ServletPrincipal?accion=AgregarEmpleados">
            <div>
                <!-- El ID de los empleados es autoincrementable -->
                <label>DUI:</label>
                <input type="text" name="DUI_Empleado" id="DUI_Empleado" required /><br>
                <label>Nombres:</label>
                <input type="text" name="nombresEmpleado" id="nombresEmpleado" required /><br>
                <label>Apellidos:</label>
                <input type="text" name="apellidosEmpleado" id="apellidosEmpleado" required /><br>
                <label>Usuarios:</label>
                <input type="text" name="ID_Usuario" id="ID_Usuario" required /><br>
                <label>Fecha de nacimiento:</label>
                <input type="date" name="fechaNacEmpleado" id="fechaNacEmpleado" required /><br>
                <label>Teléfono:</label>
                <input type="text" name="telefono" id="telefono" required /><br>
                <label>Correo:</label>
                <input type="email" name="correo" id="correo" required /><br>
                <label>Dirección:</label>
                <input type="text" name="direccion" id="direccion" required /><br>
                <label>ID Cargo:</label>
                <input type="text" name="ID_Cargo" id="ID_Cargo" required /><br><br>                            
                <input type="submit" value="Registrar" onclick="return confirm('¿Desea registrar el empleado?')" /><br><br>
            </div><br>
            <div>
                <a href="/Final?accion=GestionarEmpleados">Regresar</a>
            </div>            
        </form>
    </body>
</html>