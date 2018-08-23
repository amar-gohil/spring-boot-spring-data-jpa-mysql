package com.demo.springbootspringdatajpamysql.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.springbootspringdatajpamysql.user.domain.User;
import com.demo.springbootspringdatajpamysql.user.repository.impl.UserRepository;
import com.demo.springbootspringdatajpamysql.user.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;

	@Override
	public User addUser(User user) throws Exception {
		user = userRepository.save(user);
		return user;
	}

	@Override
	public User findById(String userId) throws Exception {
		User user = userRepository.findById(userId);
		return user;
	}
	
	
	
	
	
}
