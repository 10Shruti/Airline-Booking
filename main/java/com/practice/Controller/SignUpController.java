package com.practice.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.practice.Entity.User;
import com.practice.repository.UserRepository;



@Controller
public class SignUpController {

	@Autowired
	UserRepository userRepo;
	

	@RequestMapping("/index")
	public String indexPage() {
		return "index";
	}
		
	@GetMapping("/Register")
	public String registerPage() {
		return "Register";
	}		 	
	
	@PostMapping("/Home") 
    @ResponseBody
    public String homeForm(@ModelAttribute User user) {
        try {
            userRepo.save(user);
            return "Home";
            
        } catch (DataIntegrityViolationException e) {
            return "Duplicate email address";
        }
        
    }

	
	@GetMapping("/get")
    public ResponseEntity<List<User>> getFormValue() {
        List<User> users = userRepo.findAll();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
	
    @RequestMapping("/delete/{email}")
    public ResponseEntity<String> deleteUserByEmail(@PathVariable String email) {
    	User user = userRepo.findByEmail(email);
        if (user != null) {
            userRepo.delete(user);
            return ResponseEntity.ok("User with email " + email + " deleted successfully");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User with email " + email + " not found");
            
        }
    }
}



