
package com.petsi.conexionjdbc.dao;

import com.petsi.conexionjdbc.modelo.Usuario;
import com.petsi.conexionjdbc.modelo.builders.UsuarioBuilder;
import excepciones.ConexionException;
import java.util.List;

public class UsuarioDAOPostgreSQL implements UsuarioDAO{

    @Override
    public void registrar(Usuario usuario) throws ConexionException{
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario consultarPoridUsu(Integer idUsu) throws ConexionException {
        System.out.println("Hago conexion a PostgreSQL");
        System.out.println("Consulto usuario de PostgreSQL" + idUsu);
        Usuario u = new Usuario();
        u.setidUsu(idUsu);
        u.setPrimNomUsu("Pedor");
        u.setPrimApeUsu("Diáz");
            return u;
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

    @Override
    public void registrar(UsuarioBuilder ur) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
