/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.petsi.conexionjdbc.dao.fabricas;

import com.petsi.conexionjdbc.dao.ProductoDAO;
import com.petsi.conexionjdbc.dao.ProductoDAOPostgreSQL;
import com.petsi.conexionjdbc.dao.UsuarioDAO;
import com.petsi.conexionjdbc.dao.UsuarioDAOPostgreSQL;


public class FactoryDAOPostgreSQL implements FactoryDAO{

    @Override
    public UsuarioDAO getUsuarioDAO() {
        return new UsuarioDAOPostgreSQL();
    }

    @Override
    public ProductoDAO getProductoDAO() {
        return new ProductoDAOPostgreSQL();
    }
    
}
