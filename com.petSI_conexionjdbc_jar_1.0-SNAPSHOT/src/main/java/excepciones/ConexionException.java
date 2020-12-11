/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import enums.ConexionExceptionEnum;

public class ConexionException extends Exception
{
    
    private ConexionExceptionEnum tipo;

    public ConexionException(ConexionExceptionEnum tipo) 
    {
        super(tipo.getMensaje());
        this.tipo = tipo;
    }

    public ConexionException(ConexionExceptionEnum tipo, Throwable thrwbl) 
    {
        super(tipo.getMensaje(), thrwbl);
        this.tipo = tipo;
    }

    public ConexionExceptionEnum getTipo() 
    {
        return tipo;
    }
    
    
}
