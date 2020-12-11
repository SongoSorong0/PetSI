/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.petsi.conexionjdbc;

import com.mysql.cj.jdbc.Driver;
import conexion.Conexion;
import excepciones.ConexionException;
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
        try {
            Connection conn = Conexion.getInstance();
            Connection conn2 = Conexion.getInstance();
            System.out.println(conn == conn2);
            
            /*
            try (Connection conn = Conexion.getInstance())
            {
            
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM importpetsi.usuarios WHERE primNomUsu =?");
            ps.setString(1, "Sergio");
            //ps.execute();
            //ResultSet rs = ps.getResultSet();
            ResultSet rs = ps.executeQuery();
        
            while (rs.next())
            {
            
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
            
            }
            catch (SQLException ex)
            {
            System.out.println("se presentó un error en la conexion...");
            ex.printStackTrace();
            }
            catch (ConexionException ex)
            {
            System.out.println(ex.getTipo().getCodigo() + ex.getTipo().getMensaje());
            ex.printStackTrace();
            }
            finally
            {
            System.out.println("Esto siempre se ejecuta...");
            }*/
        } catch (ConexionException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
