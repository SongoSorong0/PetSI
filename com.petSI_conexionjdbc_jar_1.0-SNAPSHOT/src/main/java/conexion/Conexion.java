/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import enums.ConexionExceptionEnum;
import excepciones.ConexionException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion 
{
    private static Connection conexion;
    private Conexion()
    {
        
    }
    public static Connection getInstance () throws ConexionException
    {
        if (Objects.isNull(conexion)) 
        {
            inicarConexion();
        }
        return conexion;
    }
    
    private static void inicarConexion() throws ConexionException
    {
        try 
        {
        Properties propiedadesConexion = new Properties();
        propiedadesConexion.put ("url","jdbc:mysql://localhost:3306/importpetsi?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
        propiedadesConexion.put ("user","root");
        propiedadesConexion.put ("password","mePongosongo1");
        conexion = DriverManager.getConnection(propiedadesConexion.getProperty("url"));
        } 
        catch (SQLException ex) 
        {
            throw new ConexionException(ConexionExceptionEnum.ERROR_CONEXION, ex);
        }
    }
}
