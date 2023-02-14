package com.lsilva.matheus.service;

import com.lsilva.matheus.modelo.Cliente;
import com.lsilva.matheus.notificacao.NotificadorEmail;

public class AtivacaoClienteService {

    public void ativar(Cliente cliente) {
        cliente.ativar();
        NotificadorEmail notificador = new NotificadorEmail();
        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }
}
