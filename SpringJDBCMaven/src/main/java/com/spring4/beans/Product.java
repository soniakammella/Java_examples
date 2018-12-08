package com.spring4.beans;

public class Product {
	private String productcode;
	private String productDesc;
	private int unitprice;
	private int quantity;
	private String category;
	public String getProductcode() {
		return productcode;
	}
	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public int getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(int unitprice) {
		this.unitprice = unitprice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Product(String productcode, String productDesc, int unitprice, int quantity, String category) {
		super();
		this.productcode = productcode;
		this.productDesc = productDesc;
		this.unitprice = unitprice;
		this.quantity = quantity;
		this.category = category;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [productcode=" + productcode + ", productDesc=" + productDesc + ", unitprice=" + unitprice
				+ ", quantity=" + quantity + ", category=" + category + "]";
	}

	
}
