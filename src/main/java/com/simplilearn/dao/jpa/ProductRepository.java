package com.simplilearn.dao.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import com.simplilearn.entity.Category;
import com.simplilearn.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	List<Product> findByCategory(Category category);
	
	@EntityGraph(attributePaths={"picture"})
    Product findWithPictureAttachedById(Long id);
	
}