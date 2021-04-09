
package com.petsi.conexionjdbc.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "agenda")
public class Agenda implements Serializable
{
    @Id
    @Column (name = "id_agd", nullable = false )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn (name = "citas" , referencedColumnName = "agenda_id_agd")
    private Integer Id_agd;
    
    @Column(length = 45, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_agd ;
    
    @Column (length = 45, nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date inicioCita;
    
    @Column (length = 45, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date finCita;
    
    @Column (length = 45, nullable = false)
    private Integer Veterinarios_id_vet;
  
//<editor-fold defaultstate="collapsed" desc="Getters && Setters">

    public Integer getId_agd() {
        return Id_agd;
    }

    public void setId_agd(Integer Id_agd) {
        this.Id_agd = Id_agd;
    }

    public Date getFecha_agd() {
        return fecha_agd;
    }

    public void setFecha_agd(Date fecha_agd) {
        this.fecha_agd = fecha_agd;
    }

    public Date getInicioCita() {
        return inicioCita;
    }

    public void setInicioCita(Date inicioCita) {
        this.inicioCita = inicioCita;
    }

    public Date getFinCita() {
        return finCita;
    }

    public void setFinCita(Date finCita) {
        this.finCita = finCita;
    }

    public Integer getVeterinarios_id_vet() {
        return Veterinarios_id_vet;
    }

    public void setVeterinarios_id_vet(Integer Veterinarios_id_vet) {
        this.Veterinarios_id_vet = Veterinarios_id_vet;
    }

    
   
    
//</editor-fold>

    @Override
    public String toString() {
        return "Usuario{" + "Id_agd=" + Id_agd + ", fecha_agd=" + fecha_agd + ", inicioCita=" + inicioCita + ", finCita=" + finCita + ", Veterinarios_id_vet=" + Veterinarios_id_vet +  '}';
    }

//<editor-fold defaultstate="collapsed" desc="Equals && HashCode">    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.Id_agd);
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
        final Agenda other = (Agenda) obj;
        if (!Objects.equals(this.Id_agd, other.Id_agd)) {
            return false;
        }
        return true;
    }
//</editor-fold>    
    
       
}
