
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
public class Catalogo implements Serializable
{
    @Id
    @Column (name = "idCatalogo", nullable = false )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCatalogo;
    
    @Column(length = 45, nullable = false)
    private String dispon_Catalog;
    
    @Column (length = 45, nullable = true)
    private String servicios_idServicios;
  
//<editor-fold defaultstate="collapsed" desc="Getters && Setters">
    public Integer getIdCatalogo() {
        return idCatalogo;
    }

    public void setIdCatalogo(Integer idCatalogo) {
        this.idCatalogo = idCatalogo;
    }

    public String getDispon_Catalog() {
        return dispon_Catalog;
    }

    public void setDispon_Catalog(String dispon_Catalog) {
        this.dispon_Catalog = dispon_Catalog;
    }

    public String getServicios_idServicios() {
        return servicios_idServicios;
    }

    public void setServicios_idServicios(String servicios_idServicios) {
        this.servicios_idServicios = servicios_idServicios;
    }
//</editor-fold>

    @Override
    public String toString() {
        return "Usuario{" + "idCatalogo=" + idCatalogo + ", dispon_Catalog=" + dispon_Catalog + ", servicios_idServicios=" + servicios_idServicios + '}';
    }       
}
