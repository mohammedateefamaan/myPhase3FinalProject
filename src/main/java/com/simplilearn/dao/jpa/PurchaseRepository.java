package com.simplilearn.dao.jpa;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.simplilearn.entity.Purchase;
import com.simplilearn.entity.PurchaseItem;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {

	List<Purchase> findAllByCreatedDateTimeBetween(
		      LocalDateTime createdDateTimeStart,
		      LocalDateTime createdDateTimeEnd);
	
	List<Purchase> findDistinctByItemsIn(List<PurchaseItem> items);
	
}
