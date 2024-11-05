package com.resumo;

public class ArquivoTexto implements Arquivo {

    private String tipo;
    private String nome;
    private String tamanho;

    public ArquivoTexto(String tipo, String nome, String tamanho) {
        this.tipo = tipo;
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String aceitar(Visitor visitor){
        return visitor.exibirArquivoTexto(this);
    }
}
