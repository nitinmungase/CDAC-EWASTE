package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Ewaste;
import com.springrest.springrest.services.EwasteService;

@RestController
public class MainController {
	
	@Autowired
	private EwasteService ewasteService;
	
	
	@GetMapping("/items")
	public List<Ewaste> getItems(){
		return this.ewasteService.getItems();
	}
	

	@PostMapping("/items")
	public Ewaste addItem(@RequestBody Ewaste item)
	{
		return this.ewasteService.addItem(item);
	}
	
	@PutMapping("/items/{itemId}")
	public Ewaste updateItem(@RequestBody Ewaste item) 
	{
		return this.ewasteService.updateItem(item);
	}
	
	@DeleteMapping("/items/{itemId}")
	public ResponseEntity<HttpStatus> deleteItem(@PathVariable String itemId){
		try {
			this.ewasteService.deleteItem(Long.parseLong(itemId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
