package com.simplilearn.dao.jpa;

import org.mapstruct.Mapper;

@Mapper
public interface CategoryMapper {
	
	com.simplilearn.entity.Category toEntity(com.simplilearn.dto.Category dto);
	
	com.simplilearn.dto.Category toDto(com.simplilearn.entity.Category entity);
	
}