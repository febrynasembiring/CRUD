package com.maybank.todo.service;

import java.util.List;

import com.maybank.todo.entity.Todo;

public interface TodoService {
	List<Todo> listAll();
	
	Todo getByID(int id);
	
	Todo save(Todo todo);
	
	Todo update(Todo todo);
	
	String delete(int id);

}
