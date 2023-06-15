package com.xworkz.contact.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

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
}
