/*
create table Articulo(
	ID_Articulo int identity(1,1)primary key ,
	ID_Categoria int NOT NULL,
	ID_Subcategoria int NOT NULL,
	Codigo varchar(50) NOT NULL,
	Precio_Venta decimal(11, 2) NOT NULL,
	Fecha_Vencimiento datetime NOT NULL,
	Descripcion varchar(255) NOT NULL,
	Imagen varchar(20) NOT NULL,
	Estado bit NOT NULL,
	ID_Proveedor int not null
); */
package models;

import java.util.Date;

public class viewmodelarticulos {
    private int ID_Articulo;
    private int ID_Categoria;
    private int ID_Subcategoria;
    private String codigo;
    private double Precio_Venta;
    private Date Fecha_Vencimiento;
    private String descripcion;
    private String imagen;
    private int estado;
    private int ID_Proveedor;

    public viewmodelarticulos(int ID_Articulo, int ID_Categoria, int ID_Subcategoria, String codigo, double Precio_Venta, Date Fecha_Vencimiento, String descripcion, String imagen, int estado, int ID_Proveedor) {
        this.ID_Articulo = ID_Articulo;
        this.ID_Categoria = ID_Categoria;
        this.ID_Subcategoria = ID_Subcategoria;
        this.codigo = codigo;
        this.Precio_Venta = Precio_Venta;
        this.Fecha_Vencimiento = Fecha_Vencimiento;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.estado = estado;
        this.ID_Proveedor = ID_Proveedor;
    }

    public viewmodelarticulos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @return the ID_Articulo
     */
    public int getID_Articulo() {
        return ID_Articulo;
    }

    /**
     * @param ID_Articulo the ID_Articulo to set
     */
    public void setID_Articulo(int ID_Articulo) {
        this.ID_Articulo = ID_Articulo;
    }

    /**
     * @return the ID_Categoria
     */
    public int getID_Categoria() {
        return ID_Categoria;
    }

    /**
     * @param ID_Categoria the ID_Categoria to set
     */
    public void setID_Categoria(int ID_Categoria) {
        this.ID_Categoria = ID_Categoria;
    }

    /**
     * @return the ID_Subcategoria
     */
    public int getID_Subcategoria() {
        return ID_Subcategoria;
    }

    /**
     * @param ID_Subcategoria the ID_Subcategoria to set
     */
    public void setID_Subcategoria(int ID_Subcategoria) {
        this.ID_Subcategoria = ID_Subcategoria;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the Precio_Venta
     */
    public double getPrecio_Venta() {
        return Precio_Venta;
    }

    /**
     * @param Precio_Venta the Precio_Venta to set
     */
    public void setPrecio_Venta(double Precio_Venta) {
        this.Precio_Venta = Precio_Venta;
    }

    /**
     * @return the Fecha_Vencimiento
     */
    public Date getFecha_Vencimiento() {
        return Fecha_Vencimiento;
    }

    /**
     * @param Fecha_Vencimiento the Fecha_Vencimiento to set
     */
    public void setFecha_Vencimiento(Date Fecha_Vencimiento) {
        this.Fecha_Vencimiento = Fecha_Vencimiento;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the imagen
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    /**
     * @return the estado
     */
    public int getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(int estado) {
        this.estado = estado;
    }

    /**
     * @return the ID_Proveedor
     */
    public int getID_Proveedor() {
        return ID_Proveedor;
    }

    /**
     * @param ID_Proveedor the ID_Proveedor to set
     */
    public void setID_Proveedor(int ID_Proveedor) {
        this.ID_Proveedor = ID_Proveedor;
    }

    
}
