
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
@Table(name = "emailusu")
public class emailUsu implements Serializable
{
    @Id
    @Column (name = "emailUsu1", nullable = false )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String emailUsu1;
    
    @Column (length = 45, nullable = true)
    private String emailUsu2;
   
  
//<editor-fold defaultstate="collapsed" desc="Getters && Setters">

    public String getEmailUsu1() {
        return emailUsu1;
    }

    public void setEmailUsu1(String emailUsu1) {
        this.emailUsu1 = emailUsu1;
    }

    public String getEmailUsu2() {
        return emailUsu2;
    }

    public void setEmailUsu2(String emailUsu2) {
        this.emailUsu2 = emailUsu2;
    }

//</editor-fold>

    @Override
    public String toString() {
        return "emailUsu{" + "emailUsu1=" + emailUsu1 + ", emailUsu2=" + emailUsu2 + '}';
    }

    
    
}
