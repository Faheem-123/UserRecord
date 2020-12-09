package com.task01.UserRecord.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.task01.UserRecord.Service.UserService;
import com.task01.UserRecord.dtos.LoginDto;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/auth")
public class UserController {
	
	@Autowired
	private UserService userService;
	@PostMapping("/login")  
	public boolean login(@RequestBody LoginDto loginDto) {
		
		if(loginDto==null) {
			return false;
		}
		
		Boolean canLogin = userService.getByUsernameAndPassword(loginDto.getUsername(), loginDto.getPassword());
		return canLogin;
		    
	}
	
	@GetMapping("/Hello")
	public String getString()   
	{  
	 return "Hello World";
	}
  
}
