package com;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetProductStorage {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from ProductStorage s");
		List<ProductStorage>list=query.getResultList();
//		for(ProductStorage productStorage:list) {
//			System.out.println(productStorage.getProductID());
//			System.out.println(productStorage.getProductName());
//			System.out.println(productStorage.getProductType());
//			System.out.println(productStorage.getProductcategory());
//			System.out.println(productStorage.getProductprice());
//			System.out.println(productStorage.getDiscount());
//			System.out.println(productStorage.getGst());
//			System.out.println(productStorage.getDeliverycharge());
		double price=0;
		
		   for(ProductStorage productStorage:list) {
			   price=productStorage.getProductprice();
			   price=price-productStorage.getProductprice()*productStorage.getDiscount()/100+productStorage.getProductprice()*productStorage.getGst()/100+productStorage.getDeliverycharge();
			   System.out.println(productStorage.getProductName()+"Final price is: "+price+"including discount charges of: "+productStorage.getDeliverycharge()+"Rs"+"\n--------");
		}
		
		
	}

}
