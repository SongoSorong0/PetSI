
package com.petsi.conexionjdbc.modelo.builders;

import com.petsi.conexionjdbc.modelo.Usuario;

public class UsuarioBuilder 
{
    private Usuario usuario;

    private UsuarioBuilder() 
    {
        usuario = new Usuario();
    }
    
    public static UsuarioBuilder builder()
    {
        return new UsuarioBuilder();
    }
     public  UsuarioBuilder IDUs(Integer IDUs)
    {
        usuario.setIDUs(IDUs);
        return  this;
    }
    public  UsuarioBuilder primNomUsu(String primNomUsu)
    {
        usuario.setPrimNomUsu(primNomUsu);
        return  this;
    }
    public  UsuarioBuilder primApeUsu(String primNomUsu)
    {
        usuario.setPrimApeUsu(primNomUsu);
        return  this;
    }
    
   
    
    public Usuario build()
    {
        return usuario;
    }
    
    
}
