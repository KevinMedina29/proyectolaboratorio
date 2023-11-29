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
    private int id_Detalle_vetan;
    private int venta;
    private int id_Articulo;
    private int cantidad;
    private String Precio_Unitario;
    private String impuesto;
    private String total;

    public viewmodeldetalleventa() {
    }

    public viewmodeldetalleventa(int id_Detalle_vetan, int venta, int id_Articulo, int cantidad, String Precio_Unitario, String impuesto, String total) {
        this.id_Detalle_vetan = id_Detalle_vetan;
        this.venta = venta;
        this.id_Articulo = id_Articulo;
        this.cantidad = cantidad;
        this.Precio_Unitario = Precio_Unitario;
        this.impuesto = impuesto;
        this.total = total;
    }

    public int getId_Detalle_vetan() {
        return id_Detalle_vetan;
    }

    public void setId_Detalle_vetan(int id_Detalle_vetan) {
        this.id_Detalle_vetan = id_Detalle_vetan;
    }

    public int getVenta() {
        return venta;
    }

    public void setVenta(int venta) {
        this.venta = venta;
    }

    public int getId_Articulo() {
        return id_Articulo;
    }

    public void setId_Articulo(int id_Articulo) {
        this.id_Articulo = id_Articulo;
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
