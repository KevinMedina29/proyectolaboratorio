/*
create table Ingreso(
	ID_Ingreso int identity(1,1)primary key,
	ID_Empleado int NOT NULL,
	Tipo_Comprobante varchar(20) NOT NULL,
	Serie_Comprobante varchar(7) NOT NULL,
	Num_Comprobante varchar(10) NOT NULL,
	Fecha datetime NOT NULL,
	Total decimal(11, 2) NOT NULL,
	Estado varchar(20) NOT NULL
);
*/
package models;

import java.util.Date;


public class viewmodelingreso {
    private int id_Ingreso;
    private int id_Empleado;
    private String tipo_Comprobante;
    private String serie_Comprobante;
    private String um_Comprobante;
    private Date fecha;
    private String total;
    private String estado;

    public viewmodelingreso() {
    }

    public viewmodelingreso(int id_Ingreso, int id_Empleado, String tipo_Comprobante, String serie_Comprobante, String um_Comprobante, Date fecha, String total, String estado) {
        this.id_Ingreso = id_Ingreso;
        this.id_Empleado = id_Empleado;
        this.tipo_Comprobante = tipo_Comprobante;
        this.serie_Comprobante = serie_Comprobante;
        this.um_Comprobante = um_Comprobante;
        this.fecha = fecha;
        this.total = total;
        this.estado = estado;
    }

    public int getId_Ingreso() {
        return id_Ingreso;
    }

    public void setId_Ingreso(int id_Ingreso) {
        this.id_Ingreso = id_Ingreso;
    }

    public int getId_Empleado() {
        return id_Empleado;
    }

    public void setId_Empleado(int id_Empleado) {
        this.id_Empleado = id_Empleado;
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

    public String getUm_Comprobante() {
        return um_Comprobante;
    }

    public void setUm_Comprobante(String um_Comprobante) {
        this.um_Comprobante = um_Comprobante;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
