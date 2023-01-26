package com;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductStorage {
	@Id
	private int productID;
	private String productName;
	private String productType;
	private String productcategory;
	private double productprice;
	
	private double discount;
	private double gst;
	private double deliverycharge;
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getProductcategory() {
		return productcategory;
	}
	public void setProductcategory(String productcategory) {
		this.productcategory = productcategory;
	}
	public double getProductprice() {
		return productprice;
	}
	public void setProductprice(double productprice) {
		this.productprice = productprice;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getGst() {
		return gst;
	}
	public void setGst(double gst) {
		this.gst = gst;
	}
	public double getDeliverycharge() {
		return deliverycharge;
	}
	public void setDeliverycharge(double deliverycharge) {
		this.deliverycharge = deliverycharge;
	}
	
	
}
