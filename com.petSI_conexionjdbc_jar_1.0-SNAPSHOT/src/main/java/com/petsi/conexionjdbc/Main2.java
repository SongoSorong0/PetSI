package com.petsi.conexionjdbc;

import com.petsi.conexionjdbc.modelo.Usuario;
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
        
        Usuario usuario = em.find(Usuario.class, 2);
        
        
        
        Usuario u = UsuarioBuilder.builder()
                .idUsu(2)
                .primNomUsu("Valery")
                .SegNomUsu("")
                .PrimApeUsu("Garzon")
                .SegApeUsu("Guarnizo")
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
        
        //String sql = "SELECT tbl_u.* FROM usuarios tbl_u";
        String jpql = "SELECT u FROM Usuario u WHERE u.PrimApeUsu=:apellido1";
        TypedQuery<Usuario> q = em.createQuery(jpql, Usuario.class);
        
        q.setParameter("apellido1", "Perez");
        
        List<Usuario> usuarios = q.getResultList();
        
        usuarios.forEach(System.out::println);
     
        em.close();
    }
}
