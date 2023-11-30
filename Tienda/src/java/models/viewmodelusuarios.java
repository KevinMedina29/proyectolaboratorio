/*
create table Usuarios(
	ID_Usuario int primary key identity(1, 1),	
	ID_Rol int not null,
    Usuario varchar(60) not null,
    Clave varchar(60) not null
); */
package models;


public class viewmodelusuarios {
    private int ID_Usuario;
    private int ID_Rol;
    private String usuario;
    private String clave;

    public viewmodelusuarios(int ID_Usuario, int ID_Rol, String usuario, String clave) {
        this.ID_Usuario = ID_Usuario;
        this.ID_Rol = ID_Rol;
        this.usuario = usuario;
        this.clave = clave;
    }

    public viewmodelusuarios() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
     * @return the ID_Rol
     */
    public int getID_Rol() {
        return ID_Rol;
    }

    /**
     * @param ID_Rol the ID_Rol to set
     */
    public void setID_Rol(int ID_Rol) {
        this.ID_Rol = ID_Rol;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    
    
}
