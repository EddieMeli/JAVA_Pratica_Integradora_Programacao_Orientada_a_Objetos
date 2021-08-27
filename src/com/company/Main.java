package com.company;

import java.util.*;

public class Main {

        public static void main(String[] args) {
            // Objeto tipo pessoa
            Pessoa pessoa0 = new Pessoa();
            Pessoa pessoa1 = new Pessoa("Edenilson Teixeira Paschoa", 33, "3");
            Pessoa pessoa2 = new Pessoa("Edenilson Teixeira Paschoa", 33, "4", 85, 1.71);
            // -- Pessoa pessoa = new Pessoa("Edenilson Teixeira Paschoa", 33); // Declaração incorreta,

            String MaiorDeIdade =  "";

            if (pessoa0.eMaiorDeIdade()){
                MaiorDeIdade = "Sim";
            }else {
                MaiorDeIdade = "Não";
            }
            System.out.println("Pesspa0 " + MaiorDeIdade + " é maior de idade:");
            System.out.println("Calculo do IMC Pesspa0:" + pessoa0.calculaIMC());




            if (pessoa1.eMaiorDeIdade()){
                MaiorDeIdade = "Sim";
            }else {
                MaiorDeIdade = "Não";
            }

            System.out.println("Pesspa1 " + MaiorDeIdade + " é maior de idade:");

            System.out.println("Calculo do IMC Pesspa1:" + pessoa0.calculaIMC());


            if (pessoa2.eMaiorDeIdade()){
                MaiorDeIdade = "Sim";
            }else {
                MaiorDeIdade = "Não";
            }

            System.out.println("Pesspa2 " + MaiorDeIdade + " é maior de idade:");

            System.out.println("Calculo do IMC Pesspa2:" + pessoa2.calculaIMC());
            // System.out.println(flgMaiorDeIdade);
        }
}
