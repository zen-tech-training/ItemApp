package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/zenapp/item")
public class ItemController {

	@GetMapping(value="/", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ItemDto> getItem() {
		return new ResponseEntity<ItemDto>(new ItemDto("Laptop", 50000), HttpStatus.OK);
	}
}
