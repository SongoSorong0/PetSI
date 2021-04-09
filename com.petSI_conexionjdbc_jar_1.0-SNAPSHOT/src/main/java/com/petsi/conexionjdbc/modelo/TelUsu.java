
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
@Table(name = "telefonousu")
public class TelUsu implements Serializable
{
    @Id
    @Column (name = "telUsu1", nullable = false )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer telUsu1;
    
    @Column (length = 45, nullable = true)
    private int telUsu2;
    
    @Column (length = 45, nullable = true)
    private int telUsu3;
   
  
//<editor-fold defaultstate="collapsed" desc="Getters && Setters">

    public Integer getTelUsu1() {
        return telUsu1;
    }

    public void setTelUsu1(Integer telUsu1) {
        this.telUsu1 = telUsu1;
    }

    public int getTelUsu2() {
        return telUsu2;
    }

    public void setTelUsu2(int telUsu2) {
        this.telUsu2 = telUsu2;
    }

    public int getTelUsu3() {
        return telUsu3;
    }

    public void setTelUsu3(int telUsu3) {
        this.telUsu3 = telUsu3;
    }

//</editor-fold>

    @Override
    public String toString() {
        return "TelUsu{" + "telUsu1=" + telUsu1 + ", telUsu2=" + telUsu2 + ", telUsu3=" + telUsu3 + '}';
    }

    

    
    
}
