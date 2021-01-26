
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
public class Veterinarios implements Serializable
{
    @Id
    @Column (name = "id_vet", nullable = false )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_vet;
    
    @Column(length = 45, nullable = false)
    private Integer citas_id_cita;
    
    @Column (length = 45, nullable = true)
    private Integer Usuarios_IDUs;    
      
    
//<editor-fold defaultstate="collapsed" desc="Getters && Setters">
     public Integer getId_vet() {
        return id_vet;
    }

    public void setId_vet(Integer id_vet) {
        this.id_vet = id_vet;
    }

    public Integer getCitas_id_cita() {
        return citas_id_cita;
    }

    public void setCitas_id_cita(Integer citas_id_cita) {
        this.citas_id_cita = citas_id_cita;
    }

    public Integer getUsuarios_IDUs() {
        return Usuarios_IDUs;
    }

    public void setUsuarios_IDUs(Integer Usuarios_IDUs) {
        this.Usuarios_IDUs = Usuarios_IDUs;
    }
//</editor-fold>

    @Override
    public String toString() {
        return "Usuario{" + "id_vet=" + id_vet + ", citas_id_cita=" + citas_id_cita + ", Usuarios_IDUs=" + Usuarios_IDUs + '}';
    }
    
    
       
}
