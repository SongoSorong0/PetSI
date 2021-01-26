
package com.petsi.conexionjdbc.dao;

import com.petsi.conexionjdbc.modelo.Carrito_compras;
import excepciones.ConexionException;
import java.util.List;

public interface ProductoDAO 
{
    void registrar(Carrito_compras usuario);
    
    Carrito_compras consultarPorIDUs(Integer IDUs)throws ConexionException;
    
    List<Carrito_compras> consultarTodos();
    
    void actualizarr(Carrito_compras usuario);
    
    void eliminarPorId(Integer id);

    public Carrito_compras consultarPorIDUs();
    
}
