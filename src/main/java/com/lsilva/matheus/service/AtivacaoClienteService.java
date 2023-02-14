package com.lsilva.matheus.service;

import com.lsilva.matheus.modelo.Cliente;
import com.lsilva.matheus.notificacao.Notificador;

public class AtivacaoClienteService {
    private final Notificador notificador;

    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();
        this.notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }
}
