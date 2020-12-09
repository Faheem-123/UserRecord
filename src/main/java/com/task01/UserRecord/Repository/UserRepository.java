package com.task01.UserRecord.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.task01.UserRecord.Model.User;
@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

	List<User> getByUsernameAndPassword(String username, String password);
	
	
	

}
