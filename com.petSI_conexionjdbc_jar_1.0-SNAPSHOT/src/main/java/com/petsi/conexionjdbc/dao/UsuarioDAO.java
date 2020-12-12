
package com.petsi.conexionjdbc.dao;


import com.petsi.conexionjdbc.modelo.Usuario;
import excepciones.ConexionException;
import java.util.List;

public interface UsuarioDAO 
{
    void registrar(Usuario usuario) throws ConexionException;
    
    Usuario consultarPorIDUs(Integer IDUs)throws ConexionException;
    
    List<Usuario> consultarTodos();
    
    void actualizar(Usuario usuario);
    
    void eliminarPorId(Integer id);

    public Usuario consultarPorIDUs();
    
}
