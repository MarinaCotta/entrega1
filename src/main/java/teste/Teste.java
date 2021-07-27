/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import persistencia.Autor;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Teste {
    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BancoPU");
    private static EntityManager entityManager = entityManagerFactory.createEntityManager();

    public static void main(){
        //FIND
    Autor autor = entityManager.find(Autor.class,1);
    System.out.println("Nome do autor: " + autor.getPrimeiro_nome());
    
    // INSERT
//		Autor autor = new Autor();
//		autor.setNome("Mari");
//		
//		entityManager.getTransaction().begin();
//		entityManager.persist(autor);
//		entityManager.getTransaction().commit();
		
		// DELETE
//		Autor autor = entityManager.find(Autor.class, 2);
//		entityManager.getTransaction().begin();
//		entityManager.remove(autor);
//		entityManager.getTransaction().commit();
		
		// MODIFY
//		Autor autor = new Autor();
//		autor.setId(1);
//		autor.setPrimeiro_nome("Mario");
		
//		entityManager.getTransaction().begin();
//		entityManager.merge(autor);
//		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();
}
}
