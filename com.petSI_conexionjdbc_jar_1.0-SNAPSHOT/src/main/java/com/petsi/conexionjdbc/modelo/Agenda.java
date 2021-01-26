
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
public class Agenda implements Serializable
{
    @Id
    @Column (name = "Id_agd", nullable = false )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id_agd;
    
    @Column(length = 45, nullable = false)
    private String fecha_agd;
    
    @Column (length = 45, nullable = true)
    private String inicioCita;
    
    @Column (length = 45, nullable = false)
    private String finCita;
    
    @Column (length = 45, nullable = false)
    private String Veterinarios_id_vet;

//<editor-fold defaultstate="collapsed" desc="Getters && Setters">
    public Integer getId_agd() {
        return Id_agd;
    }

    public void setId_agd(Integer Id_agd) {
        this.Id_agd = Id_agd;
    }

    public String getFecha_agd() {
        return fecha_agd;
    }

    public void setFecha_agd(String fecha_agd) {
        this.fecha_agd = fecha_agd;
    }

    public String getInicioCita() {
        return inicioCita;
    }

    public void setInicioCita(String inicioCita) {
        this.inicioCita = inicioCita;
    }

    public String getFinCita() {
        return finCita;
    }

    public void setFinCita(String finCita) {
        this.finCita = finCita;
    }

    public String getVeterinarios_id_vet() {
        return Veterinarios_id_vet;
    }

    public void setVeterinarios_id_vet(String Veterinarios_id_vet) {
        this.Veterinarios_id_vet = Veterinarios_id_vet;
    }
//</editor-fold>

    @Override
    public String toString() {
        return "Usuario{" + "Id_agd=" + Id_agd + ", fecha_agd=" + fecha_agd + ", inicioCita=" + inicioCita + ", finCita=" + finCita + ", Veterinarios_id_vet=" + Veterinarios_id_vet +  '}';
    }
    
    
       
}
