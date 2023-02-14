package com.lsilva.matheus.notificacao;

import com.lsilva.matheus.modelo.Cliente;

public class NotificadorEmail {
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s através do e-mail %s: %s\n",
        cliente.getNome(), cliente.getEmail(), mensagem);

    }
}
