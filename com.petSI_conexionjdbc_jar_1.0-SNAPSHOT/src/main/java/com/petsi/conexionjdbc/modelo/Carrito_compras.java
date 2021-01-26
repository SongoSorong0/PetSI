
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
public class Carrito_compras implements Serializable
{
    @Id
    @Column (name = "idCompra", nullable = false )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCompra;
    
    @Column(length = 45,name = "cartProd", nullable = false)
    private String cantProd;
    
    @Column (length = 45, nullable = true)
    private String PrecioCar;
    
    @Column (length = 45, nullable = false)
    private String Recibo_idRecibo;
    
    @Column (length = 45, nullable = false)
    private String Cajero_IDUs;

    
  

//<editor-fold defaultstate="collapsed" desc="Getters && Setters">
public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public String getCantProd() {
        return cantProd;
    }

    public void setCantProd(String cantProd) {
        this.cantProd = cantProd;
    }

    public String getPrecioCar() {
        return PrecioCar;
    }

    public void setPrecioCar(String PrecioCar) {
        this.PrecioCar = PrecioCar;
    }

    public String getRecibo_idRecibo() {
        return Recibo_idRecibo;
    }

    public void setRecibo_idRecibo(String Recibo_idRecibo) {
        this.Recibo_idRecibo = Recibo_idRecibo;
    }

    public String getCajero_IDUs() {
        return Cajero_IDUs;
    }

    public void setCajero_IDUs(String Cajero_IDUs) {
        this.Cajero_IDUs = Cajero_IDUs;
    }
//</editor-fold>

    @Override
    public String toString() {
        return "Usuario{" + "idCompra=" + idCompra + ", cantProd=" + cantProd + ", PrecioCar=" + PrecioCar + ", Recibo_idRecibo=" + Recibo_idRecibo + ", Cajero_IDUs=" + Cajero_IDUs + '}';
    }

    public void setIDUs(Integer IDUs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setPrimNomUsu(String primNomUsu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setSegNomUsu(String SegNomUsu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setPrimApeUsu(String PrimApeUsu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setSegApeUsu(String SegApeUsu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getPrimNomUsu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getIDUs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getSegNomUsu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getPrimApeUsu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getSegApeUsu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
       
}
