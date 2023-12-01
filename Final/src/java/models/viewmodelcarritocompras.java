/*
create table CarritoCompras(
    ID_Carrito int identity(1,1) primary key,
    ID_Cliente int not null,
    Fecha datetime not null,
    ID_Articulo int not null,
    Cantidad int not null,
    Precio decimal(11, 2) not null
);
*/
package models;

import java.util.Date;

public class viewmodelcarritocompras {
    private int ID_Carrito;
    private int ID_Cliente;
    private  Date fecha;
    private int ID_Articulo;
    private int cantidad;
    private String precio;

    public viewmodelcarritocompras() {
    }

    public viewmodelcarritocompras(int ID_Carrito, int ID_Cliente, Date fecha, int ID_Articulo, int cantidad, String precio) {
        this.ID_Carrito = ID_Carrito;
        this.ID_Cliente = ID_Cliente;
        this.fecha = fecha;
        this.ID_Articulo = ID_Articulo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getID_Carrito() {
        return ID_Carrito;
    }

    public void setID_Carrito(int ID_Carrito) {
        this.ID_Carrito = ID_Carrito;
    }

    public int getID_Cliente() {
        return ID_Cliente;
    }

    public void setID_Cliente(int ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getID_Articulo() {
        return ID_Articulo;
    }

    public void setID_Articulo(int ID_Articulo) {
        this.ID_Articulo = ID_Articulo;
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
