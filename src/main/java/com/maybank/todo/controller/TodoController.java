package com.maybank.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.maybank.todo.entity.Todo;
import com.maybank.todo.service.TodoService;

@Controller
@RequestMapping("/todo")
public class TodoController {


	@Autowired
	TodoService todoService;
	
	@GetMapping("/list-all")
	public String listAll(Model model) {
		System.out.println("DATA" + todoService.listAll());
		model.addAttribute("todos", todoService.listAll());
		return "todo/listAll";
	}
	
	
	@RequestMapping("/add")
	public String addTodo(Model model) {
		model.addAttribute("todo", new Todo());
		return "todo/add";
	}
	
	@RequestMapping("save")
	public String save(@ModelAttribute Todo todo) {
		System.out.println("Form Data: " + todo);
		todoService.save(todo);
		return "redirect:list-all";
	}
	
	@RequestMapping("/edit/{id}")
	public String edit(Model model, @PathVariable int id) {
		Todo todo = todoService.getByID(id);
		System.out.println("Edit Data: " + todo);
		model.addAttribute("todo", todo);
		return "todo/edit";
	}
	
	@RequestMapping("update")
	public String update(@ModelAttribute Todo todo) {
		todoService.update(todo);
		return "redirect:/todo/list-all";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		todoService.delete(id);
		return "redirect:../list-all";
	}
}
