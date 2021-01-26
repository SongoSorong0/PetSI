
package com.petsi.conexionjdbc.dao;

import com.petsi.conexionjdbc.modelo.Carrito_compras;
import conexion.Conexion;
import enums.ConexionExceptionEnum;
import excepciones.ConexionException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class ProductoDAOMySQL implements ProductoDAO
{

    @Override
    public void registrar(Carrito_compras usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Carrito_compras consultarPorIDUs(Integer IDUs) throws ConexionException{
        try {
            PreparedStatement ps = Conexion.getInstance()
                    .prepareStatement("SELECT * FROM importpetsi.usuarios WHERE IDUs =?");
            ps.setInt(1, IDUs);
            ResultSet rs = ps.executeQuery();
            Carrito_compras u = null;
            if (rs.next()) {
                u = new Carrito_compras();
                u.setIDUs(rs.getInt("IDUs"));
                u.setPrimNomUsu(rs.getString("PrimNomUsu"));
                u.setPrimApeUsu(rs.getString("PrimApeUsu"));
                //u.setNombreUsuario(rs.getString("NombreUsuario"));
                //u.setClave(rs.getString("Clave"));
                
            }
          return u;
        } catch (SQLException ex) {
           throw new ConexionException(ConexionExceptionEnum.ERROR_CONSULTA, ex);
        }
        
    }

    @Override
    public List<Carrito_compras> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizarr(Carrito_compras usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Carrito_compras consultarPorIDUs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
