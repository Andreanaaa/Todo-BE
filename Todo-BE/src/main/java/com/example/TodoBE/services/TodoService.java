package com.example.TodoBE.services;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.TodoBE.dto.TodoDto;

public interface TodoService {

	List<TodoDto> findAll();

	Long save(TodoDto todoDto);

	TodoDto update(Long id, TodoDto todoDto);

	void deleteById(Long id);

}
