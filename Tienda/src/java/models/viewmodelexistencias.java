/*
CREATE TABLE ExistenciaProducto (
    ID_Existencia INT IDENTITY (1,1) PRIMARY KEY,
    ID_Articulo INT NOT NULL,
    Cantidad INT NOT NULL,
    FechaIngreso DATE NOT NULL,
    Ubicacion VARCHAR(100),
    PrecioCompra DECIMAL(11, 2) NOT NULL,
    PrecioVenta DECIMAL(11, 2) NOT NULL,
    Estado VARCHAR(20) NOT NULL
); */
package models;

import java.util.Date;

public class viewmodelexistencias {
    private int id_existencia;
    private int id_articulo;
    private int cantidad;
    private Date fechaIngreso;
    private String ubicacion;
    private String preciocompra;
    private String precioventa;
    private String estado;

    public viewmodelexistencias() {
    }

    public viewmodelexistencias(int id_existencia, int id_articulo, int cantidad, Date fechaIngreso, String ubicacion, String preciocompra, String precioventa, String estado) {
        this.id_existencia = id_existencia;
        this.id_articulo = id_articulo;
        this.cantidad = cantidad;
        this.fechaIngreso = fechaIngreso;
        this.ubicacion = ubicacion;
        this.preciocompra = preciocompra;
        this.precioventa = precioventa;
        this.estado = estado;
    }

    public int getId_existencia() {
        return id_existencia;
    }

    public void setId_existencia(int id_existencia) {
        this.id_existencia = id_existencia;
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

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getPreciocompra() {
        return preciocompra;
    }

    public void setPreciocompra(String preciocompra) {
        this.preciocompra = preciocompra;
    }

    public String getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(String precioventa) {
        this.precioventa = precioventa;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
