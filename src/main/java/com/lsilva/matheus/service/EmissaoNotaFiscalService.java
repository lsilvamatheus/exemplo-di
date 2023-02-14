package com.lsilva.matheus.service;

import com.lsilva.matheus.modelo.Cliente;
import com.lsilva.matheus.modelo.Produto;
import com.lsilva.matheus.notificacao.Notificador;

public class EmissaoNotaFiscalService {
    private final Notificador notificador;

    public EmissaoNotaFiscalService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void emitir(Cliente cliente, Produto produto) {
        //TODO emite a nota fiscal aqui...
        notificador.notificar(cliente,
                "Nota fiscal do produto "
                + produto.getNome() + " foi emitida!");
    }
}
