
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
@Table(name = "domiciliousu")
public class DomicilioUsu implements Serializable
{
    @Id
    @Column (name = "id_domicilioUsu", nullable = false )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_domicilioUsu;
    
    @Column(length = 45, nullable = false)
    private String direccionUsu1;
    
    @Column (length = 45, nullable = true)
    private String direccionUsu2;
   
  
//<editor-fold defaultstate="collapsed" desc="Getters && Setters">

    public Integer getId_domicilioUsu() {
        return id_domicilioUsu;
    }

    public void setId_domicilioUsu(Integer id_domicilioUsu) {
        this.id_domicilioUsu = id_domicilioUsu;
    }

    public String getDireccionUsu1() {
        return direccionUsu1;
    }

    public void setDireccionUsu1(String direccionUsu1) {
        this.direccionUsu1 = direccionUsu1;
    }

    public String getDireccionUsu2() {
        return direccionUsu2;
    }

    public void setDireccionUsu2(String direccionUsu2) {
        this.direccionUsu2 = direccionUsu2;
    }
   
//</editor-fold>

    @Override
    public String toString() {
        return "DomicilioUsu{" + "id_domicilioUsu=" + id_domicilioUsu + ", direccionUsu1=" + direccionUsu1 + ", direccionUsu2=" + direccionUsu2 + '}';
    }       
}
