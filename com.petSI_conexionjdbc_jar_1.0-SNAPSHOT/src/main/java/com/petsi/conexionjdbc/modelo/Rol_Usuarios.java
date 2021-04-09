
package com.petsi.conexionjdbc.modelo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rol_usuario")
public class Rol_Usuarios implements Serializable
{
    @Id
    @Column (name = "idRol_Usuario", nullable = false )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRol_Usuario;
    
    @Column(length = 45, nullable = false)
    private String Rol_Usuario;
    
    @Column(length = 45, nullable = false)
    private String descrip_RolUsu;
    
    /*@Column(length = 45, nullable = false)
    private Integer Usuario_IDUs;*/
    
    //@OneToOne
    //@JoinColumn (name /*FK*/= "id_Usu")
    //private  Usuario Usuario_IDUs;
    
    //<editor-fold defaultstate="collapsed" desc="Getters && Setters">

    public Integer getIdRol_Usuario() {
        return idRol_Usuario;
    }

    public void setIdRol_Usuario(Integer idRol_Usuario) {
        this.idRol_Usuario = idRol_Usuario;
    }

    public String getRol_Usuario() {
        return Rol_Usuario;
    }

    public void setRol_Usuario(String Rol_Usuario) {
        this.Rol_Usuario = Rol_Usuario;
    }

    public String getDescrip_RolUsu() {
        return descrip_RolUsu;
    }

    public void setDescrip_RolUsu(String descrip_RolUsu) {
        this.descrip_RolUsu = descrip_RolUsu;
    }

    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="equal $$ HaschCode">
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.idRol_Usuario);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Rol_Usuarios other = (Rol_Usuarios) obj;
        if (!Objects.equals(this.idRol_Usuario, other.idRol_Usuario)) {
            return false;
        }
        return true;
    }
//</editor-fold>
    
    
    /*@Override
    public String toString() {
        return "Rol_Usuarios{" + "idRol_Usuario=" + idRol_Usuario + ", Rol_Usuario=" + Rol_Usuario + ", descrip_RolUsu=" + descrip_RolUsu + '}';
    }
    */

    @Override
    public String toString() {
        return "Rol_Usuarios{" + "idRol_Usuario=" + idRol_Usuario + ", Rol_Usuario=" + Rol_Usuario + ", descrip_RolUsu=" + descrip_RolUsu + '}';
    }
          
    
}
