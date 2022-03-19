package com.simplilearn.dao;

import com.simplilearn.dto.Payment;

public interface PaymentDao {

	Payment save(Payment payment) throws SportyShoesDaoException;
	Payment getPayment(Long id) throws SportyShoesDaoException;
	
}