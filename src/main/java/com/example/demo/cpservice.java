package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class cpservice {
	@Autowired
	cprepo Repo;
	public List<data> getAll(){
		return Repo.findAll();
	}
	public data savedata(data d){
		return Repo.save(d);
	}
	public String deletedata(String name) {
		Repo.deleteById(name);
		return "Deleted";		
	}
	public String updateDetails(data d) {
		Repo.save(d);
		return "updated";
	}
}
