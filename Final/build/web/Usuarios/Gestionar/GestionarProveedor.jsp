<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestionar Proveedores</title>
    </head>
    <body>
        <h1>Gestionar Proveedores</h1>
        <h2>Listado de Proveedores</h2><br>
        <h3>Conexion: ${mensaje_conexion}</h3>
        
        <table border="1">
            <thead>
                <tr>
                    <th>ID_Proveedor</th>
                    <th>Nombre</th>
                    <th>Direccion</th>
                    <th>Telefono</th>
                    <th>Correo</th>
                    <th>Notas</th>
                    <!-- AÑADIR COLUMNA DE ACCIONES-->
                    <th>Acciones</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${listaProveedores}" var="item">
                    <tr>
                        <td><c:out value="${item.ID_Proveedor}" /></td>
                        <td><c:out value="${item.nombre}" /></td>                       
                        <td><c:out value="${item.direccion}" /></td>
                        <td><c:out value="${item.telefono}" /></td>
                        <td><c:out value="${item.correo}" /></td> 
                        <td><c:out value="${item.notas}" /></td>
                        <!-- AÑADIR OPCIONES DE MODIFICACION Y ELIMINACION -->
                        <td>
                            <form method="POST" action="/Final/Usuarios/Modificar/ModificarEmpleados.jsp">
                                <input type="hidden" name="ID_Proveedor" value="${item.ID_Proveedor}" />
                                <input type="hidden" name="nombre" value="${item.nombre}" />
                                <input type="hidden" name="direccion" value="${item.direccion}" />
                                <input type="hidden" name="telefono" value="${item.telefono}" />
                                <input type="hidden" name="correo" value="${item.correo}" />
                                <input type="hidden" name="notas" value="${item.notas}" />
                                <input type="submit" value="Modificar" />
                            </form>    
                            <form method="POST" action="/Final/Usuarios/EliminarEmpleado.jsp">
                                <input type="hidden" name="ID_Proveedor" value="${item.ID_Proveedor}" />
                                <input type="hidden" name="nombre" value="${item.nombre}" />
                                <input type="hidden" name="direccion" value="${item.direccion}" />
                                <input type="hidden" name="telefono" value="${item.telefono}" />
                                <input type="hidden" name="correo" value="${item.correo}" />
                                <input type="hidden" name="notas" value="${item.notas}" />
                                <input type="submit" value="Eliminar" />
                            </form>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>            
        </table><br>
        
        
        <button onclick="regresar()"> Regresar</button>
        <script>
            function regresar(){
                window.history.back();
            }
        </script>
    </body>
</html>
