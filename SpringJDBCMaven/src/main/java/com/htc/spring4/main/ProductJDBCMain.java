package com.htc.spring4.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.htc.spring4.beans.Product;
import com.htc.spring4.dao.ProductDAO;




public class ProductJDBCMain {

	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("./Product.xml");
	ProductDAO prod = (ProductDAO) context.getBean("dao");
	
	//prod.addProduct(new Product("PR16","LenovoMobile",800,8500,"CT03"));
	prod.addProduct(new Product("PR33","LenovoMobile",400,1567,"CT03"));
	//System.out.println(prod.updateProduct("PR16", 9000, 600));
	System.out.println(prod.getProduct("PR33"));
	/*for(Product p : prod.getProducts("CT03") ) {
	System.out.println(p);
	}*/

}
}
