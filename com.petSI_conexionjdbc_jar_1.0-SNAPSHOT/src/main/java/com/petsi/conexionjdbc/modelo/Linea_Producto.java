
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
@Table(name = "linea")
public class Linea_Producto implements Serializable
{
    @Id
    @Column (name = "IdLinea", nullable = false )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdLinea;
    
    @Column(length = 45, nullable = false)
    private String ctgProd;
    
    
//<editor-fold defaultstate="collapsed" desc="Getters && Setters">
        public Integer getIdLinea() {
        return IdLinea;
    }

    public void setIdLinea(Integer IdLinea) {
        this.IdLinea = IdLinea;
    }

    public String getCtgProd() {
        return ctgProd;
    }

    public void setCtgProd(String ctgProd) {
        this.ctgProd = ctgProd;
    }
//</editor-fold>

    @Override
    public String toString() {
        return "Usuario{" + "IdLinea=" + IdLinea + ", ctgProd=" + ctgProd +  '}';
    }
    
    
       
}
