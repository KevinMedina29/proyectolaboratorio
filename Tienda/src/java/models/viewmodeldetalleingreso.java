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
    private int id_detalle_ingreso;
    private int id_ingreso;
    private int id_categoria;
    private int cantidad;
    private String precio;

    public viewmodeldetalleingreso() {
    }

    public viewmodeldetalleingreso(int id_detalle_ingreso, int id_ingreso, int id_categoria, int cantidad, String precio) {
        this.id_detalle_ingreso = id_detalle_ingreso;
        this.id_ingreso = id_ingreso;
        this.id_categoria = id_categoria;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getId_detalle_ingreso() {
        return id_detalle_ingreso;
    }

    public void setId_detalle_ingreso(int id_detalle_ingreso) {
        this.id_detalle_ingreso = id_detalle_ingreso;
    }

    public int getId_ingreso() {
        return id_ingreso;
    }

    public void setId_ingreso(int id_ingreso) {
        this.id_ingreso = id_ingreso;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
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
