<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Panel de Administración - Tienda de Lácteos</title>
</head>
<body>
    <header>
        <h1>Panel de Administración - Tienda de Lácteos</h1>
        <nav>
            <ul>
                <li><a href="#">Productos</a></li>
                <li><a href="#">Categorías</a></li>
                <li><a href="#">Usuarios</a></li>
                <li><a href="#">Pedidos</a></li>
            </ul>
        </nav>
    </header>

    <section class="product-list">
        <h2>Listado de Productos</h2>
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Descripción</th>
                    <th>Precio</th>
                    <th>Acciones</th>
                </tr>
            </thead>
            <tbody>
                <!-- Aquí se listarán los productos desde la base de datos -->
                <tr>
                    <td>1</td>
                    <td>Leche Entera</td>
                    <td>Leche fresca y saludable.</td>
                    <td>$2.99</td>
                    <td>
                        <a href="#">Editar</a>
                        <a href="#">Eliminar</a>
                    </td>
                </tr>
                <tr>
                    <td>2</td>
                    <td>Yogur Natural</td>
                    <td>Yogur cremoso y delicioso.</td>
                    <td>$1.49</td>
                    <td>
                        <a href="#">Editar</a>
                        <a href="#">Eliminar</a>
                    </td>
                </tr>
                <!-- Más productos aquí -->
            </tbody>
        </table>
    </section>

    <section class="add-product">
        <h2>Agregar Producto</h2>
        <form action="procesar_producto.php" method="POST">
            <label for="nombre">Nombre:</label>
            <input type="text" id="nombre" name="nombre" required>

            <label for="descripcion">Descripción:</label>
            <textarea id="descripcion" name="descripcion" required></textarea>

            <label for="precio">Precio:</label>
            <input type="number" id="precio" name="precio" step="0.01" required>

            <button type="submit">Agregar Producto</button>
        </form>
    </section>
    <button onclick="regresar()">Regresar</button>

    <footer>
        &copy; 2023 Tiendas y Rutas de Envío
    </footer>
    <script>
       function regresar() {
           window.history.back();
       }
    </script>
</body>
</html>