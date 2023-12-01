/*
    ID_Cliente int primary key identity(1, 1),
    DUI_Cliente varchar(10) not null,
    NombresCliente varchar(60) not null,
    ApellidosCliente varchar(60) not null,
    ID_Usuario int not null,
    Telefono varchar(10) not null,
    Correo varchar(100),
    ID_Direccion int
*/
package models;

public class viewmodelclientes {
    private int ID_Cliente;
    private String DUI_Cliente;
    private String nombresCliente;
    private String apellidosCliente;
    private int ID_Usuario;
    private String telefono;
    private String correo;
    private int ID_Direccion;

    public viewmodelclientes(int ID_Cliente, String DUI_Cliente, String nombresCliente, String apellidosCliente, int ID_Usuario, String telefono, String correo, int ID_Direccion) {
        this.ID_Cliente = ID_Cliente;
        this.DUI_Cliente = DUI_Cliente;
        this.nombresCliente = nombresCliente;
        this.apellidosCliente = apellidosCliente;
        this.ID_Usuario = ID_Usuario;
        this.telefono = telefono;
        this.correo = correo;
        this.ID_Direccion = ID_Direccion;
    }

    public viewmodelclientes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @return the ID_Cliente
     */
    public int getID_Cliente() {
        return ID_Cliente;
    }

    /**
     * @param ID_Cliente the ID_Cliente to set
     */
    public void setID_Cliente(int ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
    }

    /**
     * @return the DUI_Cliente
     */
    public String getDUI_Cliente() {
        return DUI_Cliente;
    }

    /**
     * @param DUI_Cliente the DUI_Cliente to set
     */
    public void setDUI_Cliente(String DUI_Cliente) {
        this.DUI_Cliente = DUI_Cliente;
    }

    /**
     * @return the nombresCliente
     */
    public String getNombresCliente() {
        return nombresCliente;
    }

    /**
     * @param nombresCliente the nombresCliente to set
     */
    public void setNombresCliente(String nombresCliente) {
        this.nombresCliente = nombresCliente;
    }

    /**
     * @return the apellidosCliente
     */
    public String getApellidosCliente() {
        return apellidosCliente;
    }

    /**
     * @param apellidosCliente the apellidosCliente to set
     */
    public void setApellidosCliente(String apellidosCliente) {
        this.apellidosCliente = apellidosCliente;
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
     * @return the ID_Direccion
     */
    public int getID_Direccion() {
        return ID_Direccion;
    }

    /**
     * @param ID_Direccion the ID_Direccion to set
     */
    public void setID_Direccion(int ID_Direccion) {
        this.ID_Direccion = ID_Direccion;
    }

    
    
}
