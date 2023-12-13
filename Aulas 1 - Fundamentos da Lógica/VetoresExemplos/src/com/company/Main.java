package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Definindo Vetores de Várias Formas
        int[] vetorDeInt = {1,2,3,4};
        double[] vetorDeDouble = {1.5,2.2,3.0};
        char[] vetorDeChar = {'a','b'};

        //Modificando Valor por atribuição
        vetorDeDouble[0] = 9.1;

        //Modificando Valor com variável
        double novoValor = 5.0;
        vetorDeDouble[2] = novoValor;

        //Modificando Valor com usuário
        System.out.println("Digite um número:");
        Scanner leitor = new Scanner(System.in);
        vetorDeInt[0] = leitor.nextInt();

        //Imprimindo vetores
        int i = 0;
        System.out.println("Vetor 1: \n");
        for(i = 0; i < 4 ; i++){
            System.out.println(vetorDeInt[i]);
        }

        System.out.println("Vetor 2: \n");
        for(i = 0; i < 3 ; i++){
            System.out.println(vetorDeDouble[i]);
        }

        System.out.println("Vetor 3: \n");
        for(i = 0; i < 2 ; i++){
            System.out.println(vetorDeChar[i]);
        }

        //Lendo Valores Para o Vetor e
        System.out.println("Digite inteiros");
        for(i = 0; i < 4 ; i++){
            System.out.println("Lendo em vetor["+i+"]:");
            vetorDeInt[i] = leitor.nextInt();
        }

        //Imprimindo este vetor atualizado
        for(i = 0; i < 4 ; i++){
            System.out.println(vetorDeInt[i]);
        }
    }
}
