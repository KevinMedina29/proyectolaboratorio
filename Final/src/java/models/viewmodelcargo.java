/*
create table Cargo(
	ID_Cargo int identity(1,1) primary key,
	Nombre_Cargo varchar(50) not null
);*/
package models;

public class viewmodelcargo {

    private int ID_Cargo;
    private String Nombre_Cargo;

    public viewmodelcargo(int ID_Cargo, String Nombre_Cargo) {
        this.ID_Cargo = ID_Cargo;
        this.Nombre_Cargo = Nombre_Cargo;
    }

    public viewmodelcargo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

    /**
     * @return the Nombre_Cargo
     */
    public String getNombre_Cargo() {
        return Nombre_Cargo;
    }

    /**
     * @param Nombre_Cargo the Nombre_Cargo to set
     */
    public void setNombre_Cargo(String Nombre_Cargo) {
        this.Nombre_Cargo = Nombre_Cargo;
    }

    
}
