
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
@Table(name = "servicios")
public class Servicios implements Serializable
{
    @Id
    @Column (name = "idServi", nullable = false )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn (name = "catalogo" , referencedColumnName = "servicios_idServicios")
    private Integer idServi;
    
    @Column(length = 45, nullable = false)
    private String nomServ;
    
    @Column (length = 45, nullable = true)
    private String DescServ;
    
    @Column (length = 45, nullable = false)
    private String encrgServ;
    
    @Column (length = 45, nullable = false)
    private String areaServ;
    
    @Column (length = 45, nullable = false)
    private Integer veterinarios_id_vet; //FK
        
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

    public String getDescServ() {
        return DescServ;
    }

    public void setDescServ(String DescServ) {
        this.DescServ = DescServ;
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

    public Integer getVeterinarios_id_vet() {
        return veterinarios_id_vet;
    }

    public void setVeterinarios_id_vet(Integer veterinarios_id_vet) {
        this.veterinarios_id_vet = veterinarios_id_vet;
    }
  
//</editor-fold>

    @Override
    public String toString() {
        return "Servicios{" + "idServi=" + idServi + ", nomServ=" + nomServ + ", DescServ=" + DescServ + ", encrgServ=" + encrgServ + ", areaServ=" + areaServ + ", veterinarios_id_vet=" + veterinarios_id_vet + '}';
    }

    
    
    
       
}
