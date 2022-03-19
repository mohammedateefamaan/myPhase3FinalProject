package com.simplilearn.dao.jpa;

import org.mapstruct.Mapper;

@Mapper
public interface PurchaseMapper {
	
	com.simplilearn.entity.Purchase toEntity(com.simplilearn.dto.Purchase dto);
	
	com.simplilearn.dto.Purchase toDto(com.simplilearn.entity.Purchase entity);
	
}