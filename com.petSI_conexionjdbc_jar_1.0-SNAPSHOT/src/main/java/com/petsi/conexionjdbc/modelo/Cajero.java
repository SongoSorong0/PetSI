
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
@Table(name = "cajero")
public class Cajero implements Serializable
{
    @Id
    @Column (name = "IdCaj", nullable = false )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCaj;
    
    @Column(name = "SalarioCaj", length = 45, nullable = false)
    private Integer SalarioCaj; //FK
    
    @Column(name = "Usuarios_idUsu", length = 45, nullable = false)
    private Integer Usuarios_idUsu; //FK

    
//<editor-fold defaultstate="collapsed" desc="Getters && Setters">
    public Integer getIdCaj() {      
        return idCaj;
    }      

    public void setIdCaj(Integer idCaj) {
        this.idCaj = idCaj;
    }

    public Integer getSalarioCaj() {
        return SalarioCaj;
    }

    public void setSalarioCaj(Integer SalarioCaj) {
        this.SalarioCaj = SalarioCaj;
    }

    public Integer getUsuarios_idUsu() {
        return Usuarios_idUsu;
    }

    public void setUsuarios_idUsu(Integer Usuarios_idUsu) {
        this.Usuarios_idUsu = Usuarios_idUsu;
    }

//</editor-fold>
    
    @Override
    public String toString() {
        return "Cajero{" + "idCaj=" + idCaj + ", SalarioCaj=" + SalarioCaj + ", Usuarios_idUsu=" + Usuarios_idUsu + '}';
    }      
}
