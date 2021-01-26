
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
public class Formato_Adopcion implements Serializable
{
    @Id
    @Column (name = "idFDormAdop", nullable = false )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFDormAdop;
    
    @Column(length = 45, nullable = false)
    private Integer Tratamientos_Medioctos_idTraMed;
    
    @Column (length = 45, nullable = true)
    private Integer Historia_Clinica_idHistClin;
    
    @Column (length = 45, nullable = false)
    private String Mascota_idMasc;
    
//<editor-fold defaultstate="collapsed" desc="Getters && Setters">
    public Integer getIdFDormAdop() {
        return idFDormAdop;
    }

    public void setIdFDormAdop(Integer idFDormAdop) {
        this.idFDormAdop = idFDormAdop;
    }

    public Integer getTratamientos_Medioctos_idTraMed() {
        return Tratamientos_Medioctos_idTraMed;
    }

    public void setTratamientos_Medioctos_idTraMed(Integer Tratamientos_Medioctos_idTraMed) {
        this.Tratamientos_Medioctos_idTraMed = Tratamientos_Medioctos_idTraMed;
    }

    public Integer getHistoria_Clinica_idHistClin() {
        return Historia_Clinica_idHistClin;
    }

    public void setHistoria_Clinica_idHistClin(Integer Historia_Clinica_idHistClin) {
        this.Historia_Clinica_idHistClin = Historia_Clinica_idHistClin;
    }

    public String getMascota_idMasc() {
        return Mascota_idMasc;
    }

    public void setMascota_idMasc(String Mascota_idMasc) {
        this.Mascota_idMasc = Mascota_idMasc;
    }
//</editor-fold>
 
    @Override
    public String toString() {
        return "Usuario{" + "idFDormAdop=" + idFDormAdop + ", Tratamientos_Medioctos_idTraMed=" + Tratamientos_Medioctos_idTraMed + ", Historia_Clinica_idHistClin=" + Historia_Clinica_idHistClin + ", Mascota_idMasc=" + Mascota_idMasc +  '}';
    }
    
    
       
}
