package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //Criando um vetor vazio
        final int TAM = 5;
        int[] vetor = new int[TAM];
        for(int i = 0; i < TAM; i++){
            vetor[i] = leitor.nextInt();
        }

        //Imprime o vetor lido
        for(int i = 0; i < TAM; i++){
            System.out.println(vetor[i]);
        }

        //Criando um vetor com valores definidos
        int[] vetor2 = {1,2,3,4,5};
        for(int i = 0; i < TAM; i++){
            System.out.println(vetor2[i]);
        }
    }
}
