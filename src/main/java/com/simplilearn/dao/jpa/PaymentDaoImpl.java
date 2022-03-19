package com.simplilearn.dao.jpa;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.simplilearn.dao.PaymentDao;
import com.simplilearn.dao.SportyShoesDaoException;
import com.simplilearn.dto.Payment;

@Repository
@Qualifier("jpa")
public class PaymentDaoImpl implements PaymentDao {

	@Resource
	PaymentRepository repository;
	
	@Resource
	PaymentMapper mapper;
	
	@Override
	@Transactional
	public Payment save(Payment payment) throws SportyShoesDaoException {
		Payment savedPayment = null;
		
		try {
			savedPayment = mapper.toDto(repository.save(mapper.toEntity(payment)));
		} catch (Exception e) {
			throw new SportyShoesDaoException(e.getMessage());
		}
		
		return savedPayment;
	}

	@Override
	public Payment getPayment(Long id) throws SportyShoesDaoException {
		Payment payment = null;
		
		try {
			payment = repository.findById(id)
					.map(entity -> mapper.toDto(entity))
					.orElse(null);
		} catch (Exception e) {
			throw new SportyShoesDaoException(e.getMessage());
		}
		
		return payment;
	}

}