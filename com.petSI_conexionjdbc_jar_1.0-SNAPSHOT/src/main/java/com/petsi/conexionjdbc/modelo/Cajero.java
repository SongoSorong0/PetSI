
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
public class Cajero implements Serializable
{
    @Id
    @Column (name = "IdCaj", nullable = false )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdCaj;
    
    @Column(name = "Usuarios_IdUsu", length = 45, nullable = false)
    private Integer Usuarios_IDUs;

      
//<editor-fold defaultstate="collapsed" desc="Getters && Setters">
     public Integer getIdCaj() {
        return IdCaj;
    }

    public void setIdCaj(Integer IdCaj) {
        this.IdCaj = IdCaj;
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
        return "Usuario{" + "IdCaj=" + IdCaj + ", Usuarios_IDUs=" + Usuarios_IDUs + '}';
    }
    
    
       
}
