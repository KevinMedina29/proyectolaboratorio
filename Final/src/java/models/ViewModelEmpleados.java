package models;
import java.util.Date;

public class ViewModelEmpleados {

    private int ID_Empleado;
    private String DUI_Empleado;
    private String nombresEmpleado;
    private String apellidosEmpleado;
    private int ID_Usuario;
    private Date fechaNacEmpleado;
    private String telefono;
    private String correo;
    private String direccion;
    private int ID_Cargo;
    
    /**
     * @return the ID_Empleado
     */
    public int getID_Empleado() {
        return ID_Empleado;
    }

    /**
     * @param ID_Empleado the ID_Empleado to set
     */
    public void setID_Empleado(int ID_Empleado) {
        this.ID_Empleado = ID_Empleado;
    }

    /**
     * @return the DUI_Empleado
     */
    public String getDUI_Empleado() {
        return DUI_Empleado;
    }

    /**
     * @param DUI_Empleado the DUI_Empleado to set
     */
    public void setDUI_Empleado(String DUI_Empleado) {
        this.DUI_Empleado = DUI_Empleado;
    }

    /**
     * @return the nombresEmpleado
     */
    public String getNombresEmpleado() {
        return nombresEmpleado;
    }

    /**
     * @param nombresEmpleado the nombresEmpleado to set
     */
    public void setNombresEmpleado(String nombresEmpleado) {
        this.nombresEmpleado = nombresEmpleado;
    }

    /**
     * @return the apellidosEmpleado
     */
    public String getApellidosEmpleado() {
        return apellidosEmpleado;
    }

    /**
     * @param apellidosEmpleado the apellidosEmpleado to set
     */
    public void setApellidosEmpleado(String apellidosEmpleado) {
        this.apellidosEmpleado = apellidosEmpleado;
    }

    /**
     * @return the ID_Usuario
     */
    public int getID_Usuario() {
        return ID_Usuario;
    }

    /**
     * @param ID_Usuario the ID_Usuario to set
     */
    public void setID_Usuario(int ID_Usuario) {
        this.ID_Usuario = ID_Usuario;
    }

    /**
     * @return the fechaNacEmpleado
     */
    public Date getFechaNacEmpleado() {
        return fechaNacEmpleado;
    }

    /**
     * @param fechaNacEmpleado the fechaNacEmpleado to set
     */
    public void setFechaNacEmpleado(Date fechaNacEmpleado) {
        this.fechaNacEmpleado = fechaNacEmpleado;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the ID_Cargo
     */
    public int getID_Cargo() {
        return ID_Cargo;
    }

    /**
     * @param ID_Cargo the ID_Cargo to set
     */
    public void setID_Cargo(int ID_Cargo) {
        this.ID_Cargo = ID_Cargo;
    }
}
