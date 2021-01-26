
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
public class Stock implements Serializable
{
    @Id
    @Column (name = "idStock", nullable = false )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idStock;
    
    @Column(length = 45, nullable = false)
    private String prodStock;
    
    @Column (length = 45, nullable = true)
    private String cantidadStock;
    
    @Column (name = "dispanStock",length = 45, nullable = false)
    private String disponStock;

    @Column (length = 45, nullable = false)
    private String Administrador_idAdmin;
    
//<editor-fold defaultstate="collapsed" desc="Getters && Setters">
    public Integer getIdStock() {
        return idStock;
    }

    public void setIdStock(Integer idStock) {
        this.idStock = idStock;
    }

    public String getProdStock() {
        return prodStock;
    }

    public void setProdStock(String prodStock) {
        this.prodStock = prodStock;
    }

    public String getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(String cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public String getDisponStock() {
        return disponStock;
    }

    public void setDisponStock(String disponStock) {
        this.disponStock = disponStock;
    }

    public String getAdministrador_idAdmin() {
        return Administrador_idAdmin;
    }

    public void setAdministrador_idAdmin(String Administrador_idAdmin) {
        this.Administrador_idAdmin = Administrador_idAdmin;
    }
//</editor-fold>

    @Override
    public String toString() {
        return "Usuario{" + "idStock=" + idStock + ", prodStock=" + prodStock + ", cantidadStock=" + cantidadStock + ", disponStock=" + disponStock + ", Administrador_idAdmin=" + Administrador_idAdmin +"IDUs=" +  '}';
    }
    
    
       
}
