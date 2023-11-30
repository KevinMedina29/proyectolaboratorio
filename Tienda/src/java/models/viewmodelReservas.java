/*
create table Reservas(
    ID_Reserva int identity(1,1) primary key,
    ID_Cliente int not null,
    FechaInicio datetime not null,
    FechaFin datetime not null,
    Estado varchar(50) not null,
    Notas nvarchar(max)
);
) ;*/
package models;

import java.util.Date;


public class viewmodelReservas {
    private int ID_Reserva;
    private int ID_Cliente;
    private Date fechaInicio;
    private Date fechaFin;
    private String estado;
    private String notas;

    public viewmodelReservas(int ID_Reserva, int ID_Cliente, Date fechaInicio, Date fechaFin, String estado, String notas) {
        this.ID_Reserva = ID_Reserva;
        this.ID_Cliente = ID_Cliente;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
        this.notas = notas;
    }

    public viewmodelReservas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
     * @return the fechaInicio
     */
    public Date getFechaInicio() {
        return fechaInicio;
    }

    /**
     * @param fechaInicio the fechaInicio to set
     */
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * @return the fechaFin
     */
    public Date getFechaFin() {
        return fechaFin;
    }

    /**
     * @param fechaFin the fechaFin to set
     */
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
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
     * @return the notas
     */
    public String getNotas() {
        return notas;
    }

    /**
     * @param notas the notas to set
     */
    public void setNotas(String notas) {
        this.notas = notas;
    }

    
}
