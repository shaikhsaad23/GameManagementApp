package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Game;
import com.example.demo.services.GameService;
import com.google.rpc.context.AttributeContext.Response;

@RestController
public class GameController {
	
	
	
	@PostMapping("insert/")
	public String post(@RequestBody Game gid ) {
		
		return GameService.create(gid);
	}
	
	@GetMapping("get/")
	public Game get(@RequestParam String  id) {
		
		return GameService.get(id);
	}
	
	@PutMapping("update/")
	public String update(@RequestBody Game gid) {
		
		return GameService.update(gid);
	}
	
	@DeleteMapping("delete/")
	public String del(@RequestParam String id) {
		
		return GameService.delete(id);
			
	}
}


