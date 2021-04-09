
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
@Table(name = "recibo")
public class Recibo implements Serializable
{
    @Id
    @Column (name = "idRecibo", nullable = false )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn (name = "carrito de compras" , referencedColumnName = "Recibo_idRecibo")
    private Integer idRecibo;
    
    @Column(length = 45, nullable = false)
    private int PrecioNeto;
    
    @Column (length = 45, nullable = false)
    private Integer ivaRecibo;
    
    @Column (length = 45, nullable = false)
    private float dsctoRecibo;
    
    @Column (length = 45, nullable = false)
    private Integer Cajero_Catálogo_idCatálogo; //FK

    @Column (length = 45, nullable = false)
    private Integer usuario_idUsuario; //FK
    
//<editor-fold defaultstate="collapsed" desc="Getters && Setters">

    public Integer getIdRecibo() {
        return idRecibo;
    }

    public void setIdRecibo(Integer idRecibo) {
        this.idRecibo = idRecibo;
    }

    public int getPrecioNeto() {
        return PrecioNeto;
    }

    public void setPrecioNeto(int PrecioNeto) {
        this.PrecioNeto = PrecioNeto;
    }

    public Integer getIvaRecibo() {
        return ivaRecibo;
    }

    public void setIvaRecibo(Integer ivaRecibo) {
        this.ivaRecibo = ivaRecibo;
    }

    public float getDsctoRecibo() {
        return dsctoRecibo;
    }

    public void setDsctoRecibo(float dsctoRecibo) {
        this.dsctoRecibo = dsctoRecibo;
    }

    public Integer getCajero_Catálogo_idCatálogo() {
        return Cajero_Catálogo_idCatálogo;
    }

    public void setCajero_Catálogo_idCatálogo(Integer Cajero_Catálogo_idCatálogo) {
        this.Cajero_Catálogo_idCatálogo = Cajero_Catálogo_idCatálogo;
    }

    public Integer getUsuario_idUsuario() {
        return usuario_idUsuario;
    }

    public void setUsuario_idUsuario(Integer usuario_idUsuario) {
        this.usuario_idUsuario = usuario_idUsuario;
    }
 
//</editor-fold>

    @Override
    public String toString() {
        return "Recibo{" + "idRecibo=" + idRecibo + ", PrecioNeto=" + PrecioNeto + ", ivaRecibo=" + ivaRecibo + ", dsctoRecibo=" + dsctoRecibo + ", Cajero_Cat\u00e1logo_idCat\u00e1logo=" + Cajero_Catálogo_idCatálogo + ", usuario_idUsuario=" + usuario_idUsuario + '}';
    }         
}
