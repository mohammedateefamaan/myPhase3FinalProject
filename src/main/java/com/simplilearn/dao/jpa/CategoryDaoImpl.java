package com.simplilearn.dao.jpa;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.simplilearn.dao.CategoryDao;
import com.simplilearn.dao.SportyShoesDaoException;
import com.simplilearn.dto.Category;

@Repository
@Qualifier("jpa")
public class CategoryDaoImpl implements CategoryDao {

	@Resource
	private CategoryRepository repository;
	
	@Resource
	private CategoryMapper mapper;
	
	@Override
	public List<Category> getAllCategories() throws SportyShoesDaoException {
		List<Category> categories = null;
		
		try {
			categories = repository.findAll()
					.stream()
					.map(entity -> mapper.toDto(entity))
					.collect(Collectors.toList());
		} catch (Exception e) {
			throw new SportyShoesDaoException(e.getMessage());
		}
		
		return categories;
	}

	@Override
	public Category getCategory(Long id) throws SportyShoesDaoException {
		Category category = null;
		
		try {
			category = repository.findById(id)
					.map(entity -> mapper.toDto(entity))
					.orElse(null);
		} catch (Exception e) {
			throw new SportyShoesDaoException(e.getMessage());
		}
		
		return category;
	}

	@Override
	@Transactional
	public Category save(Category category) throws SportyShoesDaoException {
		Category savedCategory = null;
		
		try {
			savedCategory = mapper.toDto(repository.save(mapper.toEntity(category)));
		} catch (Exception e) {
			throw new SportyShoesDaoException(e.getMessage());
		}
		
		return savedCategory;
	}

	@Override
	@Transactional
	public void remove(Long id) throws SportyShoesDaoException {
		try {
			repository.deleteById(id);
		} catch (Exception e) {
			throw new SportyShoesDaoException(e.getMessage());
		}
	}

}