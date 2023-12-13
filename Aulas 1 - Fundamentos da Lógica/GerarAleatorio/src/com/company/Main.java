package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //Gerador de aleatórios
        Random aleatorio = new Random();

        //Gera um aleatório de 0 a 10
        System.out.println(aleatorio.nextInt(11));

        //Gera um aleatório de 5 a 10
        int min = 5;
        int max = 10;
        int numeroGerado = min + aleatorio.nextInt(max - min +1);
        System.out.println(numeroGerado);

        //numeroGerado = 5 + Algo entre (10 - 5 + 1)
        //Ou seja adiciona ao 5 => algo entre 0 e 5

    }
}
