
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
@Table(name = "estado compra")
public class Estado_Compra implements Serializable
{
    @Id
    @Column (name = "IDEstCompra", nullable = false )
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer IDEstCompra;
    
    @Column(length = 45, nullable = false)
    private String EstCompra;   
    
    @Column(length = 45, nullable = false)
    private String descrip_estCompra;
  
//<editor-fold defaultstate="collapsed" desc="Getters && Setters">
    public Integer getIDEstCompra() {
        return IDEstCompra;
    }

    public void setIDEstCompra(Integer IDEstCompra) {
        this.IDEstCompra = IDEstCompra;
    }

    public String getEstCompra() {
        return EstCompra;
    }

    public void setEstCompra(String EstCompra) {
        this.EstCompra = EstCompra;
    }

    public String getDescrip_estCompra() {
        return descrip_estCompra;
    }

    public void setDescrip_estCompra(String descrip_estCompra) {
        this.descrip_estCompra = descrip_estCompra;
    }

//</editor-fold>

    @Override
    public String toString() {
        return "Estado_Compra{" + "IDEstCompra=" + IDEstCompra + ", EstCompra=" + EstCompra + ", descrip_estCompra=" + descrip_estCompra + '}';
    }
   
}
