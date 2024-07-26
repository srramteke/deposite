package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers1 {

	
	@GetMapping("/net")
	public ResponseEntity<String> get(){
		
		String msg ="setting data";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
}
