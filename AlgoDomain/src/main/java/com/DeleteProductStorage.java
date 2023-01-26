package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteProductStorage {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		ProductStorage productStorage=new ProductStorage();
		entityManager.find(ProductStorage.class,3);
		
		
		entityTransaction.begin();
		entityManager.remove(productStorage);
		entityTransaction.commit();
	}

}
