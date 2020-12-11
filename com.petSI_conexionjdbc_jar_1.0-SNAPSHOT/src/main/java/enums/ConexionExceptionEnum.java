/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

public enum ConexionExceptionEnum 
{
    ERROR_CONEXION("10001","Error al conectarse a al base de datos"),
    ERROR_CONSULTA("10002","Error al realizar la consulta"),
    ERROR_ACTUALIZACION("10003","Error al realizar la actualizacion");
    
    private String codigo;
    private String mensaje;

    private ConexionExceptionEnum(String codigo, String mensaje) 
    {
        this.codigo = codigo;
        this.mensaje = mensaje;
    }
    
    public String getCodigo()
    {
        return codigo;
    }
    
    public String getMensaje()
    {
        return mensaje;
    }
    
    
}
