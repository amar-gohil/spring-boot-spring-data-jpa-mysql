package  com.demo.springbootspringdatajpamysql.user.repository.impl;

import org.springframework.data.repository.CrudRepository;

import com.demo.springbootspringdatajpamysql.user.domain.User;

public interface UserRepository extends CrudRepository<User, String>  {	 
		
	User findById(String id);	
	
}

