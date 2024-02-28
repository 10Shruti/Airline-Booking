package com.practice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practice.Entity.User;
import com.practice.repository.UserRepository;


@Controller
public class SignUpController {

	@Autowired
	UserRepository userRepo;

	@RequestMapping("/hi")
	public String indexPage() {
		return "index";
	}
		
	@GetMapping("/Register")
	public String registerPage() {
		return "Register";
	}
		
		
	@PostMapping("/Home")
	public  String homeForm(@ModelAttribute User user ) {
		userRepo.save(user);
		return "Home";
	}
			
	@GetMapping("/get")
	public List<User> getformvalu1e() {
		System.out.println(userRepo.findAll());
		 return userRepo.findAll();
	}
	
	
	@RequestMapping("/user/{email}")
	public String deleteEmployee(@PathVariable String email) {
		userRepo.deleteById(email);
		return "Home";
	}
	
	
	
}




