/*
create table Empleados(
	ID_Empleado int primary key identity(1, 1),
    DUI_Empleado varchar(10) not null,
    NombresEmpleado varchar(60) not null,
    ApellidosEmpleado varchar(60) not null,
	ID_Usuario int not null,
    FechaNacEmpleado date not null,
    Telefono varchar(10) not null,
    Correo varchar(100),
	Direccion nvarchar(250),
    ID_Cargo int not null
);*/
package models;

import java.util.Date;

public class viewmodelempleados {
    private int ID_Empleado;
    private String DUI_Empleado;
    private String NombresEmpleado;
    private String ApellidosEmpleado;
    private int ID_Usuario;
    private Date FechaNacEmpleado;
    private String Telefono;
    private String Correo;
    private String Direccion;
    private int ID_Cargo;

    public viewmodelempleados() {
    }

    public viewmodelempleados(int ID_Empleado, String DUI_Empleado, String NombresEmpleado, String ApellidosEmpleado, int ID_Usuario, Date FechaNacEmpleado, String Telefono, String Correo, String Direccion, int ID_Cargo) {
        this.ID_Empleado = ID_Empleado;
        this.DUI_Empleado = DUI_Empleado;
        this.NombresEmpleado = NombresEmpleado;
        this.ApellidosEmpleado = ApellidosEmpleado;
        this.ID_Usuario = ID_Usuario;
        this.FechaNacEmpleado = FechaNacEmpleado;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.Direccion = Direccion;
        this.ID_Cargo = ID_Cargo;
    }

    public int getID_Empleado() {
        return ID_Empleado;
    }

    public void setID_Empleado(int ID_Empleado) {
        this.ID_Empleado = ID_Empleado;
    }

    public String getDUI_Empleado() {
        return DUI_Empleado;
    }

    public void setDUI_Empleado(String DUI_Empleado) {
        this.DUI_Empleado = DUI_Empleado;
    }

    public String getNombresEmpleado() {
        return NombresEmpleado;
    }

    public void setNombresEmpleado(String NombresEmpleado) {
        this.NombresEmpleado = NombresEmpleado;
    }

    public String getApellidosEmpleado() {
        return ApellidosEmpleado;
    }

    public void setApellidosEmpleado(String ApellidosEmpleado) {
        this.ApellidosEmpleado = ApellidosEmpleado;
    }

    public int getID_Usuario() {
        return ID_Usuario;
    }

    public void setID_Usuario(int ID_Usuario) {
        this.ID_Usuario = ID_Usuario;
    }

    public Date getFechaNacEmpleado() {
        return FechaNacEmpleado;
    }

    public void setFechaNacEmpleado(Date FechaNacEmpleado) {
        this.FechaNacEmpleado = FechaNacEmpleado;
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

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getID_Cargo() {
        return ID_Cargo;
    }

    public void setID_Cargo(int ID_Cargo) {
        this.ID_Cargo = ID_Cargo;
    }
    
    
}
