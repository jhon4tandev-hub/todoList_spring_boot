package com.desafio.todoList.service;

import com.desafio.todoList.entity.Todo;
import com.desafio.todoList.repository.TodoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List list() {
        Sort sort = Sort.by(Sort.Direction.DESC, "prioridade")
                .and(Sort.by(Sort.Direction.ASC, "nome"));

        return todoRepository.findAll(sort);
    }

    public List create(Todo todo) {
        todoRepository.save(todo);
        return list();
    }

    public List update(Todo todo) {
        todoRepository.save(todo);
        return list();
    }

    public List delete(Long id) {
        todoRepository.deleteById(id);
        return list();
    }
}
