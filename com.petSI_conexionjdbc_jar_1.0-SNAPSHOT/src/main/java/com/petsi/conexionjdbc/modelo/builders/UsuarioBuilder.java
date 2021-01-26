package com.petsi.conexionjdbc.modelo.builders;

import com.petsi.conexionjdbc.modelo.Carrito_compras;

public class UsuarioBuilder 
{
    private Carrito_compras usuario;

    private UsuarioBuilder() 
    {
        usuario = new Carrito_compras();
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

    public Carrito_compras build()
    {
        return usuario;
    }
    
    
}
