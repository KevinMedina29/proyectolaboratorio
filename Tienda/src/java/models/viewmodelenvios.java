/*

create table Envios(
    ID_Envio int identity(1,1) primary key,
    ID_Cliente int not null,
	ID_Empleado int not null,
    FechaEnvio datetime not null,
    Estado varchar(50) not null,
    MetodoEnvio varchar(100),
    Notas nvarchar(max)
);*/
package models;

import java.util.Date;


public class viewmodelenvios {
    private int id_Envio;
    private int id_cliente;
    private int id_empleado;
    private Date fechaenvio;
    private String estado;
    private String metodoenvio;
    private String notas;

    public viewmodelenvios() {
    }

    public viewmodelenvios(int id_Envio, int id_cliente, int id_empleado, Date fechaenvio, String estado, String metodoenvio, String notas) {
        this.id_Envio = id_Envio;
        this.id_cliente = id_cliente;
        this.id_empleado = id_empleado;
        this.fechaenvio = fechaenvio;
        this.estado = estado;
        this.metodoenvio = metodoenvio;
        this.notas = notas;
    }

    public int getId_Envio() {
        return id_Envio;
    }

    public void setId_Envio(int id_Envio) {
        this.id_Envio = id_Envio;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public Date getFechaenvio() {
        return fechaenvio;
    }

    public void setFechaenvio(Date fechaenvio) {
        this.fechaenvio = fechaenvio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMetodoenvio() {
        return metodoenvio;
    }

    public void setMetodoenvio(String metodoenvio) {
        this.metodoenvio = metodoenvio;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }
    
    
}
