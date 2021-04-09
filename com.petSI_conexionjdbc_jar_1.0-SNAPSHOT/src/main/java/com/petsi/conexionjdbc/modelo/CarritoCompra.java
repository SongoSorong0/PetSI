
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
@Table(name = "carrito de compras")
public class CarritoCompra implements Serializable
{
    @Id
    @Column (name = "idCompra", nullable = false )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn (name = "recibo" , referencedColumnName = "cajero_catalogo_idCatalogo")
    
    @JoinColumn (name = "productos" , referencedColumnName = "catalogo_idCatalogo")
    private Integer idCompra;
    
    @Column(length = 45, nullable = false)
    private Integer cantProd;
    
    @Column (length = 45, nullable = false)
    private Integer precioCar;
    
    @Column (length = 45, nullable = false)
    private Integer Recibo_idRecibo;//FK
    
    @Column (length = 45, nullable = false)
    private Integer Cajero_idUsuario;//FK
    
    @Column (length = 45, nullable = false)
    private Integer EstadoCompra_IDEstCompra;//FK
    
    @Column (length = 45, nullable = false)
    private Integer Usuarios_idUsu;//FK

  
//<editor-fold defaultstate="collapsed" desc="Getters && Setters">

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Integer getCantProd() {
        return cantProd;
    }

    public void setCantProd(Integer cantProd) {
        this.cantProd = cantProd;
    }

    public Integer getPrecioCar() {
        return precioCar;
    }

    public void setPrecioCar(Integer precioCar) {
        this.precioCar = precioCar;
    }

    public Integer getRecibo_idRecibo() {
        return Recibo_idRecibo;
    }

    public void setRecibo_idRecibo(Integer Recibo_idRecibo) {
        this.Recibo_idRecibo = Recibo_idRecibo;
    }

    public Integer getCajero_idUsuario() {
        return Cajero_idUsuario;
    }

    public void setCajero_idUsuario(Integer Cajero_idUsuario) {
        this.Cajero_idUsuario = Cajero_idUsuario;
    }

    public Integer getEstadoCompra_IDEstCompra() {
        return EstadoCompra_IDEstCompra;
    }

    public void setEstadoCompra_IDEstCompra(Integer EstadoCompra_IDEstCompra) {
        this.EstadoCompra_IDEstCompra = EstadoCompra_IDEstCompra;
    }

    public Integer getUsuarios_idUsu() {
        return Usuarios_idUsu;
    }

    public void setUsuarios_idUsu(Integer Usuarios_idUsu) {
        this.Usuarios_idUsu = Usuarios_idUsu;
    }
    
//</editor-fold>

    @Override
    public String toString() {
        return "CarritoCompra{" + "idCompra=" + idCompra + ", cantProd=" + cantProd + ", precioCar=" + precioCar + ", Recibo_idRecibo=" + Recibo_idRecibo + ", Cajero_idUsuario=" + Cajero_idUsuario + ", EstadoCompra_IDEstCompra=" + EstadoCompra_IDEstCompra + ", Usuarios_idUsu=" + Usuarios_idUsu + '}';
    }

      
}
