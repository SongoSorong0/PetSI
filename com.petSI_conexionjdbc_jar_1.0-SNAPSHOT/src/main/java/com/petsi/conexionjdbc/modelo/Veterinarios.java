
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
@Table(name = "veterinario")
public class Veterinarios implements Serializable
{
    @Id
    @Column (name = "id_vet", nullable = false )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn (name = "agenda" , referencedColumnName = "vererinarios_id_vet")
    
    @JoinColumn (name = "citas" , referencedColumnName = "vererinarios_id_vet")
    
    @JoinColumn (name = "citas" , referencedColumnName = "vererinarios_id_vet")
    private Integer id_vet;
  
    @Column (length = 45, nullable = false)
    private Integer Usuarios_idUsu; //FK         
    
    @Column(length = 45, nullable = false)
    private String especialidad_Vet; //FK
    
//<editor-fold defaultstate="collapsed" desc="Getters && Setters">

    public Integer getId_vet() {
        return id_vet;
    }

    public void setId_vet(Integer id_vet) {
        this.id_vet = id_vet;
    }

    public Integer getUsuarios_idUsu() {
        return Usuarios_idUsu;
    }

    public void setUsuarios_idUsu(Integer Usuarios_idUsu) {
        this.Usuarios_idUsu = Usuarios_idUsu;
    }

    public String getEspecialidad_Vet() {
        return especialidad_Vet;
    }

    public void setEspecialidad_Vet(String especialidad_Vet) {
        this.especialidad_Vet = especialidad_Vet;
    }
     
    
    
    
    
    
//</editor-fold>

    @Override
    public String toString() {
        return "Veterinarios{" + "id_vet=" + id_vet + ", Usuarios_idUsu=" + Usuarios_idUsu + ", especialidad_Vet=" + especialidad_Vet + '}';
    }

       
}
