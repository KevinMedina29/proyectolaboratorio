package servlet;

//importaciones de servlet
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//import librerias de conexion con BD
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//import de modelos
import models.viewmodelReservas;
import models.viewmodelarticulos;
import models.viewmodelcargo;
import models.viewmodelcarritocompras;
import models.viewmodelclientes;
import models.viewmodeldetalleingreso;
import models.viewmodeldetalleventa;
import models.viewmodelempleados;
import models.viewmodelenvios;
import models.viewmodelexistencias;
import models.viewmodelingreso;
import models.viewmodelmetodospago;
import models.viewmodelproveedores;
import models.viewmodelusuarios;
import models.viewmodelventa;

public class Servletprincipal extends HttpServlet {

    //Estableciendo conexion con la BD
    private final String usuario = "sa";
    private final String contrasenia = "123456";
    private final String servidor = "localhost:1433";
    private final String bd = "TiendaLacteos"; 
    String url = "jdbc:sqlserver://"
    + servidor 
    + ";databaseName=" + bd 
    + ";user=" + usuario 
    + ";password=" + contrasenia 
    + ";encrypt=false;trustServerCertificate=false;";
//Funciones del CRUD sobre la base de datos
    //FUNCIONES DE SELECT
    //Cargos
    public void mostrarCargos(HttpServletRequest request, HttpServletResponse response) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            try (Connection conn = DriverManager.getConnection(url)) {
                request.setAttribute("mensaje_conexion", "Ok!");
                String sqlQuery = "select * from Cargo";
                PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
                ResultSet rs = pstmt.executeQuery();

                ArrayList<viewmodelcargo> listaCargos = new ArrayList<>();

                while (rs.next()) {
                    viewmodelcargo cargo = new viewmodelcargo();
                    cargo.setID_Cargo(rs.getInt("ID_Cargo"));
                    cargo.setNombre_Cargo(rs.getString("Nombre_Cargo"));
                    listaCargos.add(cargo);
                }
                request.setAttribute("listaCargos", listaCargos);

            }
        } catch (SQLException | ClassNotFoundException ex) {
            request.setAttribute("mensaje_conexion", ex.getMessage());
            ex.printStackTrace();
        }
    }//Fin de cargos

    //empleados
    public void mostrarEmpleados(HttpServletRequest request, HttpServletResponse response) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            try (Connection conn = DriverManager.getConnection(url)) {
                request.setAttribute("mensaje_conexion", "Ok!");
                String sqlQuery = "select * from Empleados";
                PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
                ResultSet rs = pstmt.executeQuery();

                ArrayList<viewmodelempleados> listaEmpleados = new ArrayList<>();

                while (rs.next()) {
                    viewmodelempleados empleado = new viewmodelempleados();
                    empleado.setID_Empleado(rs.getInt("ID_Empleado"));
                    empleado.setDUI_Empleado(rs.getString("DUI_Empleado"));
                    empleado.setNombresEmpleado(rs.getString("nombresEmpleado"));
                    empleado.setApellidosEmpleado(rs.getString("apellidosEmpleado"));
                    empleado.setID_Usuario(rs.getInt("ID_Usuario"));
                    empleado.setFechaNacEmpleado(rs.getDate("fechaNacEmpleado"));
                    empleado.setTelefono(rs.getString("telefono"));
                    empleado.setCorreo(rs.getString("correo"));
                    empleado.setDireccion(rs.getString("direccion"));
                    empleado.setID_Cargo(rs.getInt("ID_Cargo"));

                    listaEmpleados.add(empleado);
                }
                request.setAttribute("listaEmpleados", listaEmpleados);

            }
        } catch (SQLException | ClassNotFoundException ex) {
            request.setAttribute("mensaje_conexion", ex.getMessage());
            ex.printStackTrace();
        }
    }//fin de empleados
    //Usuarios
    public void mostrarUsuarios(HttpServletRequest request, HttpServletResponse response) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            try (Connection conn = DriverManager.getConnection(url)) {
                request.setAttribute("mensaje_conexion", "Ok!");
                String sqlQuery = "select * from  Usuarios";
                PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
                ResultSet rs = pstmt.executeQuery();

                ArrayList<viewmodelusuarios> listaUsuarios = new ArrayList<>();

                while (rs.next()) {
                    viewmodelusuarios user = new viewmodelusuarios();
                    user.setID_Usuario(rs.getInt("ID_Usuario"));
                    user.setID_Rol(rs.getInt("ID_Rol"));
                    user.setUsuario(rs.getString("usuario"));
                    user.setClave(rs.getString("clave"));
                    listaUsuarios.add(user);
                }
                request.setAttribute("listaUsuarios", listaUsuarios);

            }
        } catch (SQLException | ClassNotFoundException ex) {
            request.setAttribute("mensaje_conexion", ex.getMessage());
            ex.printStackTrace();
        }
    }// fin de usuarios
    
    //Clientes
    public void mostrarClientes(HttpServletRequest request, HttpServletResponse response) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            try (Connection conn = DriverManager.getConnection(url)) {
                request.setAttribute("mensaje_conexion", "Ok!");
                String sqlQuery = "select * from  Clientes";
                PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
                ResultSet rs = pstmt.executeQuery();

                ArrayList<viewmodelclientes> listaClientes = new ArrayList<>();

                while (rs.next()) {
                    viewmodelclientes cliente = new viewmodelclientes();
                    cliente.setID_Cliente(rs.getInt("ID_Cliente"));
                    cliente.setDUI_Cliente(rs.getString("DUI_Cliente"));
                    cliente.setNombresCliente(rs.getString("nombresCliente"));
                    cliente.setApellidosCliente(rs.getString("apellidosCliente"));
                    cliente.setID_Usuario(rs.getInt("ID_Usuario"));
                    cliente.setTelefono(rs.getString("telefono"));
                    cliente.setCorreo(rs.getString("correo"));
                    cliente.setID_Direccion(rs.getInt("ID_Direccion"));
                    listaClientes.add(cliente);
                }
                request.setAttribute("listaClientes", listaClientes);

            }
        } catch (SQLException | ClassNotFoundException ex) {
            request.setAttribute("mensaje_conexion", ex.getMessage());
            ex.printStackTrace();
        }
    }// fin de Clientes
    //Fin Clientes
    ///Existencias
    public void mostrarExistencias(HttpServletRequest request, HttpServletResponse response) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            try (Connection conn = DriverManager.getConnection(url)) {
                request.setAttribute("mensaje_conexion", "Ok!");
                String sqlQuery = "select * from ExistenciaProducto";
                PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
                ResultSet rs = pstmt.executeQuery();

                ArrayList<viewmodelexistencias> listaExistencias = new ArrayList<>();

                while (rs.next()) {
                    viewmodelexistencias existencias = new viewmodelexistencias();
                    existencias.setID_Existencia(rs.getInt("ID_Existencia"));
                    existencias.setID_Articulo(rs.getInt("ID_Articulo"));
                    existencias.setCantidad(rs.getInt("cantidad"));
                    existencias.setFechaIngreso(rs.getDate("fechaIngreso"));
                    existencias.setUbicacion(rs.getString("ubicacion"));
                    existencias.setPrecioCompra(rs.getString("precioCompra"));
                    existencias.setPrecioVenta(rs.getString("precioVenta"));
                    existencias.setEstado(rs.getString("estado"));
                }
                request.setAttribute("listaExistencias", listaExistencias);

            }
        } catch (SQLException | ClassNotFoundException ex) {
            request.setAttribute("mensaje_conexion", ex.getMessage());
            ex.printStackTrace();
        }
    }//Fin existencias
    
    //Inicio Articulos
    public void mostrarArticulo(HttpServletRequest request, HttpServletResponse response) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            try (Connection conn = DriverManager.getConnection(url)) {
                request.setAttribute("mensaje_conexion", "Ok!");
                String sqlQuery = "select * from Articulo";
                PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
                ResultSet rs = pstmt.executeQuery();

                ArrayList<viewmodelarticulos> listaArticulos = new ArrayList<>();

                while (rs.next()) {
                    viewmodelarticulos articulo = new viewmodelarticulos();
                    articulo.setID_Articulo(rs.getInt("ID_Articulo"));
                    articulo.setID_Categoria(rs.getInt("ID_Categoria"));
                    articulo.setID_Subcategoria(rs.getInt("ID_Subcategoria"));
                    articulo.setCodigo(rs.getString("codigo"));
                    articulo.setPrecio_Venta(rs.getDouble("Precio_Venta"));
                    articulo.setFecha_Vencimiento(rs.getDate("Fecha_Vencimiento"));
                    articulo.setDescripcion(rs.getString("descrpcion"));
                    articulo.setImagen(rs.getString("imagen"));
                    articulo.setEstado(rs.getInt("estado"));
                    articulo.setID_Proveedor(rs.getInt("ID_Proveedor"));

                    listaArticulos.add(articulo);
                }
                request.setAttribute("listaArticulos", listaArticulos);

            }
        } catch (SQLException | ClassNotFoundException ex) {
            request.setAttribute("mensaje_conexion", ex.getMessage());
            ex.printStackTrace();
        }
    }
    //Fin articulos
    //Reserva
    public void mostrarReserva(HttpServletRequest request, HttpServletResponse response) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            try (Connection conn = DriverManager.getConnection(url)) {
                request.setAttribute("mensaje_conexion", "Ok!");
                String sqlQuery = "select * from  Reservas";
                PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
                ResultSet rs = pstmt.executeQuery();

                ArrayList<viewmodelReservas> listaReservas = new ArrayList<>();

                while (rs.next()) {
                    viewmodelReservas reservas = new viewmodelReservas();
                    reservas.setID_Reserva(rs.getInt("ID_Reserva"));
                    reservas.setID_Cliente(rs.getInt("ID_Cliente"));
                    reservas.setFechaInicio(rs.getDate("fechaInicio"));
                    reservas.setFechaFin(rs.getDate("fechaFin"));
                    reservas.setEstado(rs.getString("estado"));
                    reservas.setNotas(rs.getString("notas"));
                    listaReservas.add(reservas);
                }
                request.setAttribute("listaReservas", listaReservas);

            }
        } catch (SQLException | ClassNotFoundException ex) {
            request.setAttribute("mensaje_conexion", ex.getMessage());
            ex.printStackTrace();
        }
    }
    //Fin Reserva
    //Inicio Ingreso
    public void mostrarIngreso(HttpServletRequest request, HttpServletResponse response) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            try (Connection conn = DriverManager.getConnection(url)) {
                request.setAttribute("mensaje_conexion", "Ok!");
                String sqlQuery = "select * from Ingreso";
                PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
                ResultSet rs = pstmt.executeQuery();

                ArrayList<viewmodelingreso> listaIngreso = new ArrayList<>();

                while (rs.next()) {
                    viewmodelingreso compra = new viewmodelingreso();
                    compra.setId_Compra(rs.getInt("Id_Compra"));
                    compra.setProveedor(rs.getString("Proveedor"));
                    compra.setNombreCompra(rs.getString("NombreCompra"));
                    compra.setFecha_Compra(rs.getDate("Fecha_Compra"));
                    compra.setTotal(rs.getDouble("Total"));
                    compra.setEstado(rs.getString("Estado"));
                    compra.setId_Empleado(rs.getInt("Id_Empleado"));
                    compra.setDescripcionCompra(rs.getString("DescripcionCompra"));

                    listaIngreso.add(compra);
                }
                request.setAttribute("listaIngreso", listaIngreso);

            }
        } catch (SQLException | ClassNotFoundException ex) {
            request.setAttribute("mensaje_conexion", ex.getMessage());
            ex.printStackTrace();
        }
    }
    //fin compras
    // inicio  Detalles de compra
    public void mostrarDetallesCompra(HttpServletRequest request, HttpServletResponse response) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            try (Connection conn = DriverManager.getConnection(url)) {
                request.setAttribute("mensaje_conexion", "Ok!");
                String sqlQuery = "select * from DetalleIngreso";
                PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
                ResultSet rs = pstmt.executeQuery();

                ArrayList<viewmodeldetalleingreso> listaDetalleIngreso = new ArrayList<>();

                while (rs.next()) {
                    viewmodeldetalleingreso detalleCompra = new viewmodeldetalleingreso();
                    detalleCompra.setId_DetalleCompra(rs.getInt("Id_DetalleCompra"));
                    detalleCompra.setId_Compra(rs.getInt("Id_Compra"));
                    detalleCompra.setCantidad(rs.getInt("Cantidad"));
                    detalleCompra.setPrecioUnitario(rs.getDouble("PrecioUnitario"));
                    detalleCompra.setEstadoCompra(rs.getString("EstadoCompra"));
                    detalleCompra.setTotal(rs.getDouble("Total"));
                    listaDetalleIngreso.add(detalleCompra);
                }
                request.setAttribute("listaDetalleIngreso", listaDetalleIngreso);

            }
        } catch (SQLException | ClassNotFoundException ex) {
            request.setAttribute("mensaje_conexion", ex.getMessage());
            ex.printStackTrace();
        }
    }
    //fin detalles de compra
    // inicio metodos de pago
    public void mostrarMetodosPago(HttpServletRequest request, HttpServletResponse response) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            try (Connection conn = DriverManager.getConnection(url)) {
                request.setAttribute("mensaje_conexion", "Ok!");
                String sqlQuery = "select * from  MetodoPago";
                PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
                ResultSet rs = pstmt.executeQuery();

                ArrayList<viewmodelmetodospago> listaMetodosPago = new ArrayList<>();

                while (rs.next()) {
                    viewmodelmetodospago metodoPago = new viewmodelmetodospago();
                    metodoPago.setIdMetodoPago(rs.getInt("Id_Metodo_Pago"));
                    metodoPago.setMetodo(rs.getString("Metodo"));

                    listaMetodosPago.add(metodoPago);
                }
                request.setAttribute("listaMetodosPago", listaMetodosPago);

            }
        } catch (SQLException | ClassNotFoundException ex) {
            request.setAttribute("mensaje_conexion", ex.getMessage());
            ex.printStackTrace();
        }
    }
    //fin metodos de pago
    //inicio de pagos
    public void mostrarPagos(HttpServletRequest request, HttpServletResponse response) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            try (Connection conn = DriverManager.getConnection(url)) {
                request.setAttribute("mensaje_conexion", "Ok!");
                String sqlQuery = "select * from  Ventas.Pagos";
                PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
                ResultSet rs = pstmt.executeQuery();

                ArrayList<ViewModelPagos> listaPagos = new ArrayList<>();

                while (rs.next()) {
                    ViewModelPagos pago = new ViewModelPagos();
                    pago.setId_Pago(rs.getInt("Id_Pago"));
                    pago.setId_MetodoPago(rs.getInt("Id_MetodoPago"));
                    pago.setMonto(rs.getDouble("Monto"));
                    pago.setFechaPago(rs.getDate("FechaPago"));
                    listaPagos.add(pago);
                }
                request.setAttribute("listaPagos", listaPagos);

            }
        } catch (SQLException | ClassNotFoundException ex) {
            request.setAttribute("mensaje_conexion", ex.getMessage());
            ex.printStackTrace();
        }
    }
    //fin de pagos
    //inicio Ventas
    public void mostrarVentas(HttpServletRequest request, HttpServletResponse response) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            try (Connection conn = DriverManager.getConnection(url)) {
                request.setAttribute("mensaje_conexion", "Ok!");
                String sqlQuery = "select * from  Ventas.Venta";
                PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
                ResultSet rs = pstmt.executeQuery();

                ArrayList<viewmodelventa> listaVentas = new ArrayList<>();

                while (rs.next()) {
                    viewmodelventa venta = new viewmodelventa();
                    venta.setId_Venta(rs.getInt("Id_Venta"));
                    venta.setId_Cliente(rs.getInt("Id_Cliente"));
                    venta.setId_Usuario(rs.getInt("Id_Usuario"));
                    venta.setId_Pago(rs.getInt("Id_Pago"));
                    venta.setFechaVenta(rs.getDate("FechaVenta"));
                    listaVentas.add(venta);
                }
                request.setAttribute("listaVentas", listaVentas);

            }
        } catch (SQLException | ClassNotFoundException ex) {
            request.setAttribute("mensaje_conexion", ex.getMessage());
            ex.printStackTrace();
        }
    }
    //fin de ventas
    //Inicio de Carritos
    public void mostrarCarrito(HttpServletRequest request, HttpServletResponse response) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            try (Connection conn = DriverManager.getConnection(url)) {
                request.setAttribute("mensaje_conexion", "Ok!");
                String sqlQuery = "select * from  CarritoCompras";
                PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
                ResultSet rs = pstmt.executeQuery();

                ArrayList<viewmodelcarritocompras> listaCarrito = new ArrayList<>();

                while (rs.next()) {
                    viewmodelcarritocompras carritoCompras = new viewmodelcarritocompras();
                    carritoCompras.setId_Carrito(rs.getInt("Id_Carrito"));
                    carritoCompras.setId_Producto(rs.getInt("Id_Producto"));
                    carritoCompras.setId_Venta(rs.getInt("Id_Venta"));
                    carritoCompras.setCantidad(rs.getInt("Cantidad"));
                    carritoCompras.setFechaAgregado(rs.getDate("FechaAgregado"));
                    listaCarrito.add(carritoCompras);
                }
                request.setAttribute("listaCarrito", listaCarrito);

            }
        } catch (SQLException | ClassNotFoundException ex) {
            request.setAttribute("mensaje_conexion", ex.getMessage());
            ex.printStackTrace();
        }
    }
    //Fin de Carritos
    //Inicio Detalles de venta
    public void mostrarDetallesVenta(HttpServletRequest request, HttpServletResponse response) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            try (Connection conn = DriverManager.getConnection(url)) {
                request.setAttribute("mensaje_conexion", "Ok!");
                String sqlQuery = "select * from  Ventas.DetalleVenta";
                PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
                ResultSet rs = pstmt.executeQuery();

                ArrayList<viewmodeldetalleventa> listaDetalleVenta = new ArrayList<>();

                while (rs.next()) {
                    viewmodeldetalleventa detalleVenta = new viewmodeldetalleventa();
                    detalleVenta.setId_DetalleVenta(rs.getInt("Id_DetalleVenta"));
                    detalleVenta.setId_Venta(rs.getInt("Id_Venta"));
                    detalleVenta.setId_Carrito(rs.getInt("Id_Carrito"));
                    detalleVenta.setId_Producto(rs.getInt("Id_Producto"));
                    detalleVenta.setCantidad(rs.getInt("Cantidad"));
                    detalleVenta.setPrecioUnitario(rs.getDouble("PrecioUnitario"));
                    detalleVenta.setTotal(rs.getDouble("Total"));

                    listaDetalleVenta.add(detalleVenta);
                }
                request.setAttribute("listaDetalleVenta", listaDetalleVenta);

            }
        } catch (SQLException | ClassNotFoundException ex) {
            request.setAttribute("mensaje_conexion", ex.getMessage());
            ex.printStackTrace();
        }
    }
    //Fin detalle de ventas
    
    //FUNCIONES DE INSERT ------------------------------------------------------------
    //Empleados Insert
    public void agregarEmpleado(HttpServletRequest request, HttpServletResponse response) {
        //CAPTURA DE VARIABLES

        //El ID de los empleados es autoincrementable
        String DUI_Empleado = request.getParameter("DUI_Empleado");
        String nombresEmpleado = request.getParameter("NombresEmpleado");
        String apellidosEmpleado = request.getParameter("ApellidosEmpleado");
        String fechaNacEmpleado = request.getParameter("FechaNacEmpleado");
        String telefonoEmpleado = request.getParameter("Telefono");
        String correo = request.getParameter("Correo");
        String ID_Cargo = request.getParameter("ID_Cargo");
        String Direccion = request.getParameter("Direccion");

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection conn = DriverManager.getConnection(url)) {
                request.setAttribute("mensaje_conexion", "Ok!");
                String sql = "insert into Empleados values (?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, DUI_Empleado);
                pstmt.setString(3, nombresEmpleado);
                pstmt.setString(4, apellidosEmpleado);
                pstmt.setString(5, fechaNacEmpleado);
                pstmt.setString(6, telefonoEmpleado);
                pstmt.setString(7, correo);
                pstmt.setString(8, ID_Cargo);
                pstmt.setString(9, Direccion);
                int registros = pstmt.executeUpdate();
                if (registros > 0) {
                    request.getSession().setAttribute("exito", true);
                } else {
                    request.getSession().setAttribute("exito", false);
                }
            }
        } catch (SQLException | ClassNotFoundException ex) {
            request.getSession().setAttribute("exito", false);
            ex.printStackTrace();
        }
    }
    //FIn Empleados Insert
    //Cargo Insert
    public void agregarCargo(HttpServletRequest request, HttpServletResponse response) {
        String Cargo = request.getParameter("Cargo");

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection conn = DriverManager.getConnection(url)) {
                request.setAttribute("mensaje_conexion", "Ok!");
                String sql = "insert into Cargos values ( ? )";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, Cargo);

                int registros = pstmt.executeUpdate();
                if (registros > 0) {
                    request.getSession().setAttribute("exito", true);
                } else {
                    request.getSession().setAttribute("exito", false);
                }
            }
        } catch (SQLException | ClassNotFoundException ex) {
            request.getSession().setAttribute("exito", false);
            ex.printStackTrace();
        }
    }
    //Fin Cargo Insert
    //Usuario Insert
    public void agregarUsuario(HttpServletRequest request, HttpServletResponse response) {

        String id_Empleado = request.getParameter("id_Empleado");
        String Id_Rol = request.getParameter("id_Rol");
        String Usuario = request.getParameter("usuario");
        String Clave = request.getParameter("clave");

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection conn = DriverManager.getConnection(url)) {
                request.setAttribute("mensaje_conexion", "Ok!");
                String sql = "insert into Usuarios values ( ?,?,?,? )";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, id_Empleado);
                pstmt.setString(2, Id_Rol);
                pstmt.setString(3, Usuario);
                pstmt.setString(4, Clave);

                int registros = pstmt.executeUpdate();
                if (registros > 0) {
                    request.getSession().setAttribute("exito", true);
                } else {
                    request.getSession().setAttribute("exito", false);
                }
            }
        } catch (SQLException | ClassNotFoundException ex) {
            request.getSession().setAttribute("exito", false);
            ex.printStackTrace();
        }
    }
    //Fin Usuario Insert
    //Cliente Insert
    public void agregarCliente(HttpServletRequest request, HttpServletResponse response) {

        String nombresCliente = request.getParameter("nombresCliente");
        String apellidosCliente = request.getParameter("apellidosCliente");
        String dui_Cliente = request.getParameter("dui_Cliente");
        String telefono = request.getParameter("telefono");
        String correo = request.getParameter("correo");
        String id_Direccion = request.getParameter("id_Direccion");
        String Usuario = request.getParameter("usuario");
        String Clave = request.getParameter("clave");

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection conn = DriverManager.getConnection(url)) {
                request.setAttribute("mensaje_conexion", "Ok!");
                String sql = "insert into Clientes values ( ?, ?, ?, ?, ?, ?, ?, ? )";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, nombresCliente);
                pstmt.setString(2, apellidosCliente);
                pstmt.setString(3, dui_Cliente);
                pstmt.setString(4, telefono);
                pstmt.setString(5, correo);
                pstmt.setString(6, id_Direccion);
                pstmt.setString(7, Usuario);
                pstmt.setString(8, Clave);

                int registros = pstmt.executeUpdate();
                if (registros > 0) {
                    request.getSession().setAttribute("exito", true);
                } else {
                    request.getSession().setAttribute("exito", false);
                }
            }
        } catch (SQLException | ClassNotFoundException ex) {
            request.getSession().setAttribute("exito", false);
            ex.printStackTrace();
        }
    }
    //Fin Cliente Insert
    
    
    //FUNCIONES DE UPDATE-------------------------------------------------------------------
    //Update Empleado
    public void modificarEmpleado(HttpServletRequest request, HttpServletResponse response) {
        //CAPTURA DE VARIABLES
        String Id_Empleado = request.getParameter("Id_Empleado");
        String DUI_Empleado = request.getParameter("DUI_Empleado");
        String nombresEmpleado = request.getParameter("nombresEmpleado");
        String apellidosEmpleado = request.getParameter("apellidosEmpleado");
        String fechaNacEmpleado = request.getParameter("fechaNacEmpleado");
        String telefonoEmpleado = request.getParameter("telefonoEmpleado");
        String correo = request.getParameter("correo");
        String ID_Cargo = request.getParameter("ID_Cargo");
        String ID_Direccion = request.getParameter("ID_Direccion");

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection conn = DriverManager.getConnection(url)) {
                request.setAttribute("mensaje_conexion", "Ok!");

                String sql = "update Empleados set "
                        + "DUI_Empleado='" + DUI_Empleado + "', "
                        + "NombresEmpleado='" + nombresEmpleado + "', "
                        + "ApellidosEmpleado='" + apellidosEmpleado + "', "
                        + "FechaNacEmpleado='" + fechaNacEmpleado + "', "
                        + "Telefono='" + telefonoEmpleado + "', "
                        + "Correo='" + correo + "', "
                        + "Id_Cargo='" + ID_Cargo + "', "
                        + "Id_Direccion='" + ID_Direccion + "' "
                        + "where Id_Empleado='" + Id_Empleado + "'";

                PreparedStatement pstmt = conn.prepareStatement(sql);
                int registros = pstmt.executeUpdate();
                if (registros > 0) {
                    request.getSession().setAttribute("exito", true);
                } else {
                    request.getSession().setAttribute("exito", false);
                }
            }
        } catch (SQLException | ClassNotFoundException ex) {
            request.getSession().setAttribute("exito", false);
            ex.printStackTrace();
        }
    }
    //fin Update Empleado
    //Update Usuario
    public void modificarUsuario(HttpServletRequest request, HttpServletResponse response) {
        //CAPTURA DE VARIABLES
        String Id_Usuario = request.getParameter("id_Usuario");
        String Id_Empleado = request.getParameter("id_Empleado");
        String Id_Rol = request.getParameter("id_Rol");
        String Usuario = request.getParameter("usuario");
        String clave = request.getParameter("clave");

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection conn = DriverManager.getConnection(url)) {
                request.setAttribute("mensaje_conexion", "Ok!");

                String sql = "update Usuarios set "
                        + "Id_Empleado='" + Id_Empleado + "', "
                        + "Id_Rol='" + Id_Rol + "', "
                        + "Usuario='" + Usuario + "', "
                        + "Clave='" + clave + "' "
                        + "where ID_Usuario='" + Id_Usuario + "'";

                PreparedStatement pstmt = conn.prepareStatement(sql);
                int registros = pstmt.executeUpdate();
                if (registros > 0) {
                    request.getSession().setAttribute("exito", true);
                } else {
                    request.getSession().setAttribute("exito", false);
                }
            }
        } catch (SQLException | ClassNotFoundException ex) {
            request.getSession().setAttribute("exito", false);
            ex.printStackTrace();
        }
    }
    //Fin Update Usuario
    //Inicio Update Cargo
    public void modificarCargo(HttpServletRequest request, HttpServletResponse response) {
        //CAPTURA DE VARIABLES
        String Id_Cargo = request.getParameter("ID_Cargo");
        String Cargo = request.getParameter("Nombre_Cargo");

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection conn = DriverManager.getConnection(url)) {
                request.setAttribute("mensaje_conexion", "Ok!");

                String sql = "update Cargos set "
                        + "Nombre_Cargo='" + Cargo + "'"
                        + "Where ID_Cargo ='" + Id_Cargo + "'";

                PreparedStatement pstmt = conn.prepareStatement(sql);
                int registros = pstmt.executeUpdate();
                if (registros > 0) {
                    request.getSession().setAttribute("exito", true);
                } else {
                    request.getSession().setAttribute("exito", false);
                }
            }
        } catch (SQLException | ClassNotFoundException ex) {
            request.getSession().setAttribute("exito", false);
            ex.printStackTrace();
        }
    }
    //Fin Update Cargo

    //Update Cliente
    public void modificarCliente(HttpServletRequest request, HttpServletResponse response) {
        //CAPTURA DE VARIABLES
        String id_Cliente = request.getParameter("id_Cliente");
        String nombresClietne = request.getParameter("nombresCliente");
        String ApellidosCliente = request.getParameter("apellidosCliente");
        String Dui_CLiente = request.getParameter("dui_Cliente");
        String Telefono = request.getParameter("telefono");
        String Correo = request.getParameter("correo");
        String Id_Direccion = request.getParameter("id_Direccion");
        String Usuario = request.getParameter("usuario");
        String Clave = request.getParameter("clave");
        String FechaRegistro = request.getParameter("fechaRegistro");

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection conn = DriverManager.getConnection(url)) {
                request.setAttribute("mensaje_conexion", "Ok!");

                String sql = "update Clientes set "
                        + "NombresCliente='" + nombresClietne + "', "
                        + "ApellidosCliente='" + ApellidosCliente + "', "
                        + "DUI_Cliente='" + Dui_CLiente + "', "
                        + "Telefono='" + Telefono + "' "
                        + "Correo='" + Correo + "' "
                        + "Id_Direccion='" + Id_Direccion + "' "
                        + "Usuario='" + Usuario + "' "
                        + "Clave='" + Clave + "' "
                        + "FechaRegistro='" + FechaRegistro + "' "
                        + "where Id_Cliente='" + id_Cliente + "'";

                PreparedStatement pstmt = conn.prepareStatement(sql);
                int registros = pstmt.executeUpdate();
                if (registros > 0) {
                    request.getSession().setAttribute("exito", true);
                } else {
                    request.getSession().setAttribute("exito", false);
                }
            }
        } catch (SQLException | ClassNotFoundException ex) {
            request.getSession().setAttribute("exito", false);
            ex.printStackTrace();
        }
    }
    //Fin Update Cliente
    
    //FUNCIONES DE DELETE ---------------------------------------------------------------
    //Delete Empleado
    public void eliminarEmpleado(HttpServletRequest request, HttpServletResponse response) {
        String ID_Empleado = request.getParameter("ID_Empleado");
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection conn = DriverManager.getConnection(url)) {
                request.setAttribute("mensaje_conexion", "Ok!");
                String sql = "delete from Empleados where ID_Empleado='" + ID_Empleado + "'";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                int registros = pstmt.executeUpdate();
                if (registros > 0) {
                    request.getSession().setAttribute("exito", true);
                } else {
                    request.getSession().setAttribute("exito", false);
                }
            }
        } catch (SQLException | ClassNotFoundException ex) {
            request.getSession().setAttribute("exito", false);
            ex.printStackTrace();
        }
    }
    //Fin Delete Empleado

    //Delete Cargo
    public void eliminarCargo(HttpServletRequest request, HttpServletResponse response) {
        String ID_Cargo = request.getParameter("Id_Cargo");
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection conn = DriverManager.getConnection(url)) {
                request.setAttribute("mensaje_conexion", "Ok!");
                String sql = "delete from Cargos where Id_Cargo='" + ID_Cargo + "'";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                int registros = pstmt.executeUpdate();
                if (registros > 0) {
                    request.getSession().setAttribute("exito", true);
                } else {
                    request.getSession().setAttribute("exito", false);
                }
            }
        } catch (SQLException | ClassNotFoundException ex) {
            request.getSession().setAttribute("exito", false);
            ex.printStackTrace();
        }
    }
    //Fin Delete Cargo

    //Delete Usuarios
    public void eliminarUsuario(HttpServletRequest request, HttpServletResponse response) {
        String ID_Usuario = request.getParameter("id_Usuario");
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection conn = DriverManager.getConnection(url)) {
                request.setAttribute("mensaje_conexion", "Ok!");
                String sql = "delete from Usuarios where Id_Usuario='" + ID_Usuario + "'";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                int registros = pstmt.executeUpdate();
                if (registros > 0) {
                    request.getSession().setAttribute("exito", true);
                } else {
                    request.getSession().setAttribute("exito", false);
                }
            }
        } catch (SQLException | ClassNotFoundException ex) {
            request.getSession().setAttribute("exito", false);
            ex.printStackTrace();
        }
    }
    //Fin Delete Usuarios
    
    //Delete Cliente
    public void eliminarCliente(HttpServletRequest request, HttpServletResponse response) {
        String ID_Cliente = request.getParameter("id_Cliente");
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection conn = DriverManager.getConnection(url)) {
                request.setAttribute("mensaje_conexion", "Ok!");
                String sql = "delete from Clientes where Id_Cliente='" + ID_Cliente + "'";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                int registros = pstmt.executeUpdate();
                if (registros > 0) {
                    request.getSession().setAttribute("exito", true);
                } else {
                    request.getSession().setAttribute("exito", false);
                }
            }
        } catch (SQLException | ClassNotFoundException ex) {
            request.getSession().setAttribute("exito", false);
            ex.printStackTrace();
        }
    }
    //Fin Delete Usuarios
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletPrincipal</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletPrincipal at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        if (accion == null) {
            request.getRequestDispatcher("/Login.jsp").forward(request, response);
        } else if (accion.equals("Login")) {
            request.getRequestDispatcher("/Login.jsp").forward(request, response);
        } else if (accion.equals("GestionarCargos")) {
            mostrarCargos(request, response);
            request.getRequestDispatcher("/CRUD/Gestionar/GestionarCargos.jsp").forward(request, response);
        } else if (accion.equals("GestionarEmpleados")) {
            mostrarEmpleados(request, response);
            request.getRequestDispatcher("/CRUD/Gestionar/GestionarEmpleados.jsp").forward(request, response);
        } else if (accion.equals("GestionarUsuarios")) {
            mostrarUsuarios(request, response);
            request.getRequestDispatcher("/CRUD/Gestionar/GestionarUsuarios.jsp").forward(request, response);
        } else if (accion.equals("GestionarClientes")) {
            mostrarClientes(request, response);
            request.getRequestDispatcher("/CRUD/Gestionar/GestionarClientes.jsp").forward(request, response);
        } else if (accion.equals("GestionarInventario")) {
            mostrarInventario(request, response);
            request.getRequestDispatcher("/CRUD/Gestionar/GestionarInventario.jsp").forward(request, response);
        } else if (accion.equals("GestionarProductos")) {
            mostrarProducto(request, response);
            request.getRequestDispatcher("/CRUD/Gestionar/GestionarProductos.jsp").forward(request, response);
        } else if (accion.equals("GestionarDescuento")) {
            mostrarDescuento(request, response);
            request.getRequestDispatcher("/CRUD/Gestionar/GestionarDescuento.jsp").forward(request, response);
        } else if (accion.equals("GestionarCompra")) {
            mostrarCompras(request, response);
            request.getRequestDispatcher("/CRUD/Gestionar/GestionarCompra.jsp").forward(request, response);
        } else if (accion.equals("GestionarDetalleCompra")) {
            mostrarDetallesCompra(request, response);
            request.getRequestDispatcher("/CRUD/Gestionar/GestionarDetalleCompra.jsp").forward(request, response);
        } else if (accion.equals("GestionarMetodosPago")) {
            mostrarMetodosPago(request, response);
            request.getRequestDispatcher("/CRUD/Gestionar/GestionarMetodosPago.jsp").forward(request, response);
        } else if (accion.equals("GestionarPago")) {
            mostrarPagos(request, response);
            request.getRequestDispatcher("/CRUD/Gestionar/GestionarPago.jsp").forward(request, response);
        } else if (accion.equals("GestionarVenta")) {
            mostrarVentas(request, response);
            request.getRequestDispatcher("/CRUD/Gestionar/GestionarVenta.jsp").forward(request, response);
        } else if (accion.equals("GestionarDetalleVentas")) {
            mostrarCarrito(request, response);
            request.getRequestDispatcher("/CRUD/Gestionar/GestionarCarritos.jsp").forward(request, response);
        } else if (accion.equals("GestionarCarritos")) {
            mostrarDetallesVenta(request, response);
            request.getRequestDispatcher("/CRUD/Gestionar/GestionarDetalleVentas.jsp").forward(request, response);
        } else if (accion.equals("AgregarEmpleado")) {
            if (request.getSession().getAttribute("exito") != null) {
                request.setAttribute("exito", request.getSession().getAttribute("exito"));
                request.getSession().removeAttribute("exito");
            }
            request.getRequestDispatcher("CRUD/Agregar/AgregarEmpleado.jsp").forward(request, response);
        } else if (accion.equals("AgregarCargo")) {
            if (request.getSession().getAttribute("exito") != null) {
                request.setAttribute("exito", request.getSession().getAttribute("exito"));
                request.getSession().removeAttribute("exito");
            }
            request.getRequestDispatcher("CRUD/Agregar/AgregarCargo.jsp").forward(request, response);
        } else if (accion.equals("AgregarUsuario")) {
            if (request.getSession().getAttribute("exito") != null) {
                request.setAttribute("exito", request.getSession().getAttribute("exito"));
                request.getSession().removeAttribute("exito");
            }
            request.getRequestDispatcher("CRUD/Agregar/AgregarUsuario.jsp").forward(request, response);
        }else if (accion.equals("AgregarCliente")) {
            if (request.getSession().getAttribute("exito") != null) {
                request.setAttribute("exito", request.getSession().getAttribute("exito"));
                request.getSession().removeAttribute("exito");
            }
            request.getRequestDispatcher("CRUD/Agregar/AgregarCliente.jsp").forward(request, response);
        }
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");

        if (accion.equals("Login")) {
            String Usuario = request.getParameter("tfUsuario");
            String Contrasenia = request.getParameter("tfContrasena");

            try (PrintWriter print = response.getWriter()) {
                if (Usuario.equals("Admin") && Contrasenia.equals("root")) {
                    request.getRequestDispatcher("/index.html").forward(request, response);
                } else {
                    print.println("<!DOCTYPE html>");
                    print.println("<html>");
                    print.println("<head>");
                    print.println("<title>Error</title>");
                    print.println("</head>");
                    print.println("<body>");
                    print.println("<h1> ERROR: CONTRASEÑA O USUARIO SON ERRONEOS </h1>");
                    print.println("</body>");
                    print.println("</html>");
                }
            }
        }//fin if 

        //Captura del Post
        if (accion.equals("agregarempleado")) {
            agregarEmpleado(request, response);
            response.sendRedirect(request.getContextPath() + "/Servletprincipal?accion=agregarempleado");
        } else if (accion.equals("modificarempleado")) {
            modificarEmpleado(request, response);
            response.sendRedirect(request.getContextPath() + "/Servletprincipal?accion=gestionarempleados");
        } else if (accion.equals("eliminarempleado")) {
            eliminarEmpleado(request, response);
            response.sendRedirect(request.getContextPath() + "/Servletprincipal?accion=Gestionarempleados");
        } else if (accion.equals("AgregarCargo")) {
            agregarCargo(request, response);
            response.sendRedirect(request.getContextPath() + "/ServletPrincipal?accion=AgregarCargo");
        } else if (accion.equals("ModificarCargo")) {
            modificarCargo(request, response);
            response.sendRedirect(request.getContextPath() + "/ServletPrincipal?accion=GestionarCargo");
        } else if (accion.equals("EliminarCargo")) {
            eliminarEmpleado(request, response);
            response.sendRedirect(request.getContextPath() + "/ServletPrincipal?accion=GestionarCargo");
        } else if (accion.equals("AgregarUsuario")) {
            agregarUsuario(request, response);
            response.sendRedirect(request.getContextPath() + "/ServletPrincipal?accion=AgregarUsuario");
        } else if (accion.equals("ModificarUsuario")) {
            modificarUsuario(request, response);
            response.sendRedirect(request.getContextPath() + "/ServletPrincipal?accion=GestionarUsuarios");
        } else if (accion.equals("EliminarUsuario")) {
            eliminarUsuario(request, response);
            response.sendRedirect(request.getContextPath() + "/ServletPrincipal?accion=GestionarUsuarios");
        }else if (accion.equals("AgregarCliente")) {
            agregarCliente(request, response);
            response.sendRedirect(request.getContextPath() + "/ServletPrincipal?accion=AgregarCliente");
        } else if (accion.equals("ModificarCliente")) {
            modificarCliente(request, response);
            response.sendRedirect(request.getContextPath() + "/ServletPrincipal?accion=GestionarClientes");
        } else if (accion.equals("EliminarCliente")) {
            eliminarCliente(request, response);
            response.sendRedirect(request.getContextPath() + "/ServletPrincipal?accion=GestionarClientes");
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
