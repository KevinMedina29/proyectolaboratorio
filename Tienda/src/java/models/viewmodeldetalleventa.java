/*
create table DetalleVenta(
	ID_Detalle_Venta int identity(1,1) primary key,
	ID_Venta int NOT NULL,
	ID_Articulo int NOT NULL,
	Cantidad int NOT NULL,
	Precio_Unitario decimal(11, 2) NULL,
	Impuesto decimal(4, 2) NOT NULL,
	Total decimal(11, 2) NOT NULL,
); */
package models;


public class viewmodeldetalleventa {
    private int ID_Detalle_Venta;
    private int ID_Venta;
    private int ID_Articulo;
    private int cantidad;
    private String Precio_Unitario;
    private String impuesto;
    private String total;

    public viewmodeldetalleventa() {
    }

    public viewmodeldetalleventa(int ID_Detalle_Venta, int ID_Venta, int ID_Articulo, int cantidad, String Precio_Unitario, String impuesto, String total) {
        this.ID_Detalle_Venta = ID_Detalle_Venta;
        this.ID_Venta = ID_Venta;
        this.ID_Articulo = ID_Articulo;
        this.cantidad = cantidad;
        this.Precio_Unitario = Precio_Unitario;
        this.impuesto = impuesto;
        this.total = total;
    }

    public int getID_Detalle_Venta() {
        return ID_Detalle_Venta;
    }

    public void setID_Detalle_Venta(int ID_Detalle_Venta) {
        this.ID_Detalle_Venta = ID_Detalle_Venta;
    }

    public int getID_Venta() {
        return ID_Venta;
    }

    public void setID_Venta(int ID_Venta) {
        this.ID_Venta = ID_Venta;
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

    public String getPrecio_Unitario() {
        return Precio_Unitario;
    }

    public void setPrecio_Unitario(String Precio_Unitario) {
        this.Precio_Unitario = Precio_Unitario;
    }

    public String getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(String impuesto) {
        this.impuesto = impuesto;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    
}
