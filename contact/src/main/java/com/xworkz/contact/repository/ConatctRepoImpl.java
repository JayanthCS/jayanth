package com.xworkz.contact.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.xworkz.contact.entity.ContactEntity;

@Repository
@Component
public class ConatctRepoImpl implements ContactRepo{

	public ConatctRepoImpl() {
		System.out.println("no-arg constructor of ContactRepoImpl");
	}

	@Override
	public boolean save(ContactEntity entity) {
	System.out.println("Running save method");
	EntityManagerFactory factory= Persistence.createEntityManagerFactory(null);
	EntityManager manager=	factory.createEntityManager();
	EntityTransaction transaction=	manager.getTransaction();
	transaction.begin();
	manager.persist(entity);
	transaction.commit();
	manager.close();
	return true;
	}
	
	@Override
	public List<ContactEntity> findByName(String name) {
		System.out.println("Running findByName in repo"+name);
		EntityManagerFactory factory= Persistence.createEntityManagerFactory(null);
		EntityManager manager=	factory.createEntityManager();
		EntityTransaction transaction=	manager.getTransaction();
		EntityManager entityManager=factory.createEntityManager();
		javax.persistence.Query query = entityManager.createNamedQuery("findByName");
		query.setParameter("nm", "%"+name+"%");
		List<ContactEntity> result=query.getResultList();
		System.out.println("Result from repo"+result);
		entityManager.close();
		return result;
	}
	@Override
	public Long emailCount(String email) {
		System.out.println("Running emailCount");
		EntityManagerFactory factory= Persistence.createEntityManagerFactory(null);
		EntityManager manager=	factory.createEntityManager();
		//EntityTransaction transaction=	manager.getTransaction();
		Query query= manager.createNamedQuery("findByEmail");
		query.setParameter("emailBy", email);
	    Object object=	query.getSingleResult();
	    Long count=(Long) object;
		
		
		return count;
	}
	
}
