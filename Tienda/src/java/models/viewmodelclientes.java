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
    private String NombresCliente;
    private String ApellidosCliente;
    private int ID_Usuario;
    private String Telefono;
    private String Correo;
    private int ID_Direccion;

    public viewmodelclientes() {
    }

    public viewmodelclientes(int ID_Cliente, String DUI_Cliente, String NombresCliente, String ApellidosCliente, int ID_Usuario, String Telefono, String Correo, int ID_Direccion) {
        this.ID_Cliente = ID_Cliente;
        this.DUI_Cliente = DUI_Cliente;
        this.NombresCliente = NombresCliente;
        this.ApellidosCliente = ApellidosCliente;
        this.ID_Usuario = ID_Usuario;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.ID_Direccion = ID_Direccion;
    }

    public int getID_Cliente() {
        return ID_Cliente;
    }

    public void setID_Cliente(int ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
    }

    public String getDUI_Cliente() {
        return DUI_Cliente;
    }

    public void setDUI_Cliente(String DUI_Cliente) {
        this.DUI_Cliente = DUI_Cliente;
    }

    public String getNombresCliente() {
        return NombresCliente;
    }

    public void setNombresCliente(String NombresCliente) {
        this.NombresCliente = NombresCliente;
    }

    public String getApellidosCliente() {
        return ApellidosCliente;
    }

    public void setApellidosCliente(String ApellidosCliente) {
        this.ApellidosCliente = ApellidosCliente;
    }

    public int getID_Usuario() {
        return ID_Usuario;
    }

    public void setID_Usuario(int ID_Usuario) {
        this.ID_Usuario = ID_Usuario;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public int getID_Direccion() {
        return ID_Direccion;
    }

    public void setID_Direccion(int ID_Direccion) {
        this.ID_Direccion = ID_Direccion;
    }

    
    
    
}
