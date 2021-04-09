
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
public class Proveedor implements Serializable
{
    @Id
    @Column (name = "provNIT", nullable = false )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer provNIT;
    
    @Column(length = 45, nullable = false)
    private String empresaProv;
    
    @Column (length = 45, nullable = true)
    private String dirProv;
    
    @Column (length = 45, nullable = false)
    private String emailProv;

    @Column (length = 45, nullable = false)
    private Integer administrador_idAdmin; //FK
    
    @Column (length = 45, nullable = false)
    private Integer stock_idStock; //FK
   
//<editor-fold defaultstate="collapsed" desc="Getters && Setters">
    public Integer getProvNIT() {
        return provNIT;
    }

    public void setProvNIT(Integer provNIT) {
        this.provNIT = provNIT;
    }

    public String getEmpresaProv() {
        return empresaProv;
    }

    public void setEmpresaProv(String empresaProv) {
        this.empresaProv = empresaProv;
    }

    public String getDirProv() {
        return dirProv;
    }

    public void setDirProv(String dirProv) {
        this.dirProv = dirProv;
    }

    public String getEmailProv() {
        return emailProv;
    }

    public void setEmailProv(String emailProv) {
        this.emailProv = emailProv;
    }

    public Integer getAdministrador_idAdmin() {
        return administrador_idAdmin;
    }

    public void setAdministrador_idAdmin(Integer administrador_idAdmin) {
        this.administrador_idAdmin = administrador_idAdmin;
    }

    public Integer getStock_idStock() {
        return stock_idStock;
    }

    public void setStock_idStock(Integer stock_idStock) {
        this.stock_idStock = stock_idStock;
    }
//</editor-fold>

    @Override
    public String toString() {
        return "Usuario{" + "provNIT=" + provNIT + ", empresaProv=" + empresaProv + ", dirProv=" + dirProv + ", emailProv=" + emailProv + ", administrador_idAdmin=" + administrador_idAdmin + ", stock_idStock=" + stock_idStock +  '}';
    }     
}
