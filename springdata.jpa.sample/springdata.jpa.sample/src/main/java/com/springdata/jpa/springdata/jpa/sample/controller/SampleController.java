package com.springdata.jpa.springdata.jpa.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springdata.jpa.springdata.jpa.sample.model.Users;
import com.springdata.jpa.springdata.jpa.sample.repository.SampleJpaRepository;

@RestController
@RequestMapping("/v1/sample")
public class SampleController {

	
	
	@Autowired
	SampleJpaRepository sampleJpaRepository;
	
	
	@GetMapping("/allUsers")
	public List<Users> getAllUsers()
	{
		List<Users> userList = sampleJpaRepository.findAll();
		
		return userList;
	}
	
	
	@PostMapping("/loadUser")
	public Users loadUser(@RequestBody Users users)
	{
		Users userResponse = sampleJpaRepository.save(users);
		
		return userResponse;
	}
	
	@GetMapping("/{userName}")
	public Users getUserByUserName(@PathVariable String userName)
	{
		Users userResponse = sampleJpaRepository.findByUserName(userName);
		
		return userResponse;
	}
}
