
package com.petsi.conexionjdbc.dao;

import com.petsi.conexionjdbc.modelo.Carrito_compras;
import com.petsi.conexionjdbc.modelo.builders.UsuarioBuilder;
import excepciones.ConexionException;
import java.util.List;

public class UsuarioDAOPostgreSQL implements UsuarioDAO{

    @Override
    public void registrar(Carrito_compras usuario) throws ConexionException{
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Carrito_compras consultarPorIDUs(Integer IDUs) throws ConexionException {
        System.out.println("Hago conexion a PostgreSQL");
        System.out.println("Consulto usuario de PostgreSQL" + IDUs);
        Carrito_compras u = new Carrito_compras();
        u.setIDUs(IDUs);
        u.setPrimNomUsu("Pedor");
        u.setPrimApeUsu("Diáz");
            return u;
    }
    

    @Override
    public List<Carrito_compras> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(Carrito_compras usuario) {
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

    @Override
    public void registrar(UsuarioBuilder ur) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
