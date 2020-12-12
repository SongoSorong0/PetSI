
package com.petsi.conexionjdbc.dao;

import com.petsi.conexionjdbc.modelo.Usuario;
import excepciones.ConexionException;
import java.util.List;

public interface ProductoDAO 
{
    void registrar(Usuario usuario);
    
    Usuario consultarPorIDUs(Integer IDUs)throws ConexionException;
    
    List<Usuario> consultarTodos();
    
    void actualizarr(Usuario usuario);
    
    void eliminarPorId(Integer id);

    public Usuario consultarPorIDUs();
    
}
