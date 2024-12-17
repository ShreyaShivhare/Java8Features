package com.example.demo.interviewQuestions;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class OptionalDemo {
	
	/*Example
	 * java optional class provides a way to deal with null values. +nt in jav.uyil.package.
	 * NPE is an common issue in java applications.To prevent this, 
	 * we normally add frequent NULL checks in our code.Optional provides a better approach to handle such situations.
	 * Optional is a single-value container that it contains a value or nothing(empty).
	 */
	
//	@GetMapping(path = "/id{id}")
//	public ResponseEntity<Employee> getById(@PathVariable Integer id) {
//		Optional<Employee> e = repo.findById(id);
//		if(!e.isEmpty()) {
//			//Use Optional.of when you are sure that there are no null values
//			//Optional.ofNullable when you are not sure.
//			Optional<String> name = Optional.ofNullable(e.get().getName());
//			if(name.isPresent())
//				return new ResponseEntity<>(HttpStatus.OK);
//			else
//				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		
//		}else
//			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
