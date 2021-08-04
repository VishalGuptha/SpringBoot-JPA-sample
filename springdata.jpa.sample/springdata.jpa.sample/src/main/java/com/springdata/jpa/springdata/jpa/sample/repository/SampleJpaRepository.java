package com.springdata.jpa.springdata.jpa.sample.repository;

import org.springframework.stereotype.Component;

import com.springdata.jpa.springdata.jpa.sample.model.Users;

import org.springframework.data.jpa.repository.JpaRepository;

@Component
public interface SampleJpaRepository extends JpaRepository<Users, Long>{

	
	Users findByUserName(String userName);
	
}
