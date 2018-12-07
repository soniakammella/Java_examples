package com.htc.spring4.dao;

import java.util.List;

import com.htc.spring4.beans.Product;

public interface ProductDAO {
	
	public boolean addProduct(Product product);
	public  Product  getProduct(String productCode);
	public  boolean  updateProduct(String productCode,  double price,  int qty);
	public  List<Product>  getProducts(String category);	
	
}
