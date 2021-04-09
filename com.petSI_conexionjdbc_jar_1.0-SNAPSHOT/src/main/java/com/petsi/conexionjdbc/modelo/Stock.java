
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
@Table(name = "stock")
public class Stock implements Serializable
{
    @Id
    @Column (name = "idStock", nullable = false )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn (name = "proveedor" , referencedColumnName = "stock_idStock")
    
    @JoinColumn (name = "productos" , referencedColumnName = "stock_idStock")
    private Integer idStock;
    
    @Column(length = 45, nullable = false)
    private String prodStock;
    
    @Column (length = 45, nullable = true)
    private int cantidadStock;
    
    @Column (name = "dispanStock",length = 45, nullable = false)
    private int disponStock;

    @Column (length = 45, nullable = false)
    private Integer Administrador_idAdmin; //FK

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

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public int getDisponStock() {
        return disponStock;
    }

    public void setDisponStock(int disponStock) {
        this.disponStock = disponStock;
    }

    public Integer getAdministrador_idAdmin() {
        return Administrador_idAdmin;
    }

    public void setAdministrador_idAdmin(Integer Administrador_idAdmin) {
        this.Administrador_idAdmin = Administrador_idAdmin;
    }
//</editor-fold>

    @Override
    public String toString() {
        return "Usuario{" + "idStock=" + idStock + ", prodStock=" + prodStock + ", cantidadStock=" + cantidadStock + ", disponStock=" + disponStock + ", Administrador_idAdmin=" + Administrador_idAdmin +"IDUs=" +  '}';
    }
    
    
       
}
