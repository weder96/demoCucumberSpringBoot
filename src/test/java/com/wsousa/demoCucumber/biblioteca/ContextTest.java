package com.wsousa.demoCucumber.biblioteca;

import com.wsousa.demoCucumber.service.BibliotecaService;

public class ContextTest {

    public static final ContextTest INSTANCIA = new ContextTest();

    private BibliotecaService biblioteca;

    public BibliotecaService obtemServico(boolean carrega) {
        biblioteca = BibliotecaService.obtemServico(carrega);
        return biblioteca;
    }

    public BibliotecaService biblioteca() {
        return biblioteca;
    }
}
