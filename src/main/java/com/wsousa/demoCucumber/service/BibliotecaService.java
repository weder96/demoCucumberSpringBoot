package com.wsousa.demoCucumber.service;


import com.wsousa.demoCucumber.domain.Livro;
import com.wsousa.demoCucumber.domain.Topico;
import com.wsousa.demoCucumber.service.impl.BibliotecaServiceImpl;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface BibliotecaService {
    public static BibliotecaService obtemServico() {
        return new BibliotecaServiceImpl(true);
    }

    public static BibliotecaService obtemServico(boolean carregaBibioteca) {
        return new BibliotecaServiceImpl(carregaBibioteca);
    }

    Livro pesquisaLivroPorTitulo(String titulo);

    List<Livro> pesquisaLivrosDeComputacaoAgrupadosPorTitulo();

    Optional<Topico> topicoMaisPopular();

    List<String> pesquisaTitulosDosLivros();

    Map<Topico, List<Livro>> livrosAgrupadosPorTopico();

    Map<Topico, Long> contagemDosLivrosPorTopico();

    int contagemDosLivros();

    void adiciona(Livro livro);
}
