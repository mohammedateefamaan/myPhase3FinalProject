package com.simplilearn.dao.jpa;

import org.mapstruct.Mapper;

@Mapper
public interface PaymentMapper {
	
	com.simplilearn.entity.Payment toEntity(com.simplilearn.dto.Payment dto);
	
	com.simplilearn.dto.Payment toDto(com.simplilearn.entity.Payment entity);
	
}