
package com.petsi.conexionjdbc.dao;

import com.petsi.conexionjdbc.modelo.Usuario;
import excepciones.ConexionException;
import java.util.List;

public class ProductoDAOPostgreSQL implements ProductoDAO{

    @Override
    public void registrar(Usuario usuario) {
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
