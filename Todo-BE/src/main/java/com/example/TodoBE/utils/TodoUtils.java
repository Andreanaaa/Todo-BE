package com.example.TodoBE.utils;

import com.example.TodoBE.dto.TodoDto;
import com.example.TodoBE.entities.Todo;


public class TodoUtils {

	public static TodoDto fromEntityToDto(Todo todo) {
		
		TodoDto todoDto = new TodoDto();
		todoDto.setId(todo.getId());
		todoDto.setDescrizione(todo.getDescrizione());
		todoDto.setStatus(todo.getStatus());
		todoDto.setDataCreazione(todo.getDataCreazione());
		todoDto.setDataScadenza(todo.getDataCreazione());
		return todoDto;
	}
	
	public static Todo fromDtoToEntity(TodoDto todoDto) {
		
		Todo todo = new Todo();
		todo.setId(todoDto.getId());
		todo.setDescrizione(todoDto.getDescrizione());
		todo.setStatus(todoDto.getStatus());
		todo.setDataCreazione(todoDto.getDataCreazione());
		todo.setDataScadenza(todoDto.getDataCreazione());
		return todo;
	}
	
	/**
	 * 
	 * Qui avrei dovuto/voluto scrivere un metodo che mi conversisse le stringhe in Timestamp per gestire in maniera più corretta le  date.
	 * 
	 * */
	
}
