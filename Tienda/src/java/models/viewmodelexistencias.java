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
    private int ID_Existencia;
    private int ID_Articulo;
    private int cantidad;
    private Date fechaIngreso;
    private String ubicacion;
    private String precioCompra;
    private String precioVenta;
    private String estado;

    public viewmodelexistencias(int ID_Existencia, int ID_Articulo, int cantidad, Date fechaIngreso, String ubicacion, String precioCompra, String precioVenta, String estado) {
        this.ID_Existencia = ID_Existencia;
        this.ID_Articulo = ID_Articulo;
        this.cantidad = cantidad;
        this.fechaIngreso = fechaIngreso;
        this.ubicacion = ubicacion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.estado = estado;
    }

    public viewmodelexistencias() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @return the ID_existencia
     */
    public int getID_Existencia() {
        return ID_Existencia;
    }

    /**
     * @param ID_Existencia the ID_Existencia to set
     */
    public void setID_Existencia(int ID_Existencia) {
        this.ID_Existencia = ID_Existencia;
    }

    /**
     * @return the ID_Articulo
     */
    public int getID_Articulo() {
        return ID_Articulo;
    }

    /**
     * @param ID_Articulo the ID_articulo to set
     */
    public void setID_Articulo(int ID_Articulo) {
        this.ID_Articulo = ID_Articulo;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the fechaIngreso
     */
    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * @param fechaIngreso the fechaIngreso to set
     */
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    /**
     * @return the ubicacion
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * @param ubicacion the ubicacion to set
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * @return the precioCompra
     */
    public String getPrecioCompra() {
        return precioCompra;
    }

    /**
     * @param precioCompra the precioCompra to set
     */
    public void setPrecioCompra(String precioCompra) {
        this.precioCompra = precioCompra;
    }

    /**
     * @return the precioVenta
     */
    public String getPrecioVenta() {
        return precioVenta;
    }

    /**
     * @param precioVenta the precioVenta to set
     */
    public void setPrecioVenta(String precioVenta) {
        this.precioVenta = precioVenta;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    
}
