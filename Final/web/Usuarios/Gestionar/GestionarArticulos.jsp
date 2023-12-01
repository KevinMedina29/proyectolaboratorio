<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <h1 class="mt-5">Gestión de Articulos</h1>
            <h2>Listado de Productos</h2>
            <h3>Conexion: ${mensaje_conexion}</h3><br>

            <div>
                <button class="btn btn-primary mb-3" onclick="regresar()">Regresar</button>    
                <a class="btn btn-primary mb-3" href="/Tienda_1?accion=AgregarCargo">Agregar Productos</a><br><br>
            </div>
            <table class="table table-bordered">
                <thead class="thead-dark">
                    <tr>
                        <th>ID Articulo</th>
                        <th>Articulo</th>
                        <th>Descripcion</th>
                        <th>Precio</th>
                        <th>ID Proveedor</th>
                        <th>ID Subcategoria</th>
                        <th>ID Categoria</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${listaArticulos}" var="item">
                        <tr>
                            <td><c:out value="${item.ID_Articulo}" /></td>
                            <td><c:out value="${item.codigo}" /></td>
                            <td><c:out value="${item.descripcion}" /></td>
                            <td><c:out value="${item.precio}" /></td>
                            <td><c:out value="${item.ID_Subcategoria}" /></td>
                            <td><c:out value="${item.ID_Proveedor}" /></td>
                            <td><c:out value="${item.ID_Categoria}" /></td>
                            <td class="text-center">
                                <form method="POST" action="/Final/Usuarios/Modificar/ModificarCargo.jsp">
                                    <input type="hidden" name="id_Articulo" value="${item.id_Articulo}" />
                                    <input type="hidden" name="Codigo" value="${item.Codigo}" />             
                                    <button type="submit" class="btn btn-warning">Modificar</button>
                                </form>    
                                <form method="POST" action="/Final/Usuarios/Eliminar/EliminarCargo.jsp">
                                    <input type="hidden" name="id_Articulo" value="${item.id_Articulo}" />
                                    <input type="hidden" name="Codigo" value="${item.Codigo}" />             
                                    <button type="submit" class="m-2 btn btn-danger">Eliminar</button>
                                </form>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>            
            </table>
        </div>
        <script>
            function regresar(){
                window.history.back();
            }
        </script>
    </body>
</html>
