package com.github.pdiazzdev.arquiteturaspring.todos;

import org.springframework.stereotype.Component;

@Component
public class MailSender {

    public void enviar(String mensagem){
        System.out.println("Ebvuadi Email: " + mensagem);
    }
}
