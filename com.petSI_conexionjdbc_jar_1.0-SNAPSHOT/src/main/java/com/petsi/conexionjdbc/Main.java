/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.petsi.conexionjdbc;

import com.mysql.cj.jdbc.Driver;
import com.petsi.conexionjdbc.dao.ProductoDAO;
import com.petsi.conexionjdbc.dao.UsuarioDAO;
import com.petsi.conexionjdbc.dao.UsuarioDAOMySQL;
import com.petsi.conexionjdbc.dao.fabricas.FactoryDAO;
import com.petsi.conexionjdbc.dao.fabricas.FactoryDAOMySQL;
import com.petsi.conexionjdbc.dao.fabricas.FactoryMethod;
import com.petsi.conexionjdbc.modelo.Usuario;
import conexion.Conexion;
import excepciones.ConexionException;
import excepciones.FactoryException;
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
       
            
            try 
            {
                FactoryDAO factoryDAO = FactoryMethod.getFactoryDAO();
                
                //UsuarioDAO uDao =  FactoryMethod.getUsuarioDAO();
                //ProductoDAO pDAO = FactoryMethod.getProductoDAO();
            
                
            
            Usuario u = uDao.consultarPorIDUs(2);   
            System.out.println(String.format("IDUs: %d - primNomUsu: %s -  PrimApeUsu: %s "
            ,u.getIDUs(), u.getPrimNomUsu(),u.getPrimApeUsu()));
            System.out.println("Todo bien...");
            }
           
            catch (ConexionException ex)
            {
            System.out.println(ex.getTipo().getCodigo() + ex.getTipo().getMensaje());
            ex.printStackTrace();
            } catch (FactoryException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
            finally
            {
            System.out.println("Esto siempre se ejecuta...");
            }
       
        
    }

    private static UsuarioDAO UsuarioDAOMySQL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
