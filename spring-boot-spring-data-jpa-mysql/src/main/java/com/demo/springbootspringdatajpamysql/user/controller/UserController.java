package com.demo.springbootspringdatajpamysql.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.springbootspringdatajpamysql.user.domain.User;
import com.demo.springbootspringdatajpamysql.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "add", method = RequestMethod.POST)
    public User addUser(@RequestBody User user) throws Exception {    	
		user = userService.addUser(user);    	
        return user;
    }

	@RequestMapping(value = "/findById", method = RequestMethod.POST)
    public User findById(@RequestBody String id)
            throws Exception {
        return userService.findById(id);
    }

}
