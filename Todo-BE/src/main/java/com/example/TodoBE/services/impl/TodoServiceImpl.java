package com.example.TodoBE.services.impl;



import java.util.List;
import java.util.stream.Collectors;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.TodoBE.dto.TodoDto;
import com.example.TodoBE.entities.Todo;
import com.example.TodoBE.repositories.TodoRepository;
import com.example.TodoBE.services.TodoService;
import com.example.TodoBE.utils.TodoUtils;

/**
 * Service gestiscone le informazioni che il controller passa, richiamando richiamando dati o avvalendosi di altri service
 * */

@Service
@Transactional(propagation=Propagation.SUPPORTS )
public class TodoServiceImpl implements TodoService {


	/**
	 * Autowired è un'annotation che al suo interno fa una setter injection e mi permette  di non scrivere la constructor injection 
	 * */
	
	@Autowired
	private TodoRepository todoRepository;
	
	@Override
	@Transactional(propagation = Propagation.NEVER,readOnly = true)
	public List<TodoDto> findAll(){
		List<Todo>todoList = todoRepository.findAll();
		List<TodoDto> todoDtoList = todoList.stream().map(
				t->TodoUtils.fromEntityToDto(t)
				).collect(Collectors.toList());
		return todoDtoList;
	}
	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public Long save(TodoDto todoDto) {
		
		Todo todo = new Todo();
		todo.setDescrizione(todoDto.getDescrizione());
		todo.setStatus(todoDto.getStatus());
		todo.setDataCreazione(todoDto.getDataCreazione());
		todo.setDataScadenza(todoDto.getDataScadenza());
		
		Todo t = todoRepository.save(todo);
		return t.getId();
		}
	
		
		@Override
		@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
		public TodoDto update(Long id,TodoDto todoDto) {
			
			Todo todo = todoRepository.findById(id).get();
			todo= todoRepository.saveAndFlush(todo);
			TodoDto upDto= new TodoDto();
			todo.setDescrizione(todoDto.getDescrizione());
			todo.setStatus(todoDto.getStatus());
			todo.setDataCreazione(todoDto.getDataCreazione());
			todo.setDataScadenza(todoDto.getDataScadenza());
			
			return upDto;
		}
		@Override
		@Transactional(propagation = Propagation.REQUIRED,readOnly = false)
		public void deleteById( Long id) {
			todoRepository.deleteById(id);
			
		}
}
