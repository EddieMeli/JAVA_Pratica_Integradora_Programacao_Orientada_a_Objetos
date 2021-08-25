package com.company;

public class Pessoa {
    String vNome;
    int vIdade;
    String Id;
    Double Peso;


    public Pessoa() {
    }

    public Pessoa(String vNome, int vIdade, String id) {
        this.vNome = vNome;
        this.vIdade = vIdade;
        Id = id;
    }

    public Pessoa(String vNome, int vIdade, String id, Double peso) {
        this.vNome = vNome;
        this.vIdade = vIdade;
        Id = id;
        Peso = peso;
    }
}
