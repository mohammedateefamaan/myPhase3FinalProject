package com.simplilearn.dao.jpa;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface UserMapper {
	
	com.simplilearn.entity.User toEntity(com.simplilearn.dto.User dto);
	
	@Mapping(target = "confirmPassword", ignore = true)
	com.simplilearn.dto.User toDto(com.simplilearn.entity.User entity);
	
}