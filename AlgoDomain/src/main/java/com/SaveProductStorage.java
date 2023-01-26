package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveProductStorage {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
				
	    ProductStorage productStorage1=new ProductStorage();
		productStorage1.setProductID(1001);
		productStorage1.setProductName("Lenovo Yoga");
		productStorage1.setProductType("Laptop");
		productStorage1.setProductcategory("Electronics");
		productStorage1.setProductprice(45000);
		
		productStorage1.setDiscount(15/100);
		productStorage1.setGst(18/100);
		productStorage1.setDeliverycharge(350);
		
		
		ProductStorage productStorage2=new ProductStorage();
		productStorage2.setProductID(1002);
		productStorage2.setProductName("LG Washing Machine");
		productStorage2.setProductType("Washing Machine");
		productStorage2.setProductcategory("Home Appliances");
		productStorage2.setProductprice(25000);
		
		productStorage2.setDiscount(22/100);
		productStorage2.setGst(24/100);
		productStorage2.setDeliverycharge(800);
		
		
		ProductStorage productStorage3=new ProductStorage();
		productStorage3.setProductID(1003);
		productStorage3.setProductName("HP Pavilion 360");
		productStorage3.setProductType("Laptop");
		productStorage3.setProductcategory("Electonics");
		productStorage3.setProductprice(60000);
		
		productStorage3.setDiscount(15/100);
		productStorage3.setGst(18/100);
		productStorage3.setDeliverycharge(350);
		
	
		ProductStorage productStorage4=new ProductStorage();
		productStorage4.setProductID(1004);
		productStorage4.setProductName("US polo Assn");
		productStorage4.setProductType("T-Shirt");
		productStorage4.setProductcategory("Clothing");
		productStorage4.setProductprice(1200);
		
		productStorage4.setDiscount(40/100);
		productStorage4.setGst(12/100);
		productStorage4.setDeliverycharge(0);
		
		
		ProductStorage productStorage5=new ProductStorage();
		productStorage5.setProductID(1005);
		productStorage5.setProductName("Neelkamal Been Bag");
		productStorage5.setProductType("Sofa Set");
		productStorage5.setProductcategory("Furniture");
		productStorage5.setProductprice(350);
		
		productStorage5.setDiscount(10/100);
		productStorage5.setGst(18/100);
		productStorage5.setDeliverycharge(300);
		
		
		
		entityTransaction.begin();
		entityManager.persist(productStorage1);
		entityManager.persist(productStorage2);
		entityManager.persist(productStorage3);
		entityManager.persist(productStorage4);
		entityManager.persist(productStorage5);
		entityTransaction.commit();
	}

}
