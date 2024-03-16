package com.example.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repositories.UserRepository;
import com.example.demo.entities.UserEntity;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public void save(UserEntity entity) {
		repository.save(entity);
	}
	
}
