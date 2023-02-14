package com.lsilva.matheus.service;

import com.lsilva.matheus.modelo.Cliente;
import com.lsilva.matheus.modelo.Produto;
import com.lsilva.matheus.notificacao.NotificadorEmail;

public class EmissaoNotaFiscalService {

    public void emitir(Cliente cliente, Produto produto) {
        //TODO emite a nota fiscal aqui...
        NotificadorEmail notificador = new NotificadorEmail();
        notificador.notificar(cliente,
                "Nota fiscal do produto "
                + produto.getNome() + " foi emitida!");
    }
}
