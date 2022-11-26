package br.com.algamilhas.domain;

public class Participante {
    private String nome;
    private int saldoDePontos;


    public Participante(String nome) {
        new Participante(nome, 0);
    }

    private Participante(String nome, int saldoDePontos) {
        this.nome = nome;
        this.saldoDePontos = saldoDePontos;

    }

    public void creditarPontos(int pontos) {
        this.saldoDePontos += pontos;
    }


}
