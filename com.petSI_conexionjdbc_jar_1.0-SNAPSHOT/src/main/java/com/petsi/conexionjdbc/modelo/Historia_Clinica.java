
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
@Table(name = "historia_clinica")
public class Historia_Clinica implements Serializable
{
    @Id
    @Column (name = "idHistClin", nullable = false )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn (name = "mascota" , referencedColumnName = "historia clínica_idHistClin")
    @JoinColumn (name = "formato adopcion" , referencedColumnName = "historia clínica_idHistClin")
    private Integer idHistClin;
    
    @Column(length = 45, nullable = false)
    private String estadoMascota;
    
    @Column (length = 45, nullable = true)
    private Integer tratamientos_médicos_idTraMed;
    
    @Column (length = 45, nullable = false)
    private Integer cita_id_cita;
    
//<editor-fold defaultstate="collapsed" desc="Getters && Setters">
        public Integer getIdHistClin() {
        return idHistClin;
    }

    public void setIdHistClin(Integer idHistClin) {
        this.idHistClin = idHistClin;
    }

    public String getEstadoMascota() {
        return estadoMascota;
    }

    public void setEstadoMascota(String estadoMascota) {
        this.estadoMascota = estadoMascota;
    }

    public Integer getTratamientos_médicos_idTraMed() {
        return tratamientos_médicos_idTraMed;
    }

    public void setTratamientos_médicos_idTraMed(Integer tratamientos_médicos_idTraMed) {
        this.tratamientos_médicos_idTraMed = tratamientos_médicos_idTraMed;
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
        return "Usuario{" + "idHistClin=" + idHistClin + ", estadoMascota=" + estadoMascota + ", tratamientos_médicos_idTraMed=" + tratamientos_médicos_idTraMed + ", cita_id_cita=" + cita_id_cita + '}';
    }
    
    
       
}
