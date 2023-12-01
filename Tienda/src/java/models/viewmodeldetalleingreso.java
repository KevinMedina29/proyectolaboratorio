/*
create table DetalleIngreso(
	ID_Detalle_Ingreso int identity(1,1) primary key,
	ID_Ingreso int NOT NULL,
	ID_Categoria int NOT NULL,
	Cantidad int NOT NULL,
	Precio decimal(11, 2) NULL,
) ;*/
package models;


public class viewmodeldetalleingreso {
    private int ID_Detalle_Ingreso;
    private int ID_Ingreso;
    private int ID_Categoria;
    private int cantidad;
    private String precio;

    public viewmodeldetalleingreso() {
    }

    public viewmodeldetalleingreso(int ID_Detalle_Ingreso, int ID_Ingreso, int ID_Categoria, int cantidad, String precio) {
        this.ID_Detalle_Ingreso = ID_Detalle_Ingreso;
        this.ID_Ingreso = ID_Ingreso;
        this.ID_Categoria = ID_Categoria;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getID_Detalle_Ingreso() {
        return ID_Detalle_Ingreso;
    }

    public void setID_Detalle_Ingreso(int ID_Detalle_Ingreso) {
        this.ID_Detalle_Ingreso = ID_Detalle_Ingreso;
    }

    public int getID_Ingreso() {
        return ID_Ingreso;
    }

    public void setID_Ingreso(int ID_Ingreso) {
        this.ID_Ingreso = ID_Ingreso;
    }

    public int getID_Categoria() {
        return ID_Categoria;
    }

    public void setID_Categoria(int ID_Categoria) {
        this.ID_Categoria = ID_Categoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }



   
}
