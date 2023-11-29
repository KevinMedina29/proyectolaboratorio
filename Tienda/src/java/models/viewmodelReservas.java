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
    private int id_Reserva;
    private int id_Cliente;
    private Date FechaInicio;
    private Date FechaFin;
    private String Estado;
    private String Notas;

    public viewmodelReservas() {
    }

    public viewmodelReservas(int id_Reserva, int id_Cliente, Date FechaInicio, Date FechaFin, String Estado, String Notas) {
        this.id_Reserva = id_Reserva;
        this.id_Cliente = id_Cliente;
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
        this.Estado = Estado;
        this.Notas = Notas;
    }

    public int getId_Reserva() {
        return id_Reserva;
    }

    public void setId_Reserva(int id_Reserva) {
        this.id_Reserva = id_Reserva;
    }

    public int getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public Date getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(Date FechaFin) {
        this.FechaFin = FechaFin;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getNotas() {
        return Notas;
    }

    public void setNotas(String Notas) {
        this.Notas = Notas;
    }
    

}
