
package com.petsi.conexionjdbc.modelo;

import java.io.Serializable;
import java.util.Date;
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
@Table(name = "productos")
public class Productos implements Serializable
{
    @Id
    @Column (name = "idProducto", nullable = false )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProducto;
    
    @Column(length = 45, nullable = false)
    private String nomProd;
    
    @Column (length = 45, nullable = true)
    private String PrecioProd;
    
    @Column (length = 45, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVencProd;
    
    @Column (length = 45, nullable = false)
    private Integer Linea_idProducto; //FK
    
    @Column (length = 45, nullable = false)
    private Integer Stock_idStock; //FK
    
    @Column (length = 45, nullable = false)
    private Integer carritoCompras_idCompra; //FK
  
//<editor-fold defaultstate="collapsed" desc="Getters && Setters">

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNomProd() {
        return nomProd;
    }

    public void setNomProd(String nomProd) {
        this.nomProd = nomProd;
    }

    public String getPrecioProd() {
        return PrecioProd;
    }

    public void setPrecioProd(String PrecioProd) {
        this.PrecioProd = PrecioProd;
    }

    public Date getFechaVencProd() {
        return fechaVencProd;
    }

    public void setFechaVencProd(Date fechaVencProd) {
        this.fechaVencProd = fechaVencProd;
    }

    public Integer getLinea_idProducto() {
        return Linea_idProducto;
    }

    public void setLinea_idProducto(Integer Linea_idProducto) {
        this.Linea_idProducto = Linea_idProducto;
    }

    public Integer getStock_idStock() {
        return Stock_idStock;
    }

    public void setStock_idStock(Integer Stock_idStock) {
        this.Stock_idStock = Stock_idStock;
    }

    public Integer getCarritoCompras_idCompra() {
        return carritoCompras_idCompra;
    }

    public void setCarritoCompras_idCompra(Integer carritoCompras_idCompra) {
        this.carritoCompras_idCompra = carritoCompras_idCompra;
    }

//</editor-fold>

    @Override
    public String toString() {
        return "Productos{" + "idProducto=" + idProducto + ", nomProd=" + nomProd + ", PrecioProd=" + PrecioProd + ", fechaVencProd=" + fechaVencProd + ", Linea_idProducto=" + Linea_idProducto + ", Stock_idStock=" + Stock_idStock + ", carritoCompras_idCompra=" + carritoCompras_idCompra + '}';
    }

    
    
    
       
}
