/*
create table Venta(
	ID_Venta int identity(1,1) primary key,
	ID_Empleado int NOT NULL,
	ID_Cliente int NOT NULL,
	Tipo_Comprobante varchar(20) NOT NULL,
	Serie_Comprobante varchar(7) NOT NULL,
	Num_Comprobante varchar(10) NOT NULL,
	Fecha datetime NOT NULL,
	ID_Metodo_Pago int NOT NULL,
	Estado varchar(20) NOT NULL,
	ID_Reserva int not null */
package models;

import java.util.Date;


public class viewmodelventa {
    private int ID_Venta;
    private int ID_Empleado;
    private int ID_Cliente;
    private String Tipo_Comprobante;
    private String Serie_Comprobante;
    private String Num_Comprobante;
    private Date fecha;
    private int ID_Metodo_Pago;
    private String estado;
    private int ID_Reserva;

    public viewmodelventa(int ID_Venta, int ID_Empleado, int ID_Cliente, String Tipo_Comprobante, String Serie_Comprobante, String Num_Comprobante, Date fecha, int ID_Metodo_Pago, String estado, int ID_Reserva) {
        this.ID_Venta = ID_Venta;
        this.ID_Empleado = ID_Empleado;
        this.ID_Cliente = ID_Cliente;
        this.Tipo_Comprobante = Tipo_Comprobante;
        this.Serie_Comprobante = Serie_Comprobante;
        this.Num_Comprobante = Num_Comprobante;
        this.fecha = fecha;
        this.ID_Metodo_Pago = ID_Metodo_Pago;
        this.estado = estado;
        this.ID_Reserva = ID_Reserva;
    }

    /**
     * @return the ID_Venta
     */
    public int getID_Venta() {
        return ID_Venta;
    }

    /**
     * @param ID_Venta the ID_Venta to set
     */
    public void setID_Venta(int ID_Venta) {
        this.ID_Venta = ID_Venta;
    }

    /**
     * @return the ID_Empleado
     */
    public int getID_Empleado() {
        return ID_Empleado;
    }

    /**
     * @param ID_Empleado the ID_Empleado to set
     */
    public void setID_Empleado(int ID_Empleado) {
        this.ID_Empleado = ID_Empleado;
    }

    /**
     * @return the ID_Cliente
     */
    public int getID_Cliente() {
        return ID_Cliente;
    }

    /**
     * @param ID_Cliente the ID_Cliente to set
     */
    public void setID_Cliente(int ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
    }

    /**
     * @return the Tipo_Comprobante
     */
    public String getTipo_Comprobante() {
        return Tipo_Comprobante;
    }

    /**
     * @param Tipo_Comprobante the Tipo_Comprobante to set
     */
    public void setTipo_Comprobante(String Tipo_Comprobante) {
        this.Tipo_Comprobante = Tipo_Comprobante;
    }

    /**
     * @return the Serie_Comprobante
     */
    public String getSerie_Comprobante() {
        return Serie_Comprobante;
    }

    /**
     * @param Serie_Comprobante the Serie_Comprobante to set
     */
    public void setSerie_Comprobante(String Serie_Comprobante) {
        this.Serie_Comprobante = Serie_Comprobante;
    }

    /**
     * @return the Num_Comprobante
     */
    public String getNum_Comprobante() {
        return Num_Comprobante;
    }

    /**
     * @param Num_Comprobante the Num_Comprobante to set
     */
    public void setNum_Comprobante(String Num_Comprobante) {
        this.Num_Comprobante = Num_Comprobante;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the ID_Metodo_Pago
     */
    public int getID_Metodo_Pago() {
        return ID_Metodo_Pago;
    }

    /**
     * @param ID_Metodo_Pago the ID_Metodo_Pago to set
     */
    public void setID_Metodo_Pago(int ID_Metodo_Pago) {
        this.ID_Metodo_Pago = ID_Metodo_Pago;
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

    /**
     * @return the ID_Reserva
     */
    public int getID_Reserva() {
        return ID_Reserva;
    }

    /**
     * @param ID_Reserva the ID_Reserva to set
     */
    public void setID_Reserva(int ID_Reserva) {
        this.ID_Reserva = ID_Reserva;
    }

    
}
