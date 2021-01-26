
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
public class Contacto_Usuario implements Serializable
{
    @Id
    @Column (name = "idContacto", nullable = false )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idContacto;
    
    @Column(length = 45, nullable = false)
    private int telUsu;
    
    @Column (length = 45, nullable = true)
    private String dirUsu;
    
    @Column (length = 45, nullable = false)
    private Integer Usuarios_IDUs;
  
//<editor-fold defaultstate="collapsed" desc="Getters && Setters">
    public Integer getIdContacto() {
        return idContacto;
    }

    public void setIdContacto(Integer idContacto) {
        this.idContacto = idContacto;
    }

    public int getTelUsu() {
        return telUsu;
    }

    public void setTelUsu(int telUsu) {
        this.telUsu = telUsu;
    }

    public String getDirUsu() {
        return dirUsu;
    }

    public void setDirUsu(String dirUsu) {
        this.dirUsu = dirUsu;
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
        return "Usuario{" + "idContacto=" + idContacto + ", telUsu=" + telUsu + ", dirUsu=" + dirUsu + ", Usuarios_IDUs=" + Usuarios_IDUs + '}';
    }
    
    
       
}
