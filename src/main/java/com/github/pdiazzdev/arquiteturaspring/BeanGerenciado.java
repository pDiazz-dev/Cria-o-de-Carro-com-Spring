package com.github.pdiazzdev.arquiteturaspring;

import com.github.pdiazzdev.arquiteturaspring.todos.TodoEntity;
import com.github.pdiazzdev.arquiteturaspring.todos.TodoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Lazy
@Component
@Scope("request")
public class BeanGerenciado {

    @Autowired
    private TodoValidator validator;
    private TodoValidator validador;

    public void utilizar() {
        var todo = new TodoEntity();
        validator.validar(todo);

    }
    @Autowired
        public void setValidato(TodoValidator  validador){
            this.validador = validador;
        }
    }
