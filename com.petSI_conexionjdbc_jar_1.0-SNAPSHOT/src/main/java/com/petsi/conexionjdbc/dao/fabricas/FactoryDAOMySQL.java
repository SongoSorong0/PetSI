/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.petsi.conexionjdbc.dao.fabricas;

import com.petsi.conexionjdbc.dao.ProductoDAO;
import com.petsi.conexionjdbc.dao.ProductoDAOMySQL_;
import com.petsi.conexionjdbc.dao.UsuarioDAO;
import com.petsi.conexionjdbc.dao.UsuarioDAOMySQL;


public class FactoryDAOMySQL implements FactoryDAO{

    @Override
    public UsuarioDAO getUsuarioDAO() {
        return new UsuarioDAOMySQL();
    }

    @Override
    public ProductoDAO getProductoDAO() {
        return new ProductoDAOMySQL_();
    }
    
}
