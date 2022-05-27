package com.example.TodoBE.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.TodoBE.dto.TodoDto;
import com.example.TodoBE.entities.Todo;

/**
 * classe che mi permette diinteragire con i dati
 * 
 * */
@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

	
	List<Todo> findAll();
	
	
}
