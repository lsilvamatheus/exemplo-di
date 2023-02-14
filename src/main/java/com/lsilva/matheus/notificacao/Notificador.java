package com.lsilva.matheus.notificacao;

import com.lsilva.matheus.modelo.Cliente;

public interface Notificador {
    void notificar(Cliente cliente, String mensagem);
}
