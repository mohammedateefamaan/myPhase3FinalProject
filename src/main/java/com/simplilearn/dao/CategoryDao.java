package com.simplilearn.dao;

import java.util.List;

import com.simplilearn.dto.Category;

public interface CategoryDao {

	List<Category> getAllCategories() throws SportyShoesDaoException;
	Category getCategory(Long id) throws SportyShoesDaoException;
	Category save(Category category) throws SportyShoesDaoException;
	void remove(Long id) throws SportyShoesDaoException;
	
}