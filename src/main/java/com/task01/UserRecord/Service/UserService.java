package com.task01.UserRecord.Service;


import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task01.UserRecord.Model.User;
import com.task01.UserRecord.Repository.UserRepository;
@Service
public class UserService {
	
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Autowired  
	private UserRepository userRepository;    

	public boolean getByUsernameAndPassword(String username, String password) {
		logger.info("getByUserNameAndPassword() starts");
		if(username==null) {
			logger.info("getByUserNameAndPassword() ends");
			return false;
		}
		if(password==null) {
			logger.info("getByUserNameAndPassword() ends");
			return false;
		}
		 
		logger.info("getByUserNameAndPassword() ends");
		List<User> users = new ArrayList<User>();
		this.userRepository.getByUsernameAndPassword(username,password).forEach(users::add);
		if(users.size()>0) {
			return true;
		}
		else {
			return false;
		}
	}

	

}
