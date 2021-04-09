/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.petsi.conexionjdbc.dao.fabricas;

import com.petsi.conexionjdbc.dao.ProductoDAO;
import com.petsi.conexionjdbc.dao.UsuarioDAO;
import enums.FactoryExceptionEnum;
import excepciones.FactoryException;

/**
 *
 * @author migue
 */
public class FactoryMethod 
{
    private static FactoryDAO factoryDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static UsuarioDAO getUsuarioDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static ProductoDAO getProductoDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    private static final String MY_SQL = "com.petsi.conexionjdbc.dao.fabricas.FactoryDAOMySQL";
    private static final String JPA = "com.petsi.conexionjdbc.dao.fabricas.FactoryDAOJPA";
    
    private FactoryMethod()
    {
        
    }
    
        public static FactoryDAO getFactoryDAO() throws FactoryException
        {
            try {
                FactoryDAO factoryDAO = (FactoryDAO) Class
                        .forName(JPA)
                        .newInstance();
                return factoryDAO;
                
            } catch (Exception ex) {
                throw new FactoryException(FactoryExceptionEnum.ERROR_FABRICA_DAO, ex);
            }
        }
    
    
}
