package com.resumo;

public class ArquivoSom implements Arquivo {

    private String tipo;
    private String nome;
    private String tamanho;

    public ArquivoSom(String tipo, String nome, String tamanho) {
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
        return visitor.exibirArquivoSom(this);
    }
}
