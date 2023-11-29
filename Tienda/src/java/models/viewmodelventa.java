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
    private int id_Venta;
    private int id_Empleado;
    private int id_Cliente;
    private String tipo_Comprobante;
    private String serie_Comprobante;
    private Date fecha;
    private int id_Metodo_Pago;
    private String estado;
    private int id_Reserva;

    public viewmodelventa() {
    }

    public viewmodelventa(int id_Venta, int id_Empleado, int id_Cliente, String tipo_Comprobante, String serie_Comprobante, Date fecha, int id_Metodo_Pago, String estado, int id_Reserva) {
        this.id_Venta = id_Venta;
        this.id_Empleado = id_Empleado;
        this.id_Cliente = id_Cliente;
        this.tipo_Comprobante = tipo_Comprobante;
        this.serie_Comprobante = serie_Comprobante;
        this.fecha = fecha;
        this.id_Metodo_Pago = id_Metodo_Pago;
        this.estado = estado;
        this.id_Reserva = id_Reserva;
    }

    public int getId_Venta() {
        return id_Venta;
    }

    public void setId_Venta(int id_Venta) {
        this.id_Venta = id_Venta;
    }

    public int getId_Empleado() {
        return id_Empleado;
    }

    public void setId_Empleado(int id_Empleado) {
        this.id_Empleado = id_Empleado;
    }

    public int getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public String getTipo_Comprobante() {
        return tipo_Comprobante;
    }

    public void setTipo_Comprobante(String tipo_Comprobante) {
        this.tipo_Comprobante = tipo_Comprobante;
    }

    public String getSerie_Comprobante() {
        return serie_Comprobante;
    }

    public void setSerie_Comprobante(String serie_Comprobante) {
        this.serie_Comprobante = serie_Comprobante;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getId_Metodo_Pago() {
        return id_Metodo_Pago;
    }

    public void setId_Metodo_Pago(int id_Metodo_Pago) {
        this.id_Metodo_Pago = id_Metodo_Pago;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getId_Reserva() {
        return id_Reserva;
    }

    public void setId_Reserva(int id_Reserva) {
        this.id_Reserva = id_Reserva;
    }
    
    
}
