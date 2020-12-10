/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.petsi.conexionjdbc;

import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class Main 
{
    public static void main(String[] args) 
    {
        
        Properties propiedadesConexion = new Properties();
        propiedadesConexion.put ("url","jdbc:mysql://localhost:3306/importpetsi?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
        propiedadesConexion.put ("user","root");
        propiedadesConexion.put ("password","mePongosongo1");
        
        
        try {
            Connection conn = DriverManager.getConnection(
                    propiedadesConexion.getProperty("url"),
                    propiedadesConexion);
            System.out.println("Todo bien...");
            
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM importpetsi.usuarios");
            //ps.execute();
            //ResultSet rs = ps.getResultSet();
            ResultSet rs = ps.executeQuery();
                    
            while (rs.next()){
                
                int IDUs = rs.getInt("IDUs");
                String primNomUsu = rs.getString("primNomUsu");
                String SegNomUsu = rs.getString("SegNomUsu");
                String PrimApeUsu = rs.getString("PrimApeUsu");
                String SegApeUsu = rs.getString("SegApeUsu");
                
                System.out.println(String.format("id: %d - primNomUsu: %s - SegNomUsu: %s - PrimApeUsu: %s - SegApeUsu: %s" 
                       ,IDUs, primNomUsu, SegNomUsu, PrimApeUsu, SegApeUsu));
            }
            rs.close();
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("se presentó un error en la conexion...");
                    ex.printStackTrace();
        }
        finally{
            System.out.println("Esto siempre se ejecuta...");
        }
        
        
        
        
    }
}
