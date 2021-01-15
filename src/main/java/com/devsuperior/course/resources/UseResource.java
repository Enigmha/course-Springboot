package com.devsuperior.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.course.entities.User;

@RestController
@RequestMapping(value = "/users")

public class UseResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Leandro", "le@gmail.com", "41-9999-0000", "123456");
		return ResponseEntity.ok().body(u);
	}
}
