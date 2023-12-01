<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestionar Venta</title>
    </head>
    <body>
        <div class="container">
            <h1 class="mt-5">Gestión de Ventas</h1>
            <h2>Listado de Ventas</h2>
            <h3>Conexion: ${mensaje_conexion}</h3><br>

            <div>   
                <a class="btn btn-primary mb-3" href="/Tienda?accion=agregarventas">Agregar Ventas</a><br><br>
            </div>
            <table class="table table-bordered">
                <thead class="thead-dark">
                    <tr>
                        <th>ID Ventas</th>
                        <th>Empleado</th>
                        <th>Cliente</th>
                        <th>Fecha</th>
                        <th>Metodo de Pago</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${listaVentas}" var="item">
                        <tr>
                            <td><c:out value="${item.ID_Venta}" /></td>
                            <td><c:out value="${item.ID_Empleado}" /></td>
                            <td><c:out value="${item.ID_Cliente}" /></td>
                            <td><c:out value="${item.fecha}" /></td>
                            <td><c:out value="${item.ID_Metodo_Pago}" /></td>
                            <td class="text-center">
                                <form method="POST" action="/Tienda/crud/modificar/modificarcargo.jsp">
                                    <input type="hidden" name="ID_Venta" value="${item.ID_Venta}" />
                                    <input type="hidden" name="ID_Cliente" value="${item.ID_Cliente}" />             
                                    <button type="submit" class="btn btn-warning">Modificar</button>
                                </form>    
                                <form method="POST" action="/Tienda/crud/eliminar/eliminarcargo.jsp">
                                    <input type="hidden" name="ID_Venta" value="${item.ID_Venta}" />
                                    <input type="hidden" name="ID_Cliente" value="${item.ID_Cliente}" />             
                                    <button type="submit" class="m-2 btn btn-danger">Eliminar</button>
                                </form>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>            
            </table>
        </div>
        <button onclick="regresar()"> Regresar</button>
        <script>
            function regresar(){
                window.history.back();
            }
        </script>
    </body>
</html>
