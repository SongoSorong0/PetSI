
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
public class Servicios implements Serializable
{
    @Id
    @Column (name = "idServi", nullable = false )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idServi;
    
    @Column(length = 45, nullable = false)
    private String nomServ;
    
    @Column (length = 45, nullable = true)
    private String encrgServ;
    
    @Column (length = 45, nullable = false)
    private String areaServ;
        
//<editor-fold defaultstate="collapsed" desc="Getters && Setters">
    public Integer getIdServi() {
        return idServi;
    }

    public void setIdServi(Integer idServi) {
        this.idServi = idServi;
    }

    public String getNomServ() {
        return nomServ;
    }

    public void setNomServ(String nomServ) {
        this.nomServ = nomServ;
    }

    public String getEncrgServ() {
        return encrgServ;
    }

    public void setEncrgServ(String encrgServ) {
        this.encrgServ = encrgServ;
    }

    public String getAreaServ() {
        return areaServ;
    }

    public void setAreaServ(String areaServ) {
        this.areaServ = areaServ;
    }
//</editor-fold>

    @Override
    public String toString() {
        return "Usuario{" + "idServi=" + idServi + ", nomServ=" + nomServ + ", encrgServ=" + encrgServ + ", areaServ=" + areaServ + '}';
    }
    
    
       
}
