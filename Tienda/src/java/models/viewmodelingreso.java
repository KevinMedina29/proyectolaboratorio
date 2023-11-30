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
    private int ID_Ingreso;
    private int ID_Empleado;
    private String Tipo_Comprobante;
    private String Serie_Comprobante;
    private String Num_Comprobante;
    private Date fecha;
    private String total;
    private String estado;

    public viewmodelingreso(int ID_Ingreso, int ID_Empleado, String Tipo_Comprobante, String Serie_Comprobante, String Num_Comprobante, Date fecha, String total, String estado) {
        this.ID_Ingreso = ID_Ingreso;
        this.ID_Empleado = ID_Empleado;
        this.Tipo_Comprobante = Tipo_Comprobante;
        this.Serie_Comprobante = Serie_Comprobante;
        this.Num_Comprobante = Num_Comprobante;
        this.fecha = fecha;
        this.total = total;
        this.estado = estado;
    }

    /**
     * @return the ID_Ingreso
     */
    public int getID_Ingreso() {
        return ID_Ingreso;
    }

    /**
     * @param ID_Ingreso the ID_Ingreso to set
     */
    public void setID_Ingreso(int ID_Ingreso) {
        this.ID_Ingreso = ID_Ingreso;
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
     * @return the total
     */
    public String getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(String total) {
        this.total = total;
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
