package com.demo.springbootspringdatajpamysql.user.service;

import com.demo.springbootspringdatajpamysql.user.domain.User;

public interface UserService {
	
	User addUser(User userVO) throws Exception;
	
	User findById(String userId) throws Exception;
	
}

