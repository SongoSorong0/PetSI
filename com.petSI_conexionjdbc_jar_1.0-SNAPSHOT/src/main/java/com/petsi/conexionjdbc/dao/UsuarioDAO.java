
package com.petsi.conexionjdbc.dao;


import com.petsi.conexionjdbc.modelo.Usuario;
import com.petsi.conexionjdbc.modelo.builders.UsuarioBuilder;
import excepciones.ConexionException;
import java.util.List;

public interface UsuarioDAO 
{
    void registrar(Usuario usuario) throws ConexionException;
    
    Usuario consultarPoridUsu(Integer idUsu)throws ConexionException;
    
    List<Usuario> consultarTodos();
    
    void actualizar(Usuario usuario) throws ConexionException;
    
    void eliminarPorId(Integer id);

    public Usuario consultarPoridUsu();

    public void registrar(UsuarioBuilder ur);
    
}
