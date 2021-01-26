
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
public class administrador implements Serializable
{
    @Id
    @Column (name = "idAdmin", nullable = false )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAdmin;
    
    @Column(length = 45, nullable = false)
    private String dirAdmin;
    
    @Column (length = 45, nullable = true)
    private Integer Usuarios_IDUs;        

    

    
//<editor-fold defaultstate="collapsed" desc="Getters && Setters">
    public Integer getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(Integer idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getDirAdmin() {
        return dirAdmin;
    }

    public void setDirAdmin(String dirAdmin) {
        this.dirAdmin = dirAdmin;
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
        return "Usuario{" + "idAdmins=" + idAdmin + ", dirAdmin=" + dirAdmin + ", Usuarios_IDUs=" + Usuarios_IDUs +  '}';
    }
    
    
       
}
