package com.company;

public class Pessoa {
    double vAltura = 0;
    String vNome;
    int vIdade = 0;
    String Id = "0";
    double vPeso = 0;

    // -- Construtores
    public Pessoa() {
    }

    public Pessoa(String vNome, int vIdade, String id) {
        this.vNome = vNome;
        this.vIdade = vIdade;
        Id = id;
    }

    public Pessoa(String vNome, int vIdade, String id, double vPeso, double vAltura) {
        this.vNome = vNome;
        this.vIdade = vIdade;
        this.vAltura = vAltura;
        this.Id = id;
        this.vPeso = vPeso;
    }
    // -- Fim construtores
    // -- Metodos
    public int calculaIMC() {
        double IMC = 0;

        if (vPeso != 0 && vAltura != 0) {
            IMC = vPeso / Math.pow(vAltura, 2);
        }
        if (IMC < 20) {
            return 20;
        } else if (IMC >= 20 && IMC <= 20) {
            return -1;
        } else if (IMC >= 25) {
            return 1;
        }
        return 0;
    }

    public boolean eMaiorDeIdade() {
        if (vIdade >= 18){
            return true;
        } else {
            return  false;
        }
    }
}
