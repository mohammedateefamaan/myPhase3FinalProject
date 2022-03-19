package com.simplilearn.dao.jpa;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface ProductMapper {
	
	@Mapping(target = "picture", ignore = true)
	com.simplilearn.entity.Product toEntity(com.simplilearn.dto.Product dto);
	
	@Mapping(target = "categoryId", ignore = true)
	@Mapping(target = "imageFile", ignore = true)
	com.simplilearn.dto.Product toDto(com.simplilearn.entity.Product entity);
	
}