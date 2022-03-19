package com.simplilearn.service;

import java.util.List;

import com.simplilearn.dto.Category;
import com.simplilearn.dto.Payment;
import com.simplilearn.dto.Product;
import com.simplilearn.dto.User;

public interface UserService {

	User login(String email, String password) throws SportyShoesServiceException;
	User register(User user) throws SportyShoesServiceException;
	
	List<Category> getAllCategories() throws SportyShoesServiceException;
	
	List<Product> getProductsByCategory(Long categoryId) throws SportyShoesServiceException;
	byte[] getProductPicture(Long productId) throws SportyShoesServiceException;
	Product getProduct(Long productId) throws SportyShoesServiceException;
	
	Payment pay(Payment payment) throws SportyShoesServiceException;
	Payment getPayment(Long paymentId) throws SportyShoesServiceException;
	
}