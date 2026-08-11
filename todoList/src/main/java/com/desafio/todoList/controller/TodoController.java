package com.desafio.todoList.controller;

import com.desafio.todoList.entity.Todo;
import com.desafio.todoList.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    public List create(@RequestBody Todo todo) {
        return todoService.create(todo);
    }

    @GetMapping
    public List list() {
        return todoService.list();
    }

    @PutMapping
    public List update(@RequestBody Todo todo) {
        return todoService.update(todo);
    }

    @DeleteMapping("{id}")
    public List delete(@PathVariable("id") Long id) {
        return todoService.delete(id);
    }
}
