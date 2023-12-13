package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //1-FAÇA UM PROGRAMA QUE GERA DOIS NÚMEROS DE 1 E 6
        //2-E IMPRIMA SE A MULTIPLICAÇÃO ENTRE ELES É MAIOR OU MENOR QUE 15.

        //Gerador de aleatórios
        Random aleatorio = new Random();

        //Gera dois aleatórios de 1 a 6
        int min = 1;
        int max = 6;
        int dado1 = min + aleatorio.nextInt(max - min +1);
        int dado2 = min + aleatorio.nextInt(max - min +1);

        if(dado1 * dado2 > 15){
            System.out.println("A multiplicação é maior que 15");
        }else{
            System.out.println("A multiplicação é menor ou igual a 15");
        }
    }
}
