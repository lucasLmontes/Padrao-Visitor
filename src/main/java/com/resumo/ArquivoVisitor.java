package com.resumo;

public class ArquivoVisitor implements Visitor {

    public String exibir(Arquivo arquivo){
        return arquivo.aceitar(this);
    }

    @Override
    public String exibirArquivoSom(ArquivoSom arquivoSom){
        return "| Arquivo de Som |" + "\n" +
                "tipo-" + arquivoSom.getTipo() + "\n" +
                "nome-" + arquivoSom.getNome() + "\n" +
                "tamanho-" + arquivoSom.getTamanho();
    }

    @Override
    public String exibirArquivoTexto(ArquivoTexto arquivoTexto){
        return "| Arquivo de Texto |" + "\n" +
                "tipo-" + arquivoTexto.getTipo() + "\n" +
                "nome-" + arquivoTexto.getNome() + "\n" +
                "tamanho-" + arquivoTexto.getTamanho();
    }

    @Override
    public String exibirArquivoVideo(ArquivoVideo arquivoVideo){
        return "| Arquivo de Vídeo |" + "\n" +
                "tipo-" + arquivoVideo.getTipo() + "\n" +
                "nome-" + arquivoVideo.getNome() + "\n" +
                "tamanho-" + arquivoVideo.getTamanho();
    }
}
