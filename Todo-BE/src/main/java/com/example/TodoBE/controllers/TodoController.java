package com.example.TodoBE.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TodoBE.dto.TodoDto;
import com.example.TodoBE.entities.Todo;
import com.example.TodoBE.services.TodoService;


/**
 * Controller gestisce le cheiamate e risposte http
 * 
 * */

@RestController
@RequestMapping("/todo")
public class TodoController {
	
	@Autowired
	private TodoService todoService;
	
	/**
	 * Di seguito chiamate CRUD
	 * */
	
	
	@GetMapping("/list")
	public List<TodoDto> getAll(){
		List<TodoDto> todoDto = todoService.findAll();
		return todoDto;
	}
	@PostMapping("/create")
	public Long create(@RequestBody TodoDto todoDto) {
		Long pk = todoService.save(todoDto);
		return pk;
	}
	@PutMapping("/{id}")
	public TodoDto update(@PathVariable("id") Long id, @RequestBody TodoDto todo ) {
		return todoService.update(id, todo);
	}
	
	@DeleteMapping("/{id}")
	public void  delete(@PathVariable("id")Long id) {
		todoService.deleteById(id);
	}
}
