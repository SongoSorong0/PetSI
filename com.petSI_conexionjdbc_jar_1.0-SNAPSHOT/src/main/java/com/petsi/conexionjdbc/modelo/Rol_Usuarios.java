
package com.petsi.conexionjdbc.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Rol_Ususarios")
public class Rol_Usuarios implements Serializable
{
    @Id
    @Column (name = "IdRolUsu", nullable = false )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdRolUsu;
    
    @Column(length = 45, nullable = false)
    private String RolUsu;
    
    @Column(length = 45, nullable = false)
    private Integer Usuario_IDUs;
        

//<editor-fold defaultstate="collapsed" desc="Getters && Setters">
    public Integer getIdRolUsu() {
    return IdRolUsu;
    }

    public void setIdRolUsu(Integer IdRolUsu) {
        this.IdRolUsu = IdRolUsu;
    }

    public String getRolUsu() {
        return RolUsu;
    }

    public void setRolUsu(String RolUsu) {
        this.RolUsu = RolUsu;
    }

    public Integer getUsuario_IDUs() {
        return Usuario_IDUs;
    }

    
    public void setUsuario_IDUs(Integer Usuario_IDUs) {
        this.Usuario_IDUs = Usuario_IDUs;
    }

//</editor-fold>
    
    @Override
    public String toString() {
        return "Rol_Usuarios{" + "IdRolUsu=" + IdRolUsu + ", RolUsu=" + RolUsu + ", Usuario_IDUs=" + Usuario_IDUs + '}';
    }
    
    
       
}
