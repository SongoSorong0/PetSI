package com.petsi.conexionjdbc.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuarioo")
public class Usuario implements Serializable
{
    @Id
    @Column (name = "idUsu", nullable = false )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@OneToOne(fetch = FetchType.EAGER)
    

    //@JoinColumn (name = "veterinarios" , referencedColumnName = "Usuarios_idUsu")
    
    //@JoinColumn (name = "administrador" , referencedColumnName = "Usuarios_idUsu")
    
    //@JoinColumn (name = "cajero" , referencedColumnName = "Usuarios_idUsu")
    
    //@JoinColumn (name = "mascota" , referencedColumnName = "Usuarios_idUsu")
    
    //@JoinColumn (name = "citas" , referencedColumnName = "Usuarios_idUsu")
    
    //@JoinColumn (name = "carrito de compras" , referencedColumnName = "cajero_idUsuario")
    
    //@JoinColumn (name = "recibo" , referencedColumnName = "Usuarios_idUsu")
    private Integer idUsu;
    
    @Column(length = 45, nullable = false)
    private String primNomUsu;
    
    @Column (length = 45, nullable = true)
    private String SegNomUsu;
    
    @Column (length = 45, nullable = false)
    private String PrimApeUsu;
    
    @Column (length = 45, nullable = false)
    private String SegApeUsu;
    
    @Column (length = 45, nullable = false)
    private String NumIdent;
    
    @Column (length = 45, nullable = false)
    private String telefonoUsu_telUsu1;
    
    @Column (length = 45, nullable = false)
    private String emailUsu_emailUsu1;
    
    @Column (length = 45, nullable = false)
    private Integer Rol_Usuario_idRol_Usuario;
    
    
    @Column (length = 45, nullable = false)
    private String domicilioUsu_id_domicilioUsu;
    
    //FK
    @OneToOne (fetch = FetchType.LAZY)
    @JoinColumn (name /*FK*/= "Rol_Usuario_idRol_Usuario") //, referencedColumnName = "idRol_Usuario"
    private Rol_Usuarios Rol_Usuarios; 
    
    //<editor-fold defaultstate="collapsed" desc="Getters && Setters">
    public Integer getidUsu() {
        return idUsu;
    }

    public void setidUsu(Integer idUsu) {
        this.idUsu = idUsu;
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

    public String getNumIdent() {
        return NumIdent;
    }

    public void setNumIdent(String NumIdent) {
        this.NumIdent = NumIdent;
    }

    public String getTelefonoUsu_telUsu1() {
        return telefonoUsu_telUsu1;
    }

    public void setTelefonoUsu_telUsu1(String telefonoUsu_telUsu1) {
        this.telefonoUsu_telUsu1 = telefonoUsu_telUsu1;
    }

    public String getEmailUsu_emailUsu1() {
        return emailUsu_emailUsu1;
    }

    public void setEmailUsu_emailUsu1(String emailUsu_emailUsu1) {
        this.emailUsu_emailUsu1 = emailUsu_emailUsu1;
    }

    public Integer getRol_Usuario_idRol_Usuario() {
        return Rol_Usuario_idRol_Usuario;
    }

    public void setRol_Usuario_idRol_Usuario(Integer Rol_Usuario_idRol_Usuario) {
        this.Rol_Usuario_idRol_Usuario = Rol_Usuario_idRol_Usuario;
    }
    

    public String getDomicilioUsu_id_domicilioUsu() {
        return domicilioUsu_id_domicilioUsu;
    }

    public void setDomicilioUsu_id_domicilioUsu(String domicilioUsu_id_domicilioUsu) {
        this.domicilioUsu_id_domicilioUsu = domicilioUsu_id_domicilioUsu;
    }

    public Rol_Usuarios getRol_Usuarios() {
        return Rol_Usuarios;
    }

    public void setRol_Usuarios(Rol_Usuarios Rol_Usuarios) {
        this.Rol_Usuarios = Rol_Usuarios;
    }
    //</editor-fold>
   
    
    /*public void setIDUs(Integer IDUs) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    /*public Integer getIDUs() {
    return IDUs;
    }
    public void setId_agd(Integer IDUs) {
    this.IDUs = IDUs;¨*/

    @Override
    public String toString() {
        return "Usuario{" + "idUsu=" + idUsu + ", primNomUsu=" + primNomUsu + ", SegNomUsu=" + SegNomUsu + ", PrimApeUsu=" + PrimApeUsu + ", SegApeUsu=" + SegApeUsu + ", NumIdent=" + NumIdent + ", telefonoUsu_telUsu1=" + telefonoUsu_telUsu1 + ", emailUsu_emailUsu1=" + emailUsu_emailUsu1 + ", Rol_Usuario_idRol_Usuario=" + Rol_Usuario_idRol_Usuario + ", domicilioUsu_id_domicilioUsu=" + domicilioUsu_id_domicilioUsu + ", Rol_Usuarios=" + Rol_Usuarios + '}';
    }

    
    

    
   
}
