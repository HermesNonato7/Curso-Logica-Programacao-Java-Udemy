package com.company;

public class Main {

    public static void main(String[] args) {
	    // FAÇA UM PROGRAMA QUE IMPRIMA NA TELA A SOMA DOS 10 PRIMEIROS NÚMEROS NATURAIS.
        // 1-FAZER ALGO 10 VEZES
        // 2-ARMAZENAR A SOMA EM UMA VARIÁVEL

        int i = 0;
        int soma = 0;

        while(i < 10){
            //System.out.println("Valor atual da soma:" + soma);
            //System.out.println("Valor atual de i:" + i);
            soma = soma + i;
            //System.out.println("Valor novo da soma:" + soma);
            //System.out.println();
            i++;
        }

        System.out.println("A soma dos 10 primeiros naturais é:" + soma);

    }
}
