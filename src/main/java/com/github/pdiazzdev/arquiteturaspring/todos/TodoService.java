package com.github.pdiazzdev.arquiteturaspring.todos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private TodoRepository repository;

    public TodoService(TodoRepository todoRepository){
        this.repository = todoRepository;
    }
    public TodoEntity salvar(TodoEntity novoTodo){
        return repository.save(novoTodo);
    }
}
