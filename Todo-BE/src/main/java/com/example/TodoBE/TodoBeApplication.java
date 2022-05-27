package com.example.TodoBE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;


/**
 * @CrossOrigin annotation, fa si che si possano ricevere chiamate provenienti da un altro domminio 
 * */

@SpringBootApplication
@CrossOrigin("http://localhost:4200")
public class TodoBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoBeApplication.class, args);
	}

}
