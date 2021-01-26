
package com.petsi.conexionjdbc.dao;


import com.petsi.conexionjdbc.modelo.Carrito_compras;
import com.petsi.conexionjdbc.modelo.builders.UsuarioBuilder;
import excepciones.ConexionException;
import java.util.List;

public interface UsuarioDAO 
{
    void registrar(Carrito_compras usuario) throws ConexionException;
    
    Carrito_compras consultarPorIDUs(Integer IDUs)throws ConexionException;
    
    List<Carrito_compras> consultarTodos();
    
    void actualizar(Carrito_compras usuario);
    
    void eliminarPorId(Integer id);

    public Carrito_compras consultarPorIDUs();

    public void registrar(UsuarioBuilder ur);
    
}
