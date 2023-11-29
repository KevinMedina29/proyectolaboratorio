/*
create table MetodoPago(
	ID_Metodo_Pago int identity(1,1)primary key,
	Metodo varchar(100) not null
) ;*/
package models;


public class viewmodelmetodospago {
    private int id_Metodo_Pago;
    private String metodo;

    public viewmodelmetodospago() {
    }

    public viewmodelmetodospago(int id_Metodo_Pago, String metodo) {
        this.id_Metodo_Pago = id_Metodo_Pago;
        this.metodo = metodo;
    }

    public int getId_Metodo_Pago() {
        return id_Metodo_Pago;
    }

    public void setId_Metodo_Pago(int id_Metodo_Pago) {
        this.id_Metodo_Pago = id_Metodo_Pago;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }
    
}
