package com.petsi.conexionjdbc;

import com.petsi.conexionjdbc.modelo.Carrito_compras;
import com.petsi.conexionjdbc.modelo.builders.UsuarioBuilder;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class Main2 
{
    public static void main(String[] args) 
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ejemplo_PU");
        EntityManager em = emf.createEntityManager();
        Carrito_compras usuario = em.find(Carrito_compras.class, 2);
        
        
        
        Carrito_compras u = UsuarioBuilder.builder()
                .IDUs(2)
                .primNomUsu("Valentina")
                .SegNomUsu("Sofia")
                .PrimApeUsu("Vargas")
                .SegApeUsu("Pardo")
                .build();
        
        
        EntityTransaction et = em.getTransaction();
        try
        {
            et.begin();
            em.persist(em.merge(u));
            et.commit();
        }
        catch(Exception e)
        {
            et.rollback();
        }
        System.out.println(u);
        
        //JPQL
        
        String sql = "SELECT tbl_u.* FROM usuarios tbl_u";
        String jpql = "SELECT u FROM Usuario u WHERE u.PrimApeUsu=:apellido1";
        TypedQuery<Carrito_compras> q = em.createQuery(jpql, Carrito_compras.class);
        
        q.setParameter("apellido1", "Perez");
        
        List<Carrito_compras> usuarios = q.getResultList();
        
        usuarios.forEach(System.out::println);
     
        em.close();
    }
}
