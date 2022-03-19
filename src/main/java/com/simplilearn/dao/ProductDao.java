package com.simplilearn.dao;

import java.util.List;

import com.simplilearn.dto.Category;
import com.simplilearn.dto.Product;

public interface ProductDao {

	List<Product> getAllProducts() throws SportyShoesDaoException;
	Product getProduct(Long id) throws SportyShoesDaoException;
	Product save(Product product) throws SportyShoesDaoException;
	Product update(Product product) throws SportyShoesDaoException;
	void remove(Long id) throws SportyShoesDaoException;
	List<Product> getProductsByCategory(Category category) throws SportyShoesDaoException;
	byte[] getProductPicture(Long id) throws SportyShoesDaoException;
	
}