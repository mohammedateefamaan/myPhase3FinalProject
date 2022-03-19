package com.simplilearn.dao.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.simplilearn.entity.Category;
import com.simplilearn.entity.PurchaseItem;

public interface PurchaseItemRepository extends JpaRepository<PurchaseItem, Long> {

	@Query(value = "Select pi From PurchaseItem pi where pi.product.category = ?1")
	List<PurchaseItem> findAllByCategory(Category category);
	
}