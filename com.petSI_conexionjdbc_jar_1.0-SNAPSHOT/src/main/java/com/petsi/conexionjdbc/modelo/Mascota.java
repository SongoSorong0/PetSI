
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
public class Mascota implements Serializable
{
    @Id
    @Column (name = "id_Masc", nullable = false )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Masc;
    
    @Column(length = 45, nullable = true)
    private Integer edadMasc;
    
    @Column (length = 45, nullable = true)
    private String tipoMasc;
    
    @Column (length = 45, nullable = false)
    private String razaMasc;
    
    @Column (length = 45, nullable = false)
    private String nombreMasc;
    
    @Column (name = "sexsoMasc",length = 45, nullable = true)
    private String sexoMasc;
    
    @Column (name = "historia_clinica_id_histClin",length = 45, nullable = true)
    private Integer historia_clinica_id_histClin;
    
    @Column (length = 45, nullable = true)
    private Integer Usuarios_idUsu;
    
//<editor-fold defaultstate="collapsed" desc="Getters && Setters">
    public Integer getId_Masc() {
        return id_Masc;
    }

    public void setId_Masc(Integer id_Masc) {
        this.id_Masc = id_Masc;
    }

    public Integer getEdadMasc() {
        return edadMasc;
    }

    public void setEdadMasc(Integer edadMasc) {
        this.edadMasc = edadMasc;
    }

    public String getTipoMasc() {
        return tipoMasc;
    }

    public void setTipoMasc(String tipoMasc) {
        this.tipoMasc = tipoMasc;
    }

    public String getRazaMasc() {
        return razaMasc;
    }

    public void setRazaMasc(String razaMasc) {
        this.razaMasc = razaMasc;
    }

    public String getNombreMasc() {
        return nombreMasc;
    }

    public void setNombreMasc(String nombreMasc) {
        this.nombreMasc = nombreMasc;
    }

    public String getSexoMasc() {
        return sexoMasc;
    }

    public void setSexoMasc(String sexoMasc) {
        this.sexoMasc = sexoMasc;
    }

    public Integer getHistoria_clinica_id_histClin() {
        return historia_clinica_id_histClin;
    }

    public void setHistoria_clinica_id_histClin(Integer historia_clinica_id_histClin) {
        this.historia_clinica_id_histClin = historia_clinica_id_histClin;
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
        return "Usuario{" + "id_Masc=" + id_Masc + ", edadMasc=" + edadMasc + ", tipoMasc=" + tipoMasc + ", razaMasc=" + razaMasc + ", nombreMasc=" + nombreMasc + ", sexoMasc=" + sexoMasc + ", historia_clinica_id_histClin" + historia_clinica_id_histClin + ", Usuarios_idUsu=" + Usuarios_idUsu + '}';
    }
    
    
       
}
