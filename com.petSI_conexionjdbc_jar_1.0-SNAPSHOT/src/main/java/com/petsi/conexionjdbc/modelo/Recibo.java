
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
public class Recibo implements Serializable
{
    @Id
    @Column (name = "idRecibo", nullable = false )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRecibo;
    
    @Column(length = 45, nullable = false)
    private String precioNeto;
    
    @Column (length = 45, nullable = true)
    private String ivaRecibo;
    
    @Column (length = 45, nullable = false)
    private String descuentoRecibo;
    
    @Column (length = 45, nullable = false)
    private String Cajero_idUsusario;

    @Column (length = 45, nullable = false)
    private String cajero_catalogo_idCatalogo;
    
//<editor-fold defaultstate="collapsed" desc="Getters && Setters">
    public Integer getIdRecibo() {
        return idRecibo;
    }

    public void setIdRecibo(Integer idRecibo) {
        this.idRecibo = idRecibo;
    }

    public String getPrecioNeto() {
        return precioNeto;
    }

    public void setPrecioNeto(String precioNeto) {
        this.precioNeto = precioNeto;
    }

    public String getIvaRecibo() {
        return ivaRecibo;
    }

    public void setIvaRecibo(String ivaRecibo) {
        this.ivaRecibo = ivaRecibo;
    }

    public String getDescuentoRecibo() {
        return descuentoRecibo;
    }

    public void setDescuentoRecibo(String descuentoRecibo) {
        this.descuentoRecibo = descuentoRecibo;
    }

    public String getCajero_idUsusario() {
        return Cajero_idUsusario;
    }

    public void setCajero_idUsusario(String Cajero_idUsusario) {
        this.Cajero_idUsusario = Cajero_idUsusario;
    }

    public String getCajero_catalogo_idCatalogo() {
        return cajero_catalogo_idCatalogo;
    }

    public void setCajero_catalogo_idCatalogo(String cajero_catalogo_idCatalogo) {
        this.cajero_catalogo_idCatalogo = cajero_catalogo_idCatalogo;
    }
//</editor-fold>

    @Override
    public String toString() {
        return "Usuario{" + "idRecibo=" + idRecibo + ", precioNeto=" + precioNeto + ", ivaRecibo=" + ivaRecibo + ", descuentoRecibo=" + descuentoRecibo + ", Cajero_idUsusario=" + Cajero_idUsusario + ", cajero_catalogo_idCatalogo=" + cajero_catalogo_idCatalogo + '}';
    }
    
    
       
}
