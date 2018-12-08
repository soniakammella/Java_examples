package com.spring4.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;



import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.htc.spring4.beans.Product;

public class ProductDAOImpl implements ProductDAO {
	JdbcTemplate jdbcTemplate;
	
	

	/**
	 * @param jdbcTemplate the jdbcTemplate to set
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public boolean addProduct(Product product) {
		
		int insert = jdbcTemplate.update("insert into product(product_code,prod_desc,category_code,price,qty_on_hand) values(?,?,?,?,?)",product.getProductcode(),product.getProductDesc(),product.getCategory(),product.getQuantity(),product.getUnitprice());
		if(insert>0)
			return true;
		
				return false;
	}

	@Override
	public Product getProduct(String productCode) {
		
		Product product = jdbcTemplate.queryForObject("select product_code,prod_desc,category_code,price,qty_on_hand from product where product_code=?",new String[] {productCode}, new RowMapper<Product>() {

			@Override
			public Product mapRow(ResultSet rs, int row) throws SQLException {
			Product prod = new Product();
			prod.setProductcode(rs.getString(1));
			prod.setProductDesc(rs.getString(2));
			prod.setCategory(rs.getString(3));
			prod.setUnitprice(rs.getInt(4));
			prod.setQuantity(rs.getInt(5));
			

				return prod;
			}
			
		});
		
		return product;
		
	}

	@Override
	public boolean updateProduct(String productCode, double price, int qty) {
		
		int update = jdbcTemplate.update("update product set price=?,qty_on_hand=? where product_code=?",price,qty,productCode);
		if(update > 0)
			return true;
		
		return false;
	}

	@Override
	public List<Product> getProducts(String category) {
		List<Product> prodList = jdbcTemplate.query("select product_code,prod_desc,category_code,price,qty_on_hand from product where category_code=?", new Object[] {category},new RowMapper<Product>() {

			@Override
			public Product mapRow(ResultSet rs, int row) throws SQLException {
				Product prod = new Product();
				prod.setProductcode(rs.getString(1));
				prod.setProductDesc(rs.getString(2));
				prod.setCategory(rs.getString(3));
				prod.setUnitprice(rs.getInt(4));
				prod.setQuantity(rs.getInt(5));
				return prod;
			}
			
		});
		
		return prodList;
	}

}
