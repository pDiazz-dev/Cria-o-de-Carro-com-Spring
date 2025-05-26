package com.github.pdiazzdev.arquiteturaspring.todos;

import org.springframework.stereotype.Component;


@Component
public class TodoValidator {
    private TodoRepository repository;

    public TodoValidator(TodoRepository repository) {
        this.repository = repository;
    }

    public void validar(TodoEntity todo){
        if (existeTodoComDescricap(todo.getDescricao())){
            throw new IllegalArgumentException("Já existe um Todo com essa descrção");
        }
    }

    private boolean existeTodoComDescricap(String descricao){
        return repository.existsByDescricao(descricao);
    }
}
