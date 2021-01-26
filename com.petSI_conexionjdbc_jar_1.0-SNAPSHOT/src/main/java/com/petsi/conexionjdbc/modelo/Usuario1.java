
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
public class Usuario1 implements Serializable
{
    @Id
    @Column (name = "IDUs", nullable = false )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IDUs;
    
    @Column(length = 45, nullable = false)
    private String primNomUsu;
    
    @Column (length = 45, nullable = true)
    private String SegNomUsu;
    
    @Column (length = 45, nullable = false)
    private String PrimApeUsu;
    
    @Column (length = 45, nullable = false)
    private String SegApeUsu;
    
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn (name = "Rol_Usuarios" , referencedColumnName = "IdRolUsu")
    
    /*@Column (length = 10)
    private byte NumIdent;
    
    private String NombreUsuario;
    
    private String Clave;*/

//<editor-fold defaultstate="collapsed" desc="Getters && Setters">
    public Integer getIDUs() {
        return IDUs;
    }
    
    public void setIDUs(Integer IDUs) {
        this.IDUs = IDUs;
    }
    
    public String getPrimNomUsu() {
        return primNomUsu;
    }
    
    public void setPrimNomUsu(String primNomUsu) {
        this.primNomUsu = primNomUsu;
    }
    public String getSegNomUsu() {
        return SegNomUsu;
    }
    
    public void setSegNomUsu(String SegNomUsu) {
        this.SegNomUsu = SegNomUsu;
    }
    
    public String getPrimApeUsu() {
        return PrimApeUsu;
    }
    
    public void setPrimApeUsu(String PrimApeUsu) {
        this.PrimApeUsu = PrimApeUsu;
    }
    public String getSegApeUsu() {
        return SegApeUsu;
    }
    
    public void setSegApeUsu(String SegApeUsu) {
        this.SegApeUsu = SegApeUsu;
    }
    //NumIdent
    /*public byte getNumIdent() {
        return NumIdent;
    }
    
    public void setNumIdent(byte NumIdent) {
        this.NumIdent = NumIdent;
    }
    public String getNombreUsuario() {
        return NombreUsuario;
    }
    
    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }
    
    public String getClave() {
        return Clave;
    }
    
    public void setClave(String Clave) {
        this.Clave = Clave;
    }*/
//</editor-fold>

    @Override
    public String toString() {
        return "Usuario{" + "IDUs=" + IDUs + ", primNomUsu=" + primNomUsu + ", SegNomUsu=" + SegNomUsu + ", PrimApeUsu=" + PrimApeUsu + ", SegApeUsu=" + SegApeUsu + '}';
    }
    
    
       
}
