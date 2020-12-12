
package com.petsi.conexionjdbc.dao.fabricas;

import com.petsi.conexionjdbc.dao.ProductoDAO;
import com.petsi.conexionjdbc.dao.UsuarioDAO;

public interface FactoryDAO 
{
     UsuarioDAO getUsuarioDAO();
    
    ProductoDAO getProductoDAO();
    
}
