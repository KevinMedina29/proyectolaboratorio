package Servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

// importe modelos
import models.ViewModelEmpleados;
import models.viewmodelReservas;
import models.viewmodelarticulos;
import models.viewmodelcargo;
import models.viewmodelcarritocompras;
import models.viewmodelclientes;
import models.viewmodeldetalleingreso;
import models.viewmodeldetalleventa;
import models.viewmodelenvios;
import models.viewmodelexistencias;
import models.viewmodelingreso;
import models.viewmodelmetodospago;
import models.viewmodelproveedores;
import models.viewmodelusuarios;
import models.viewmodelventa;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletPrincipal extends HttpServlet {
    
    private final String usuario = "login_admin";
    private final String contrasenia = "root";
    private final String servidor = "localhost:1433";
    private final String bd = "TiendaLacteos"; 
    String url = "jdbc:sqlserver://"
    + servidor 
    + ";databaseName=" + bd 
    + ";user=" + usuario 
    + ";password=" + contrasenia 
    + ";encrypt=false;trustServerCertificate=false;";

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
    
    //FUNCIONES DE CRUD SOBRE LA BASE DE DATOS
    //Funciones de lectura de tablas (SELECT)
    //Empleados
    public void mostrarEmpleados(HttpServletRequest request, HttpServletResponse response) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            try(Connection conn = DriverManager.getConnection(url)){
                request.setAttribute("mensaje_conexion", "Ok!");
                String sqlQuery = "select * from Empleados";
                PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
                ResultSet rs = pstmt.executeQuery();
                ArrayList<ViewModelEmpleados> listaEmpleados = new ArrayList<>();
                while (rs.next()) {
                    ViewModelEmpleados empleado = new ViewModelEmpleados();
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
    }//Fin Empleados
    
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
    
    //Usuarios
    public void mostrarUsuarios(HttpServletRequest request, HttpServletResponse response) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            try (Connection conn = DriverManager.getConnection(url)) {
                request.setAttribute("mensaje_conexion", "Ok!");
                String sqlQuery = "select * from Usuarios";
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
                String sqlQuery = "select * from Clientes";
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
                    articulo.setDescripcion(rs.getString("descripcion"));
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
                    compra.setID_Ingreso(rs.getInt("ID_Ingreso"));
                    compra.setFecha(rs.getDate("Fecha"));
                    compra.setTipo_Comprobante(rs.getString("Tipo_Comprobante"));
                    compra.setSerie_Comprobante(rs.getString("Serie_Comprobante"));
                    compra.setTotal(rs.getString("Total"));
                    compra.setEstado(rs.getString("Estado"));
                    compra.setNum_Comprobante(rs.getString("Num_Comprobante"));
                    compra.setID_Empleado(rs.getInt("ID_Empleado"));

                    listaIngreso.add(compra);
                }
                request.setAttribute("listaIngreso", listaIngreso);

            }
        } catch (SQLException | ClassNotFoundException ex) {
            request.setAttribute("mensaje_conexion", ex.getMessage());
            ex.printStackTrace();
        }
    }
    //fin ingreso
    // inicio  Detalles de ingreso
    public void mostrarDetallesIngreso(HttpServletRequest request, HttpServletResponse response) {
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
                    detalleCompra.setID_Detalle_Ingreso(rs.getInt("ID_Detalle_Ingreso"));
                    detalleCompra.setID_Ingreso(rs.getInt("ID_Ingreso"));
                    detalleCompra.setID_Categoria(rs.getInt("ID_Categoria"));
                    detalleCompra.setCantidad(rs.getInt("cantidad"));
                    detalleCompra.setPrecio(rs.getString("precio"));
                    listaDetalleIngreso.add(detalleCompra);
                }
                request.setAttribute("listaDetalleIngreso", listaDetalleIngreso);

            }
        } catch (SQLException | ClassNotFoundException ex) {
            request.setAttribute("mensaje_conexion", ex.getMessage());
            ex.printStackTrace();
        }
    }
    //fin detalles de ingreso
    // inicio metodos de pago  
    public void mostrarMetodosPago(HttpServletRequest request, HttpServletResponse response) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            try (Connection conn = DriverManager.getConnection(url)) {
                request.setAttribute("mensaje_conexion", "Ok!");
                String sqlQuery = "select * from MetodoPago";
                PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
                ResultSet rs = pstmt.executeQuery();

                ArrayList<viewmodelmetodospago> listaMetodosPago = new ArrayList<>();

                while (rs.next()) {
                    viewmodelmetodospago metodoPago = new viewmodelmetodospago();
                    metodoPago.setID_Metodo_Pago(rs.getInt("ID_Metodo_Pago"));
                    metodoPago.setMetodo(rs.getString("metodo"));

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
    //inicio de proveedores
    public void mostrarProveedores(HttpServletRequest request, HttpServletResponse response) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            try (Connection conn = DriverManager.getConnection(url)) {
                request.setAttribute("mensaje_conexion", "Ok!");
                String sqlQuery = "select * from Proveedores";
                PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
                ResultSet rs = pstmt.executeQuery();

                ArrayList<viewmodelproveedores> listaProveedores = new ArrayList<>();

                while (rs.next()) {
                    viewmodelproveedores proveedores = new viewmodelproveedores();
                    proveedores.setID_Proveedor(rs.getInt("ID_Reserva"));
                    proveedores.setNombre(rs.getString("nombre"));
                    proveedores.setDireccion(rs.getString("direccion"));
                    proveedores.setTelefono(rs.getString("telefono"));
                    proveedores.setCorreo(rs.getString("correo"));
                    proveedores.setNotas(rs.getString("notas"));
                    listaProveedores.add(proveedores);
                }
                request.setAttribute("listaProveedores", listaProveedores);

            }
        } catch (SQLException | ClassNotFoundException ex) {
            request.setAttribute("mensaje_conexion", ex.getMessage());
            ex.printStackTrace();
        }
    }
    //fin de proveedores
    //inicio Ventas
    public void mostrarVentas(HttpServletRequest request, HttpServletResponse response) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            try (Connection conn = DriverManager.getConnection(url)) {
                request.setAttribute("mensaje_conexion", "Ok!");
                String sqlQuery = "select * from  Venta";
                PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
                ResultSet rs = pstmt.executeQuery();

                ArrayList<viewmodelventa> listaVentas = new ArrayList<>();

                while (rs.next()) {
                    viewmodelventa venta = new viewmodelventa();
                    venta.setID_Venta(rs.getInt("ID_Venta"));
                    venta.setID_Cliente(rs.getInt("ID_Cliente"));
                    venta.setID_Empleado(rs.getInt("ID_Empleado"));
                    venta.setID_Metodo_Pago(rs.getInt("ID_Metodo_Pago"));
                    venta.setFecha(rs.getDate("fecha"));
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
                String sqlQuery = "select * from CarritoCompras";
                PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
                ResultSet rs = pstmt.executeQuery();

                ArrayList<viewmodelcarritocompras> listaCarrito = new ArrayList<>();

                while (rs.next()) {
                    viewmodelcarritocompras carritoCompras = new viewmodelcarritocompras();
                    carritoCompras.setID_Carrito(rs.getInt("ID_Carrito"));
                    carritoCompras.setID_Articulo(rs.getInt("ID_Articulo"));
                    carritoCompras.setID_Cliente(rs.getInt("ID_Cliente"));
                    carritoCompras.setCantidad(rs.getInt("cantidad"));
                    carritoCompras.setFecha(rs.getDate("fecha"));
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
                String sqlQuery = "select * from DetalleVenta";
                PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
                ResultSet rs = pstmt.executeQuery();

                ArrayList<viewmodeldetalleventa> listaDetalleVenta = new ArrayList<>();

                while (rs.next()) {
                    viewmodeldetalleventa detalleVenta = new viewmodeldetalleventa();
                        detalleVenta.setID_Detalle_Venta(rs.getInt("ID_Detalle_Venta"));
                    detalleVenta.setID_Venta(rs.getInt("ID_Venta"));
                    detalleVenta.setID_Articulo(rs.getInt("ID_Articulo"));
                    detalleVenta.setCantidad(rs.getInt("cantidad"));
                    detalleVenta.setPrecio_Unitario(rs.getString("Precio_Unitario"));
                    detalleVenta.setImpuesto(rs.getString("impuesto"));
                    detalleVenta.setTotal(rs.getString("total"));

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
    
        //Inicio Envios
    public void mostrarEnvios(HttpServletRequest request, HttpServletResponse response) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            try (Connection conn = DriverManager.getConnection(url)) {
                request.setAttribute("mensaje_conexion", "Ok!");
                String sqlQuery = "select * from Envios";
                PreparedStatement pstmt = conn.prepareStatement(sqlQuery);
                ResultSet rs = pstmt.executeQuery();

                ArrayList<viewmodelenvios> listaEnvios = new ArrayList<>();

                while (rs.next()) {
                    viewmodelenvios envios = new viewmodelenvios();
                    envios.setID_Envio(rs.getInt("ID_Envio"));
                    envios.setID_Cliente(rs.getInt("ID_Cliente"));
                    envios.setID_Empleado(rs.getInt("ID_Empleado"));
                    envios.setFechaEnvio(rs.getDate("fechaEnvio"));
                    envios.setEstado(rs.getString("estado"));
                    envios.setMetodoEnvio(rs.getString("metodoEnvio"));
                    envios.setNotas(rs.getString("notas"));

                    listaEnvios.add(envios);
                }
                request.setAttribute("listaEnvios", listaEnvios);

            }
        } catch (SQLException | ClassNotFoundException ex) {
            request.setAttribute("mensaje_conexion", ex.getMessage());
            ex.printStackTrace();
        }
    }
    //Fin envios
    
    //Funciones de escritura en tablas (INSERT)
    public void agregarEmpleados(HttpServletRequest request, HttpServletResponse response) {
        //CAPTURA DE VARIABLES
        //El ID de los empleados es autoincrementable
        String DUI_Empleado = request.getParameter("DUI_Empleado");
        String nombresEmpleado = request.getParameter("nombresEmpleado");
        String apellidosEmpleado = request.getParameter("apellidosEmpleado");
        String ID_Usuario = request.getParameter("ID_Usuario");
        String fechaNacEmpleado = request.getParameter("fechaNacEmpleado");
        String telefono = request.getParameter("telefono");
        String correo = request.getParameter("correo");
        String direccion = request.getParameter("direccion");
        String ID_Cargo = request.getParameter("ID_Cargo");

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection conn = DriverManager.getConnection(url)) {
                request.setAttribute("mensaje_conexion", "Ok!");
                String sql = "insert into Empleados values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, DUI_Empleado);
                pstmt.setString(2, nombresEmpleado);
                pstmt.setString(3, apellidosEmpleado);
                pstmt.setString(4, ID_Usuario);
                pstmt.setString(5, fechaNacEmpleado);
                pstmt.setString(6, telefono);
                pstmt.setString(7, correo);
                pstmt.setString(8, direccion);
                pstmt.setString(9, ID_Cargo);
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
    }// Fin insertar empleados
    //Cargo Insert
    public void agregarCargo(HttpServletRequest request, HttpServletResponse response) {
        String Nombre_Cargo = request.getParameter("Nombre_Cargo");

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection conn = DriverManager.getConnection(url)) {
                request.setAttribute("mensaje_conexion", "Ok!");
                String sql = "insert into Cargo values ( ? )";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, Nombre_Cargo);

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

        String ID_Empleado = request.getParameter("ID_Empleado");
        String ID_Rol = request.getParameter("ID_Rol");
        String usuario = request.getParameter("usuario");
        String clave = request.getParameter("clave");

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection conn = DriverManager.getConnection(url)) {
                request.setAttribute("mensaje_conexion", "Ok!");
                String sql = "insert into Usuarios values ( ?,?,?,? )";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, ID_Empleado);
                pstmt.setString(2, ID_Rol);
                pstmt.setString(3, usuario);
                pstmt.setString(4, clave);

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

        String DUI_Cliente = request.getParameter("DUI_Cliente");
        String nombresCliente = request.getParameter("nombresCliente");
        String apellidosCliente = request.getParameter("apellidosCliente");
        String ID_Usuario = request.getParameter("ID_Usuario");
        String telefono = request.getParameter("telefono");
        String correo = request.getParameter("correo");
        String ID_Direccion = request.getParameter("ID_Direccion");

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection conn = DriverManager.getConnection(url)) {
                request.setAttribute("mensaje_conexion", "Ok!");
                String sql = "insert into Clientes values ( ?, ?, ?, ?, ?, ?, ? )";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, DUI_Cliente);
                pstmt.setString(2, nombresCliente);
                pstmt.setString(3, apellidosCliente);
                pstmt.setString(4, ID_Usuario);
                pstmt.setString(5, telefono);
                pstmt.setString(6, correo);
                pstmt.setString(7, ID_Direccion);

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
    
    
    //Funciones de actualizacion de registros (UPDATE)
    public void modificarEmpleado(HttpServletRequest request, HttpServletResponse response) {
        //CAPTURA DE VARIABLES
        String ID_Empleado = request.getParameter("ID_Empleado");
        String DUI_Empleado = request.getParameter("DUI_Empleado");
        String nombresEmpleado = request.getParameter("nombresEmpleado");
        String apellidosEmpleado = request.getParameter("apellidosEmpleado");
        String ID_Usuario = request.getParameter("ID_Usuario");
        String fechaNacEmpleado = request.getParameter("fechaNacEmpleado");
        String telefono = request.getParameter("telefono");
        String correo = request.getParameter("correo");
        String direccion = request.getParameter("direccion");
        String ID_Cargo = request.getParameter("ID_Cargo");

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection conn = DriverManager.getConnection(url)) {
                request.setAttribute("mensaje_conexion", "Ok!");
                
                String sql = "update Empleados set "
                 + "DUI_Empleado='"+DUI_Empleado+"', "
                 + "NombresEmpleado='"+nombresEmpleado+"', "
                 + "ApellidosEmpleado='"+apellidosEmpleado+"', "
                 + "ID_Usuario='"+ID_Usuario+"', "
                 + "FechaNacEmpleado='"+fechaNacEmpleado+"', "
                 + "TelefonoEmpleado='"+telefono+"', "
                 + "Correo='"+correo+"', " 
                 + "Direccion='"+direccion+"' " 
                 + "ID_Cargo='"+ID_Cargo+"', "
                 + "where ID_Empleado='"+ID_Empleado+"'";
                
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
    //Update Usuario
    public void modificarUsuario(HttpServletRequest request, HttpServletResponse response) {
        //CAPTURA DE VARIABLES
        String ID_Usuario = request.getParameter("ID_Usuario");
        String ID_Empleado = request.getParameter("ID_Empleado");
        String ID_Rol = request.getParameter("ID_Rol");
        String usuario = request.getParameter("usuario");
        String clave = request.getParameter("clave");

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection conn = DriverManager.getConnection(url)) {
                request.setAttribute("mensaje_conexion", "Ok!");

                String sql = "update Usuarios set "
                        + "ID_Empleado='" + ID_Empleado + "', "
                        + "ID_Rol='" + ID_Rol + "', "
                        + "usuario='" + usuario + "', "
                        + "clave='" + clave + "' "
                        + "where ID_Usuario='" + ID_Usuario + "'";

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
        String ID_Cargo = request.getParameter("ID_Cargo");
        String Nombre_Cargo = request.getParameter("Nombre_Cargo");

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection conn = DriverManager.getConnection(url)) {
                request.setAttribute("mensaje_conexion", "Ok!");

                String sql = "update Cargos set "
                        + "Nombre_Cargo='" + Nombre_Cargo + "'"
                        + "Where ID_Cargo ='" + ID_Cargo + "'";

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
        String ID_Cliente = request.getParameter("ID_Cliente");
        String DUI_Cliente = request.getParameter("DUI_Cliente");
        String nombresCliente = request.getParameter("nombresCliente");
        String apellidosCliente = request.getParameter("apellidosCliente");
        String ID_Usuario = request.getParameter("ID_Usuario");
        String telefono = request.getParameter("telefono");
        String correo = request.getParameter("correo");
        String ID_Direccion = request.getParameter("ID_Direccion");

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection conn = DriverManager.getConnection(url)) {
                request.setAttribute("mensaje_conexion", "Ok!");

                String sql = "update Clientes set "
                        + "DUI_Cliente='" + DUI_Cliente + "', "
                        + "nombresCliente='" + nombresCliente + "', "
                        + "apellidosCliente='" + apellidosCliente + "', "
                        + "ID_Usuario='" + ID_Usuario + "' "
                        + "telefono='" + telefono + "' "
                        + "correo='" + correo + "' "
                        + "ID_Direccion='" + ID_Direccion + "' "
                        + "where ID_Cliente='" + ID_Cliente + "'";

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
    
    //Funciones de eliminacion de registros (DELETE)
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
    } //Fin delete Empleado
    //Delete Cargo
    public void eliminarCargo(HttpServletRequest request, HttpServletResponse response) {
        String ID_Cargo = request.getParameter("ID_Cargo");
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection conn = DriverManager.getConnection(url)) {
                request.setAttribute("mensaje_conexion", "Ok!");
                String sql = "delete from Cargo where ID_Cargo='" + ID_Cargo + "'";
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
        String ID_Usuario = request.getParameter("ID_Usuario");
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection conn = DriverManager.getConnection(url)) {
                request.setAttribute("mensaje_conexion", "Ok!");
                String sql = "delete from Usuarios where ID_Usuario='" + ID_Usuario + "'";
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
        String ID_Cliente = request.getParameter("ID_Cliente");
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            try (Connection conn = DriverManager.getConnection(url)) {
                request.setAttribute("mensaje_conexion", "Ok!");
                String sql = "delete from Clientes where ID_Cliente='" + ID_Cliente + "'";
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
    //Fin Delete Cliente
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion= request.getParameter("accion");
        if(accion==null){
            request.getRequestDispatcher("/Login.jsp").forward(request, response);
        }else if(accion.equals("Login")){
            request.getRequestDispatcher("/Login.jsp").forward(request, response);
        }else if(accion.equals("GestionarArticulos")){
            mostrarArticulo(request, response);
            request.getRequestDispatcher("/Usuarios/Gestionar/GestionarArticulos.jsp").forward(request, response);
        }else if(accion.equals("GestionarEnvios")){
            mostrarEnvios(request, response);
            request.getRequestDispatcher("/Usuarios/Gestionar/GestionarEnvios.jsp").forward(request, response);
        }else if(accion.equals("GestionarVentas")){
            mostrarVentas(request, response);
            request.getRequestDispatcher("/Usuarios/Gestionar/GestionarVentas.jsp").forward(request, response);
        }else if(accion.equals("GestionarProveedor")){
            mostrarProveedores(request, response);
            request.getRequestDispatcher("/Usuarios/Gestionar/GestionarProveedor.jsp").forward(request, response);
        }else if(accion.equals("GestionarEmpleados")){
            mostrarEmpleados(request, response);
            request.getRequestDispatcher("/Usuarios/Gestionar/GestionarEmpleados.jsp").forward(request, response);
        }else if(accion.equals("GestionarReservas")){
            mostrarReserva(request, response);
            request.getRequestDispatcher("/Usuarios/Gestionar/GestionarReservas.jsp").forward(request, response);
        }else if(accion.equals("gestionarcargos")){
            mostrarCargos(request, response);
            request.getRequestDispatcher("/Usuarios/Gestionar/gestionarcargos.jsp").forward(request, response);
        }else if(accion.equals("gestionarcarrito")){
            mostrarCarrito(request, response);
            request.getRequestDispatcher("/Usuarios/Gestionar/gestionarcarrito.jsp").forward(request, response);
        }else if(accion.equals("gestionarclientes")){
            mostrarClientes(request, response);
            request.getRequestDispatcher("/Usuarios/Gestionar/gestionarclientes.jsp").forward(request, response);
        }else if(accion.equals("gestionarmetodopago")){
            mostrarMetodosPago(request, response);
            request.getRequestDispatcher("/Usuarios/Gestionar/gestionarmetodopago.jsp").forward(request, response);
        }else if(accion.equals("gestionarusuarios")){
            mostrarUsuarios(request, response);
            request.getRequestDispatcher("/Usuarios/Gestionar/gestionarusuarios.jsp").forward(request, response);
        }else if(accion.equals("gestionarexistencias")){
            mostrarExistencias(request, response);
            request.getRequestDispatcher("/Usuarios/Gestionar/gestionarexistencias.jsp").forward(request, response);
        }else if(accion.equals("gestionaringreso")){
            mostrarIngreso(request, response);
            request.getRequestDispatcher("/Usuarios/Gestionar/gestionaringreso.jsp").forward(request, response);
        }else if(accion.equals("gestionardetalleingreso")){
            mostrarDetallesIngreso(request, response);
            request.getRequestDispatcher("/Usuarios/Gestionar/gestionardetalleingreso.jsp").forward(request, response);
        }else if(accion.equals("gestionardetalleventas")){
            mostrarDetallesVenta(request, response);
            request.getRequestDispatcher("/Usuarios/Gestionar/gestionardetalleventas.jsp").forward(request, response);
        }
        //REDIRECCION PARA JSP DE AGREGAR
         else if (accion.equals("AgregarEmpleados")) {
            if (request.getSession().getAttribute("exito") != null) {
                request.setAttribute("exito", request.getSession().getAttribute("exito"));
                request.getSession().removeAttribute("exito");
            }
            request.getRequestDispatcher("/Usuarios/Agregar/AgregarEmpleados.jsp").forward(request, response);
        }else if (accion.equals("agregarcargo")) {
            if (request.getSession().getAttribute("exito") != null) {
                request.setAttribute("exito", request.getSession().getAttribute("exito"));
                request.getSession().removeAttribute("exito");
            }
            request.getRequestDispatcher("Usuarios/Agregar/agregarcargo.jsp").forward(request, response);
        } else if (accion.equals("agregarcliente")) {
            if (request.getSession().getAttribute("exito") != null) {
                request.setAttribute("exito", request.getSession().getAttribute("exito"));
                request.getSession().removeAttribute("exito");
            }
            request.getRequestDispatcher("Usuarios/Agregar/agregarcliente.jsp").forward(request, response);
        } else if (accion.equals("agregarusuario")) {
            if (request.getSession().getAttribute("exito") != null) {
                request.setAttribute("exito", request.getSession().getAttribute("exito"));
                request.getSession().removeAttribute("exito");
            }
            request.getRequestDispatcher("Usuarios/Agregar/agregarusuario.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion= request.getParameter("accion");
        
        if (accion.equals("Login")){
            String usuario= request.getParameter("Usuario");
            String contraseña= request.getParameter("Contrasenia");
            
            try (PrintWriter print= response.getWriter()){
                if (usuario.equals("login_admin") && contraseña.equals("root")){
                    request.getRequestDispatcher("Menus/PanelAdministrador.jsp").forward(request, response);
                } else if (usuario.equals("login_ger") && contraseña.equals("Sanchez1234")) {
                    request.getRequestDispatcher("Menus/PanelGerente.jsp").forward(request, response);
                } else if (usuario.equals("login_bod") && contraseña.equals("Valle1234")) {
                    request.getRequestDispatcher("Menus/PanelBodeguero.jsp").forward(request, response);
                } else if (usuario.equals("login_ven") && contraseña.equals("Perez1234")) {
                    request.getRequestDispatcher("Menus/PanelVendedor.jsp").forward(request, response);
                } else if (usuario.equals("login_rut") && contraseña.equals("123456")) {
                    request.getRequestDispatcher("Menus/PanelRuteroS.jsp").forward(request, response);
                } else{
                    print.println("<!DOCTYPE html>");
                    print.println("<html>");
                    print.println("<head>");
                    print.println("<title>Login tienda</title>");
                    print.println("</head>");
                    print.println("<body>");
                    print.println("<h1>¡ERROR! El correo o la contraseña son incorrectos</h1>");
                    print.println("</body>");
                    print.println("</html>");
                }
            }
        }
        
        //CAPTURA DE DATOS ENVIADOS POR POST
        if (accion.equals("AgregarEmpleados")) {
            //LOS DATOS SE LE PASAN POR PARAMETRO A LA FUNCION
            agregarEmpleados(request, response);
            //REDIRIGE NUEVAMENTE A LA VISTA DE AGREGAR EMPLEADO
            response.sendRedirect(request.getContextPath() + "/ServletPrincipal?accion=AgregarEmpleados");
        }else if (accion.equals("ModificarEmpleado")) {
            modificarEmpleado(request, response);
            response.sendRedirect(request.getContextPath() + "/ServletPrincipal?accion=GestionarEmpleados");
        } else if (accion.equals("EliminarEmpleado")) {
            eliminarEmpleado(request, response);
            response.sendRedirect(request.getContextPath() + "/ServletPrincipal?accion=GestionarEmpleados");
        }else if (accion.equals("agregarusuario")) {
            agregarUsuario(request, response);
            response.sendRedirect(request.getContextPath() + "/ServletPrincipal?accion=agregarusuario");
        } else if (accion.equals("modificarusuario")) {
            modificarUsuario(request, response);
            response.sendRedirect(request.getContextPath() + "/ServletPrincipal?accion=gestionarusuarios");
        } else if (accion.equals("eliminarusuario")) {
            eliminarUsuario(request, response);
            response.sendRedirect(request.getContextPath() + "/ServletPrincipal?accion=gestionarusuarios");
        } else if (accion.equals("agregarcargo")) {
            agregarCargo(request, response);
            response.sendRedirect(request.getContextPath() + "/ServletPrincipal?accion=agregarcargo");
        } else if (accion.equals("modificarcargo")) {
            modificarCargo(request, response);
            response.sendRedirect(request.getContextPath() + "/ServletPrincipal?accion=gestionarcargos");
        } else if (accion.equals("eliminarcargo")) {
            eliminarCargo(request, response);
            response.sendRedirect(request.getContextPath() + "/ServletPrincipal?accion=gestionarcargos");
        } else if (accion.equals("agregarcliente")) {
            agregarCliente(request, response);
            response.sendRedirect(request.getContextPath() + "/ServletPrincipal?accion=agregarcliente");
        } else if (accion.equals("modificarcliente")) {
            modificarCliente(request, response);
            response.sendRedirect(request.getContextPath() + "/ServletPrincipal?accion=gestionarclientes");
        } else if (accion.equals("eliminarcliente")) {
            eliminarCliente(request, response);
            response.sendRedirect(request.getContextPath() + "/ServletPrincipal?accion=gestionarclientes");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
