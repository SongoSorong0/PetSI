
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
@Table(name = "administrador")
public class administrador implements Serializable
{
    @Id
    @Column (name = "idADmin", nullable = false )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn (name = "proveedor" , referencedColumnName = "administrador_idAdmin")
    
    @JoinColumn (name = "stock" , referencedColumnName = "administrador_idAdmin")
    private Integer idADmin;
    
    @Column(length = 45, nullable = false)
    private String sedeAdmin;
    
    @Column (name = "Usuarios_idUsu" , length = 45, nullable = true)
    private Integer Usuarios_idUsu; //FK        
 
//<editor-fold defaultstate="collapsed" desc="Getters && Setters">

    public Integer getIdADmin() {
        return idADmin;
    }

    public void setIdADmin(Integer idADmin) {
        this.idADmin = idADmin;
    }

    public String getSedeAdmin() {
        return sedeAdmin;
    }

    public void setSedeAdmin(String sedeAdmin) {
        this.sedeAdmin = sedeAdmin;
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
        return "administrador{" + "idADmin=" + idADmin + ", sedeAdmin=" + sedeAdmin + ", Usuarios_idUsu=" + Usuarios_idUsu + '}';
    }

         
}
