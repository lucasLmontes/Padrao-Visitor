package com.resumo;

public interface Visitor {

    String exibirArquivoSom(ArquivoSom arquivoSom);
    String exibirArquivoTexto(ArquivoTexto arquivoTexto);
    String exibirArquivoVideo(ArquivoVideo arquivoVideo);
}
