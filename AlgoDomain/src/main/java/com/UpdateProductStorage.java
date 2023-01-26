package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateProductStorage {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		ProductStorage productStorage=new ProductStorage();
		entityManager.find(ProductStorage.class,2);
		productStorage.setProductID(1006);
		productStorage.setProductName("Extra");
		productStorage.setProductcategory("Different");
		productStorage.setProductprice(00000);
		productStorage.setProductType("different");
		productStorage.setGst(52);
		productStorage.setDiscount(50);
		productStorage.setDeliverycharge(500);
		
		entityTransaction.begin();
		entityManager.persist(productStorage);
		entityTransaction.commit();
	}

}
