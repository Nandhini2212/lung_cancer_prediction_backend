package com.example.demo;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin
public class cpcontroller {
	@Autowired
	cpservice service;
	
	@GetMapping("/get")
	public List<data> getlist(){
		return service.getAll();
	}
	
	@PostMapping("/post")
	public data post(@RequestBody data d){
		return service.savedata(d);
	}
	@PutMapping("/update")
	public String put(@RequestBody data d) {
		return service.updateDetails(d);
	}
	@DeleteMapping("/delete")
	public String delete(@RequestParam String name) {
		return service.deletedata(name);
		
	}
	
	
	
}

