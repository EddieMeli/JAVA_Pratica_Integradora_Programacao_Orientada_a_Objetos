package com.company;

import java.util.*;

public class Main {

        public static void main(String[] args) {
            // Objeto tipo pessoa
            Pessoa pessoa0 = new Pessoa();
            Pessoa pessoa1 = new Pessoa("Edenilson Teixeira Paschoa", 33, "3");
            Pessoa pessoa2 = new Pessoa("Edenilson Teixeira Paschoa", 33, "4", 76, 1.75);
            // -- Pessoa pessoa = new Pessoa("Edenilson Teixeira Paschoa", 33); // Declaração incorreta,

            String MaiorDeIdade =  "";

            if (pessoa0.eMaiorDeIdade()){
                MaiorDeIdade = "Sim";
            }else {
                MaiorDeIdade = "Não";
            }
            //System.out.println("Pesspa0 " + MaiorDeIdade + " é maior de idade:");
            //System.out.println("Calculo do IMC Pesspa0:" + pessoa0.calculaIMC());




            if (pessoa1.eMaiorDeIdade()){
                MaiorDeIdade = "Sim";
            }else {
                MaiorDeIdade = "Não";
            }

            //System.out.println("Pesspa1 " + MaiorDeIdade + " é maior de idade:");

            //System.out.println("Calculo do IMC Pesspa1:" + pessoa0.calculaIMC());


            if (pessoa2.eMaiorDeIdade()){
                MaiorDeIdade = "Sim";
            }else {
                MaiorDeIdade = "Não";
            }
            System.out.println("Pessoa2 " + MaiorDeIdade + " é maior de idade:");

            int IMC = pessoa2.calculaIMC();

            switch (IMC) {
                case 20:
                    System.out.println("Peso Baixo");
                    break;
                case -1:
                    System.out.println("Peso Saudável");
                    break;
                case 1:
                    System.out.println("Sobrepeso");
                    break;
                default:
                    System.out.println("Erro Inesperado");
            }


            // System.out.println(flgMaiorDeIdade);
        }
}
