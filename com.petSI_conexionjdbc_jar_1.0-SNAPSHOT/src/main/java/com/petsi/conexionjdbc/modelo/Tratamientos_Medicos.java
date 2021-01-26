
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
public class Tratamientos_Medicos implements Serializable
{
    @Id
    @Column (name = "idTratMed", nullable = false )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTratMed;
    
    @Column(length = 45, nullable = false)
    private String id_mascota;
    
    @Column (length = 45, nullable = true)
    private String interv_medica;
    
    @Column (length = 45, nullable = false)
    private String tipoInterv;
    
    @Column (length = 45, nullable = false)
    private String fecha_interv;
    
    @Column (length = 45, nullable = false)
    private String vacuna_med;
    
    @Column (length = 45, nullable = false)
    private String fecha_vacu;
    
    @Column (length = 45, nullable = false)
    private String mascotas_idMasc;
    
    @Column (length = 45, nullable = false)
    private String cita_id_cita;
        
//<editor-fold defaultstate="collapsed" desc="Getters && Setters">
    public Integer getIdTratMed() {
        return idTratMed;
    }

    public void setIdTratMed(Integer idTratMed) {
        this.idTratMed = idTratMed;
    }

    public String getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(String id_mascota) {
        this.id_mascota = id_mascota;
    }

    public String getInterv_medica() {
        return interv_medica;
    }

    public void setInterv_medica(String interv_medica) {
        this.interv_medica = interv_medica;
    }

    public String getTipoInterv() {
        return tipoInterv;
    }

    public void setTipoInterv(String tipoInterv) {
        this.tipoInterv = tipoInterv;
    }

    public String getFecha_interv() {
        return fecha_interv;
    }

    public void setFecha_interv(String fecha_interv) {
        this.fecha_interv = fecha_interv;
    }

    public String getVacuna_med() {
        return vacuna_med;
    }

    public void setVacuna_med(String vacuna_med) {
        this.vacuna_med = vacuna_med;
    }

    public String getFecha_vacu() {
        return fecha_vacu;
    }

    public void setFecha_vacu(String fecha_vacu) {
        this.fecha_vacu = fecha_vacu;
    }

    public String getMascotas_idMasc() {
        return mascotas_idMasc;
    }

    public void setMascotas_idMasc(String mascotas_idMasc) {
        this.mascotas_idMasc = mascotas_idMasc;
    }

    public String getCita_id_cita() {
        return cita_id_cita;
    }

    public void setCita_id_cita(String cita_id_cita) {
        this.cita_id_cita = cita_id_cita;
    }
//</editor-fold>

    @Override
    public String toString() {
        return "Usuario{" + "idTratMed=" + idTratMed + ", id_mascota=" + id_mascota + ", interv_medica=" + interv_medica + ", tipoInterv=" + tipoInterv + ", fecha_interv=" + fecha_interv + ", tipoInterv=" + tipoInterv + ", vacuna_med=" + vacuna_med + ", tipoInterv=" + tipoInterv + ", fecha_vacu=" + fecha_vacu + ", tipoInterv=" + tipoInterv + ", mascotas_idMasc=" + mascotas_idMasc + ", tipoInterv=" + tipoInterv + ", cita_id_cita=" + cita_id_cita + '}';
    }
    
    
       
}
