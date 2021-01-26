
package com.petsi.conexionjdbc.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Citas implements Serializable
{
    @Id
    @Column (name = "idCita", nullable = false )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCita;
    
    @Column(length = 45, nullable = false)
    private String Agenda_id_agd;
    
    @Column (length = 45, nullable = true)
    private String tipoCita;
    
    @Column (length = 45, nullable = false)
    private String estado_cita_id_estCita;
    
    @Column (length = 45, nullable = false)
    private String Usuarios_idUsu;
   
    @Column (length = 45, nullable = false)
    private String Mascotas_idMasc;
        
//<editor-fold defaultstate="collapsed" desc="Getters && Setters">
    public Integer getIdCita() {
        return idCita;
    }

    public void setIdCita(Integer idCita) {
        this.idCita = idCita;
    }

    public String getAgenda_id_agd() {
        return Agenda_id_agd;
    }

    public void setAgenda_id_agd(String Agenda_id_agd) {
        this.Agenda_id_agd = Agenda_id_agd;
    }

    public String getTipoCita() {
        return tipoCita;
    }

    public void setTipoCita(String tipoCita) {
        this.tipoCita = tipoCita;
    }

    public String getEstado_cita_id_estCita() {
        return estado_cita_id_estCita;
    }

    public void setEstado_cita_id_estCita(String estado_cita_id_estCita) {
        this.estado_cita_id_estCita = estado_cita_id_estCita;
    }

    public String getUsuarios_idUsu() {
        return Usuarios_idUsu;
    }

    public void setUsuarios_idUsu(String Usuarios_idUsu) {
        this.Usuarios_idUsu = Usuarios_idUsu;
    }

    public String getMascotas_idMasc() {
        return Mascotas_idMasc;
    }

    public void setMascotas_idMasc(String Mascotas_idMasc) {
        this.Mascotas_idMasc = Mascotas_idMasc;
    }

//</editor-fold>

    @Override
    public String toString() {
        return "Usuario{" + "idCita=" + idCita + ", Agenda_id_agd=" + Agenda_id_agd + ", tipoCita=" + tipoCita + ", estado_cita_id_estCita=" + estado_cita_id_estCita + ", Usuarios_idUsu=" + Usuarios_idUsu + ", Mascotas_idMasc=" + Mascotas_idMasc +  '}';
    }
    
    
       
}
