package Servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import models.ViewModelEmpleados;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletPrincipal extends HttpServlet {
    
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
    }
    
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
    }
    
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
                 + "direccion='"+direccion+"' " 
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
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion= request.getParameter("accion");
        if(accion==null){
            request.getRequestDispatcher("/Login.jsp").forward(request, response);
        }else if(accion.equals("Login")){
            request.getRequestDispatcher("/Login.jsp").forward(request, response);
        }else if(accion.equals("CatalogoProductos")){
            request.getRequestDispatcher("/CatalogoProductos.jsp").forward(request, response);
        }else if(accion.equals("CategoriasProductos")){
            request.getRequestDispatcher("/CategoriasProductos.jsp").forward(request, response);
        }else if(accion.equals("Pedidos")){
            request.getRequestDispatcher("/Pedidos.jsp").forward(request, response);
        }else if(accion.equals("GestionProveedor")){
            request.getRequestDispatcher("/Usuarios/GestionProveedor.jsp").forward(request, response);
        }else if(accion.equals("GestionEmpleados")){
            mostrarEmpleados(request, response);
            request.getRequestDispatcher("/Usuarios/GestionEmpleados.jsp").forward(request, response);
        }else if(accion.equals("ReservaProductos")){
            request.getRequestDispatcher("/ReservaProductos.jsp").forward(request, response);
        }
        //REDIRECCION PARA JSP DE AGREGAR
         else if (accion.equals("AgregarEmpleados")) {
            if (request.getSession().getAttribute("exito") != null) {
                request.setAttribute("exito", request.getSession().getAttribute("exito"));
                request.getSession().removeAttribute("exito");
            }
            request.getRequestDispatcher("/Usuarios/AgregarEmpleados.jsp").forward(request, response);
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
                if (usuario.equals("admin") && contraseña.equals("root")){
                    request.getRequestDispatcher("/Menus/PanelAdministrador.jsp").forward(request, response);
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
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
