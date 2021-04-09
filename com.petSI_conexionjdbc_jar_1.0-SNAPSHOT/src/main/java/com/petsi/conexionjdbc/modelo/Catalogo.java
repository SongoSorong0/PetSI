
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
@Table(name = "catálogo")
public class Catalogo implements Serializable
{
    @Id
    @Column (name = "idCatálogo", nullable = false )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn (name = "recibo" , referencedColumnName = "cajero_catalogo_idCatalogo")
    
    @JoinColumn (name = "productos" , referencedColumnName = "catalogo_idCatalogo")
    private Integer idCatálogo;
    
    @Column(length = 45, nullable = false)
    private Integer dispon_Catalog;
    
    @Column (length = 45, nullable = false)
    private Integer imgCatálogos;
    
    @Column (length = 45, nullable = false)
    private Integer Productos_idProducto;//FK
    
    @Column (length = 45, nullable = false)
    private Integer Servicios_idServicios;//FK
  
//<editor-fold defaultstate="collapsed" desc="Getters && Setters">

    public Integer getIdCatálogo() {
        return idCatálogo;
    }

    public void setIdCatálogo(Integer idCatálogo) {
        this.idCatálogo = idCatálogo;
    }

    public Integer getDispon_Catalog() {
        return dispon_Catalog;
    }

    public void setDispon_Catalog(Integer dispon_Catalog) {
        this.dispon_Catalog = dispon_Catalog;
    }

    public Integer getImgCatálogos() {
        return imgCatálogos;
    }

    public void setImgCatálogos(Integer imgCatálogos) {
        this.imgCatálogos = imgCatálogos;
    }

    public Integer getProductos_idProducto() {
        return Productos_idProducto;
    }

    public void setProductos_idProducto(Integer Productos_idProducto) {
        this.Productos_idProducto = Productos_idProducto;
    }

    public Integer getServicios_idServicios() {
        return Servicios_idServicios;
    }

    public void setServicios_idServicios(Integer Servicios_idServicios) {
        this.Servicios_idServicios = Servicios_idServicios;
    }
  
//</editor-fold>

    @Override
    public String toString() {
        return "Catalogo{" + "idCat\u00e1logo=" + idCatálogo + ", dispon_Catalog=" + dispon_Catalog + ", imgCat\u00e1logos=" + imgCatálogos + ", Productos_idProducto=" + Productos_idProducto + ", Servicios_idServicios=" + Servicios_idServicios + '}';
    }      
}
