
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
@Table(name = "tratamientos médicos")
public class Tratamientos_Medicos implements Serializable
{
    @Id
    @Column (name = "idTratMed", nullable = false )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn (name = "historia_clinica" , referencedColumnName = "tratamientos_medicos_idTratMed")
    
    @JoinColumn (name = "formato adopción" , referencedColumnName = "Tratamientos_Medioctos_idTraMed")
    private Integer idTratMed;
    
    @Column(length = 45, nullable = false)
    private Integer id_mascota;
    
    @Column (length = 45, nullable = false)
    private String interv_medica;
    
    @Column (length = 45, nullable = false)
    private String tipoInterv;
    
    @Column (length = 45, nullable = false)
    private float fecha_interv;
    
    @Column (length = 45, nullable = false)
    private String vacuna_med;
    
    @Column (length = 45, nullable = false)
    private float fecha_vacu;
    
    @Column (length = 45, nullable = false)
    private Integer mascotas_idMasc; //FK
    
    @Column (length = 45, nullable = false)
    private Integer cita_id_cita; //FK
    
//<editor-fold defaultstate="collapsed" desc="Getters && Setters">
    public Integer getIdTratMed() {
        return idTratMed;
    }

    public void setIdTratMed(Integer idTratMed) {
        this.idTratMed = idTratMed;
    }

    public Integer getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(Integer id_mascota) {
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

    public float getFecha_interv() {
        return fecha_interv;
    }

    public void setFecha_interv(float fecha_interv) {
        this.fecha_interv = fecha_interv;
    }

    public String getVacuna_med() {
        return vacuna_med;
    }

    public void setVacuna_med(String vacuna_med) {
        this.vacuna_med = vacuna_med;
    }

    public float getFecha_vacu() {
        return fecha_vacu;
    }

    public void setFecha_vacu(float fecha_vacu) {
        this.fecha_vacu = fecha_vacu;
    }

    public Integer getMascotas_idMasc() {
        return mascotas_idMasc;
    }

    public void setMascotas_idMasc(Integer mascotas_idMasc) {
        this.mascotas_idMasc = mascotas_idMasc;
    }

    public Integer getCita_id_cita() {
        return cita_id_cita;
    }

    public void setCita_id_cita(Integer cita_id_cita) {
        this.cita_id_cita = cita_id_cita;
    }
//</editor-fold>

    @Override
    public String toString() {
        return "Usuario{" + "idTratMed=" + idTratMed + ", id_mascota=" + id_mascota + ", interv_medica=" + interv_medica + ", tipoInterv=" + tipoInterv + ", fecha_interv=" + fecha_interv + ", tipoInterv=" + tipoInterv + ", vacuna_med=" + vacuna_med + ", tipoInterv=" + tipoInterv + ", fecha_vacu=" + fecha_vacu + ", tipoInterv=" + tipoInterv + ", mascotas_idMasc=" + mascotas_idMasc + ", tipoInterv=" + tipoInterv + ", cita_id_cita=" + cita_id_cita + '}';
    }
    
    
       
}
