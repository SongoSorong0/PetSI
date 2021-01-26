
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
public class Productos implements Serializable
{
    @Id
    @Column (name = "idProducto", nullable = false )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProducto;
    
    @Column(length = 45, nullable = false)
    private String nomProd;
    
    @Column (length = 45, nullable = true)
    private String descriProd;
    
    @Column (length = 45, nullable = false)
    private String fechaVenciProd;
    
    @Column (length = 45, nullable = false)
    private String linea_idProducto;
    
    @Column (length = 45, nullable = false)
    private String Stock_idStock;
    
    @Column (length = 45, nullable = false)
    private String Catalogo_idCatalogo;
  
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

    public String getDescriProd() {
        return descriProd;
    }

    public void setDescriProd(String descriProd) {
        this.descriProd = descriProd;
    }

    public String getFechaVenciProd() {
        return fechaVenciProd;
    }

    public void setFechaVenciProd(String fechaVenciProd) {
        this.fechaVenciProd = fechaVenciProd;
    }

    public String getLinea_idProducto() {
        return linea_idProducto;
    }

    public void setLinea_idProducto(String linea_idProducto) {
        this.linea_idProducto = linea_idProducto;
    }

    public String getStock_idStock() {
        return Stock_idStock;
    }

    public void setStock_idStock(String Stock_idStock) {
        this.Stock_idStock = Stock_idStock;
    }

    public String getCatalogo_idCatalogo() {
        return Catalogo_idCatalogo;
    }

    public void setCatalogo_idCatalogo(String Catalogo_idCatalogo) {
        this.Catalogo_idCatalogo = Catalogo_idCatalogo;
    }
//</editor-fold>

    @Override
    public String toString() {
        return "Usuario{" + "idProducto=" + idProducto + ", nomProd=" + nomProd + ", descriProd=" + descriProd + ", fechaVenciProd=" + fechaVenciProd + ", linea_idProducto=" + linea_idProducto + ", Stock_idStock=" + Stock_idStock +", Catalogo_idCatalogo=" + Catalogo_idCatalogo + '}';
    }
    
    
       
}
