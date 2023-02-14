package com.lsilva.matheus.notificacao;

import com.lsilva.matheus.modelo.Cliente;

public class NotificadorSMS {
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s por SMS através do telefone %s: %s",
                cliente.getNome(), cliente.getTelefone(), mensagem);
    }
}
