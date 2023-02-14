package com.lsilva.matheus.service;

import com.lsilva.matheus.modelo.Cliente;
import com.lsilva.matheus.notificacao.NotificadorEmail;
import com.lsilva.matheus.notificacao.NotificadorSMS;

public class AtivacaoClienteService {

    public void ativar(Cliente cliente) {
        cliente.ativar();
        NotificadorSMS notificador = new NotificadorSMS();
        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }
}
