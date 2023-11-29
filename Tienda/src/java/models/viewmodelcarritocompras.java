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
    private int id_carrito;
    private int id_cliente;
    private  Date fecha;
    private int id_articulo;
    private int cantidad;

    public viewmodelcarritocompras() {
    }

    public viewmodelcarritocompras(int id_carrito, int id_cliente, Date fecha, int id_articulo, int cantidad) {
        this.id_carrito = id_carrito;
        this.id_cliente = id_cliente;
        this.fecha = fecha;
        this.id_articulo = id_articulo;
        this.cantidad = cantidad;
    }

    public int getId_carrito() {
        return id_carrito;
    }

    public void setId_carrito(int id_carrito) {
        this.id_carrito = id_carrito;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getId_articulo() {
        return id_articulo;
    }

    public void setId_articulo(int id_articulo) {
        this.id_articulo = id_articulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
