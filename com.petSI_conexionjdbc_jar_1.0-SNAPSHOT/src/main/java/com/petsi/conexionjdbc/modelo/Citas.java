
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
@Table(name = "citas")
public class Citas implements Serializable
{
    @Id
    @Column (name = "id_cita", nullable = false )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_cita;
    
    @Column(length = 45, nullable = false)
    private Integer agenda_id_agd;//FK
    
    @Column (length = 45, nullable = true)
    private String tipoCita;
    
    @Column (length = 45, nullable = false)
    private Integer historia_clinica_id_histClin;//FK
    
    @Column (length = 45, nullable = false)//FK
    private Integer estado_cita_id_estCita;//FK
   
    @Column (length = 45, nullable = false)
    private Integer veterinario_id_vet;//FK
    
    @Column (length = 45, nullable = false)
    private Integer usuario_idUsu;//FK
    
//<editor-fold defaultstate="collapsed" desc="Getters && Setters">

    public Integer getId_cita() {
        return id_cita;
    }

    public void setId_cita(Integer id_cita) {
        this.id_cita = id_cita;
    }

    public Integer getAgenda_id_agd() {
        return agenda_id_agd;
    }

    public void setAgenda_id_agd(Integer agenda_id_agd) {
        this.agenda_id_agd = agenda_id_agd;
    }

    public String getTipoCita() {
        return tipoCita;
    }

    public void setTipoCita(String tipoCita) {
        this.tipoCita = tipoCita;
    }

    public Integer getHistoria_clinica_id_histClin() {
        return historia_clinica_id_histClin;
    }

    public void setHistoria_clinica_id_histClin(Integer historia_clinica_id_histClin) {
        this.historia_clinica_id_histClin = historia_clinica_id_histClin;
    }

    public Integer getEstado_cita_id_estCita() {
        return estado_cita_id_estCita;
    }

    public void setEstado_cita_id_estCita(Integer estado_cita_id_estCita) {
        this.estado_cita_id_estCita = estado_cita_id_estCita;
    }

    public Integer getVeterinario_id_vet() {
        return veterinario_id_vet;
    }

    public void setVeterinario_id_vet(Integer veterinario_id_vet) {
        this.veterinario_id_vet = veterinario_id_vet;
    }

    public Integer getUsuario_idUsu() {
        return usuario_idUsu;
    }

    public void setUsuario_idUsu(Integer usuario_idUsu) {
        this.usuario_idUsu = usuario_idUsu;
    }  
//</editor-fold>

    @Override
    public String toString() {
        return "Citas{" + "id_cita=" + id_cita + ", agenda_id_agd=" + agenda_id_agd + ", tipoCita=" + tipoCita + ", historia_clinica_id_histClin=" + historia_clinica_id_histClin + ", estado_cita_id_estCita=" + estado_cita_id_estCita + ", veterinario_id_vet=" + veterinario_id_vet + ", usuario_idUsu=" + usuario_idUsu + '}';
    }

    
    
    
       
}
