package com.welge.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.welge.model.User;

public class UserDao {
	public void save(User user){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SimplePU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
}
