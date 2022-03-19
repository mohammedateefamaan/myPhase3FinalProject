package com.simplilearn.dao;

import java.time.LocalDateTime;
import java.util.List;

import com.simplilearn.dto.Category;
import com.simplilearn.dto.Purchase;

public interface PurchaseDao {

	List<Purchase> getAllPurchasesCreatedBetween(LocalDateTime start, LocalDateTime end)
			throws SportyShoesDaoException;
	List<Purchase> getPurchasesByCategory(Category category) throws SportyShoesDaoException;
	Purchase getPurchase(Long id) throws SportyShoesDaoException;
	
}