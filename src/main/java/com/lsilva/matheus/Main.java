package com.lsilva.matheus;

import com.lsilva.matheus.modelo.Cliente;
import com.lsilva.matheus.notificacao.Notificador;
import com.lsilva.matheus.notificacao.NotificadorSMS;
import com.lsilva.matheus.service.AtivacaoClienteService;

public class Main {
    public static void main(String[] args) {
        Cliente joao = new Cliente("João", "joao@xyz.com", "19999999999");
        Cliente maria = new Cliente("Maria", "maria@xyz.com", "19888888888");

        Notificador notificador = new NotificadorSMS();
        AtivacaoClienteService service = new AtivacaoClienteService(notificador);
        service.ativar(joao);
        service.ativar(maria);
    }
}