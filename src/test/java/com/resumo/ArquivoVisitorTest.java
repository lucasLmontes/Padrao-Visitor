package com.resumo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArquivoVisitorTest {

    @Test
    public void deveExibirArquivoDeSom(){
        ArquivoSom som = new ArquivoSom("MP3", "Música1", "12 MB");

        ArquivoVisitor visitor = new ArquivoVisitor();

        assertEquals("| Arquivo de Som |" + "\n" +
                "tipo-MP3" + "\n" +
                "nome-Música1" + "\n" +
                "tamanho-12 MB", visitor.exibir(som));
    }

    @Test
    public void deveExibirArquivoDeTexto(){
        ArquivoTexto texto = new ArquivoTexto("DOCX", "Texto1", "80 KB");

        ArquivoVisitor visitor = new ArquivoVisitor();

        assertEquals("| Arquivo de Texto |" + "\n" +
                "tipo-DOCX" + "\n" +
                "nome-Texto1" + "\n" +
                "tamanho-80 KB", visitor.exibir(texto));
    }

    @Test
    public void deveExibirArquivoVideo(){
        ArquivoVideo video = new ArquivoVideo("MP4", "Vídeo1", "20 MB");

        ArquivoVisitor visitor = new ArquivoVisitor();

        assertEquals("| Arquivo de Vídeo |" + "\n" +
                "tipo-MP4" + "\n" +
                "nome-Vídeo1" + "\n" +
                "tamanho-20 MB", visitor.exibir(video));
    }
}