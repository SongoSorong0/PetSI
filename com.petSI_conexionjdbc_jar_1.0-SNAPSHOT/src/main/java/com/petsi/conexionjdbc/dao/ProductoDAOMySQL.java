
package com.petsi.conexionjdbc.dao;

import com.petsi.conexionjdbc.modelo.Usuario;
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
    public void registrar(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario consultarPoridUsu(Integer idUsu) throws ConexionException{
        try {
            PreparedStatement ps = Conexion.getInstance()
                    .prepareStatement("SELECT * FROM importpetsi.usuarios WHERE idUsu =?");
            ps.setInt(1, idUsu);
            ResultSet rs = ps.executeQuery();
            Usuario u = null;
            if (rs.next()) {
                u = new Usuario();
                u.setidUsu(rs.getInt("idUsu"));
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
    public List<Usuario> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizarr(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario consultarPorIDUs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
