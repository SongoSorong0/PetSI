
package com.petsi.conexionjdbc.dao;

import com.petsi.conexionjdbc.modelo.Usuario;

import com.petsi.conexionjdbc.modelo.builders.UsuarioBuilder;
import conexion.Conexion;
import enums.ConexionExceptionEnum;
import excepciones.ConexionException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public  class UsuarioDAOMySQL implements UsuarioDAO
{

    @Override
    public void registrar(Usuario usuario) throws ConexionException
    {
        try
        {
        PreparedStatement ps = Conexion.getInstance()
        .prepareStatement("INSERT INTO bd_petsi_feb.usuarioo(idUsu,primNomUsu,segNomUsu,PrimApeUsu,SegApeUsu,Rol_Usuario_idRol_Usuario)"
        + " VALUES(?,?,?,?,?,?,?)");
        ps.setInt(1, usuario.getidUsu());
        ps.setString(2, usuario.getPrimNomUsu());
        ps.setString(3, usuario.getSegNomUsu());
        ps.setString(4, usuario.getPrimApeUsu());
        ps.setString(5, usuario.getSegApeUsu());
        ps.setInt(6, usuario.getRol_Usuario_idRol_Usuario());
        ps.setInt(7, usuario.getRol_Usuarios().getIdRol_Usuario());
        ps.execute();
        ps.close();
        }
        catch(SQLException ex) 
        {
            throw new ConexionException(ConexionExceptionEnum.ERROR_ACTUALIZACION, ex);         
        }
    }

    @Override
    public Usuario consultarPoridUsu(Integer idUsu) throws ConexionException{
        try {
            PreparedStatement ps = Conexion.getInstance()
                    .prepareStatement("SELECT * FROM bd_petsi_feb.usuarioo WHERE idUsu =?");
            ps.setInt(1, idUsu);
            ResultSet rs = ps.executeQuery();
            Usuario u = null;
            if (rs.next()) {
                u = new Usuario();
                u.setidUsu(rs.getInt("idUsu"));
                u.setPrimNomUsu(rs.getString("primNom"));
                u.setSegNomUsu(rs.getString("segNombre"));
                u.setPrimApeUsu(rs.getString("primApellido"));
                u.setSegApeUsu(rs.getString("segApelUsu"));
                //u.setRol_Usuarios();
                u.setRol_Usuarios(null);
                //u.setRol_Usuario_idRol_Usuario();
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
    public void actualizar(Usuario usuario) throws ConexionException{
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario consultarPoridUsu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    /*
    @Override
    public void registrar(UsuarioBuilder ur) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    @Override
    public void registrar(UsuarioBuilder ur) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /*@Override
    public void registrar(Usuario usuario) throws ConexionException {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
}
