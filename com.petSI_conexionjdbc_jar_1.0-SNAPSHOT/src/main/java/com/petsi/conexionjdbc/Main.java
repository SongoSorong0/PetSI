package com.petsi.conexionjdbc;

import com.mysql.cj.jdbc.Driver;
import com.petsi.conexionjdbc.dao.ProductoDAO;
import com.petsi.conexionjdbc.dao.ProductoDAOMySQL;
import com.petsi.conexionjdbc.dao.UsuarioDAO;
import com.petsi.conexionjdbc.dao.UsuarioDAOMySQL;
import com.petsi.conexionjdbc.dao.fabricas.FactoryDAO;
import com.petsi.conexionjdbc.dao.fabricas.FactoryDAOMySQL;
import com.petsi.conexionjdbc.dao.fabricas.FactoryMethod;
import com.petsi.conexionjdbc.modelo.Carrito_compras;
import com.petsi.conexionjdbc.modelo.builders.UsuarioBuilder;
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
                FactoryDAO factoryDAO =  FactoryMethod.getFactoryDAO();
                UsuarioDAO uDao =  new UsuarioDAOMySQL();
                ProductoDAO pDao = new ProductoDAOMySQL();
                
                /*FactoryDAO factoryDAO =  new FactoryDAOMySQL();
                UsuarioDAO uDao =  factoryDAO.getUsuarioDAO();
                ProductoDAO pDao = factoryDAO.getProductoDAO();*/

            //Consultar por ID
            Carrito_compras u = uDao.consultarPorIDUs(15);   
            System.out.println(String.format("IDUs: %d - primNomUsu: %s - SegNomUsu: %s - PrimApeUsu: %s - SegApeusu: %s",
            u.getIDUs(),
            u.getPrimNomUsu(),
            u.getSegNomUsu(),
            u.getPrimApeUsu(),
            u.getSegApeUsu()));
            System.out.println("Todo bien...");
            
            //Registrar
            /*Carrito_compras ur = UsuarioBuilder.builder()
                    .IDUs(10)
                    .primNomUsu("Diana")
                    .SegNomUsu("Andrea")
                    .PrimApeUsu("Perez")
                    .SegApeUsu("Hinestrtoza")
                    .build();
            uDao.registrar(ur);
            */
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

    private static Carrito_compras Usuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
