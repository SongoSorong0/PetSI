package com.petsi.conexionjdbc.modelo.builders;

import com.petsi.conexionjdbc.modelo.Rol_Usuarios;
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
     public  UsuarioBuilder idUsu(Integer idUsu)
    {
        usuario.setidUsu(idUsu);
        return  this;
    }
    public  UsuarioBuilder primNomUsu(String primNomUsu)
    {
        usuario.setPrimNomUsu(primNomUsu);
        return  this;
    }
    public  UsuarioBuilder SegNomUsu(String SegNomUsu)
    {
        usuario.setSegNomUsu(SegNomUsu);
        return  this;
    }
    public  UsuarioBuilder PrimApeUsu(String PrimApeUsu)
    {
        usuario.setPrimApeUsu(PrimApeUsu);
        return  this;
    }
    public  UsuarioBuilder SegApeUsu(String SegApeUsu)
    {
        usuario.setSegApeUsu(SegApeUsu);
        return  this;
    }
    public  UsuarioBuilder Rol_Usuario_idRol_Usuario(Integer Rol_Usuario_idRol_Usuario)
    {
        usuario.setRol_Usuario_idRol_Usuario(Rol_Usuario_idRol_Usuario);
        return  this;
    }
    public UsuarioBuilder Rol_Usuarios (Rol_Usuarios rol_Usuarios){
        usuario.setRol_Usuarios(rol_Usuarios);
        return this;        
    }
    public Usuario build()
    {
        return usuario;
    }       
}

