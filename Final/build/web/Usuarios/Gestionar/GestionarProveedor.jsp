<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestion de Proveedores</title>
    </head>
    <body>
            <h1>Gestión de Proveedores</h1>
            <h2>Listado de Proveedores</h2>
            <h3>Conexion: ${mensaje_conexion}</h3><br>

               
            <a href="/Tienda?accion=agregarproveedores">Agregar Proveedor</a><br><br>
            
            <table border="1">
                <thead>
                    <tr>
                        <th>ID Proveedores</th>
                        <th>Nombres</th>
                        <th>Telefono</th>
                        <th>direccion</th>
                        <th>Correo</th>
                        <th>Notas</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${listaProveedores}" var="item">
                        <tr>
                            <td><c:out value="${item.ID_Proveedor}" /></td>
                            <td><c:out value="${item.nombre}" /></td>
                            <td><c:out value="${item.telefono}" /></td>
                            <td><c:out value="${item.direccion}" /></td>
                            <td><c:out value="${item.correo}" /></td>
                            <td><c:out value="${item.notas}" /></td>
                            <td>
                                <form method="POST" action="/Tienda/crud/modificar/modificarproveedor.jsp">
                                    <input type="hidden" name="ID_Proveedor" value="${item.ID_Proveedor}" />
                                    <input type="hidden" name="nombre" value="${item.nombre}" />             
                                    <input type="submit" value="Modificar" />
                                </form>    
                                <form method="POST" action="/Tienda/crud/eliminar/eliminarproveedor.jsp">
                                    <input type="hidden" name="ID_Proveedor" value="${item.ID_Proveedor}" />
                                    <input type="hidden" name="nombre" value="${item.nombre}" />             
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
