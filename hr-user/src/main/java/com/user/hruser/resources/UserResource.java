package com.user.hruser.resources;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.user.hruser.entities.User;
import com.user.hruser.repositories.UserRepository;


@RestController
@RequestMapping(value = "/users")
public class UserResource {

private static Logger logger = org.slf4j.LoggerFactory.getLogger(UserResource.class);
	
	@Autowired
	private UserRepository userRepository;

	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		User user = userRepository.findById(id).get();
		return ResponseEntity.ok(user);
	}
	
	@GetMapping(value = "/search")
	public ResponseEntity<User> findByEmail(@RequestParam String email) {
		User user = userRepository.findByEmail(email);
		return ResponseEntity.ok(user);
	}

	
}
