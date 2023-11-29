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

public class viewmodelarticulos {
    private int id_Articulo;
    private String Codigo;
    private String descripcion;
    private double precio;
    private int id_Subcategoria;
    private int id_Proveedor;
    private int id_Categoria;

    public viewmodelarticulos() {
    }

    public viewmodelarticulos(int id_Articulo, String nombreArticuloo, String descripcion, double precio, int id_Subcategoria, int id_Proveedo, int id_Categoria) {
        this.id_Articulo = id_Articulo;
        this.Codigo = Codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.id_Subcategoria = id_Subcategoria;
        this.id_Proveedor = id_Proveedo;
        this.id_Categoria = id_Categoria;
    }

    public int getId_Articulo() {
        return id_Articulo;
    }

    public void setId_Articulo(int id_Articulo) {
        this.id_Articulo = id_Articulo;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getId_Subcategoria() {
        return id_Subcategoria;
    }

    public void setId_Subcategoria(int id_Subcategoria) {
        this.id_Subcategoria = id_Subcategoria;
    }

    public int getId_Proveedo() {
        return id_Proveedor;
    }

    public void setId_Proveedo(int id_Proveedo) {
        this.id_Proveedor = id_Proveedo;
    }

    public int getId_Categoria() {
        return id_Categoria;
    }

    public void setId_Categoria(int id_Categoria) {
        this.id_Categoria = id_Categoria;
    }
    
}
