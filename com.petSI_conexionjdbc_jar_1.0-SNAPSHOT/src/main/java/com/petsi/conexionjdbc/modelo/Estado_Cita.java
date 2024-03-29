
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
@Table(name = "estado cita")
public class Estado_Cita implements Serializable
{
    @Id
    @Column (name = "id_estCita", nullable = false )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn (name = "citas" , referencedColumnName = "estado_cita_id_estCita")
    private Integer id_estCita;
    
    @Column(length = 45, nullable = false)
    private String estadoCita;
    
    @Column(length = 45, nullable = false)
    private String Descrip_estadoCita;
    
//<editor-fold defaultstate="collapsed" desc="Getters && Setters">

    public Integer getId_estCita() {
        return id_estCita;
    }

    public void setId_estCita(Integer id_estCita) {
        this.id_estCita = id_estCita;
    }

    public String getEstadoCita() {
        return estadoCita;
    }

    public void setEstadoCita(String estadoCita) {
        this.estadoCita = estadoCita;
    }

    public String getDescrip_estadoCita() {
        return Descrip_estadoCita;
    }

    public void setDescrip_estadoCita(String Descrip_estadoCita) {
        this.Descrip_estadoCita = Descrip_estadoCita;
    }

//</editor-fold>

    @Override
    public String toString() {
        return "Estado_Cita{" + "id_estCita=" + id_estCita + ", estadoCita=" + estadoCita + ", Descrip_estadoCita=" + Descrip_estadoCita + '}';
    }     
}
