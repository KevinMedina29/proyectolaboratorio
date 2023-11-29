/*
create table Cargo(
	ID_Cargo int identity(1,1) primary key,
	Nombre_Cargo varchar(50) not null
);*/
package models;

public class viewmodelcargo {

    private int id_cargo;
    private String nombre_cargo;

    public viewmodelcargo() {
    }

    public viewmodelcargo(int id_cargo, String nombre_cargo) {
        this.id_cargo = id_cargo;
        this.nombre_cargo = nombre_cargo;
    }

    public int getId_cargo() {
        return id_cargo;
    }

    public void setId_cargo(int id_cargo) {
        this.id_cargo = id_cargo;
    }

    public String getNombre_cargo() {
        return nombre_cargo;
    }

    public void setNombre_cargo(String nombre_cargo) {
        this.nombre_cargo = nombre_cargo;
    }

}
