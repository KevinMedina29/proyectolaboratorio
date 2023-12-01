/*
create table MetodoPago(
	ID_Metodo_Pago int identity(1,1)primary key,
	Metodo varchar(100) not null
) ;*/
package models;

public class viewmodelmetodospago {

    private int ID_Metodo_Pago;
    private String metodo;

    public viewmodelmetodospago() {
    }

    public viewmodelmetodospago(int ID_Metodo_Pago, String metodo) {
        this.ID_Metodo_Pago = ID_Metodo_Pago;
        this.metodo = metodo;
    }

    public int getID_Metodo_Pago() {
        return ID_Metodo_Pago;
    }

    public void setID_Metodo_Pago(int ID_Metodo_Pago) {
        this.ID_Metodo_Pago = ID_Metodo_Pago;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }


}
