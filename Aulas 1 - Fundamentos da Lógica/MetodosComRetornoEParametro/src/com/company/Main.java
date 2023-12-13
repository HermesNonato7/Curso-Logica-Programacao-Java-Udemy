package com.company;

import java.util.Scanner;

public class Main {

    static void imprimeSoma(int a, int b){
        System.out.println("Soma:" + (a+b));
    }

    static double retornaSoma(int a, int b){
        int soma = a + b;
        return soma;
    }

    static double retornaComMais10(double a){
        return a + 10.0;
    }

    public static void main(String[] args) {

        //Enviando para imprimir
        int valor1, valor2;
        System.out.printf("Insira dois valores inteiros");
        Scanner leitor = new Scanner(System.in);
        valor1 = leitor.nextInt();
        valor2 = leitor.nextInt();
        imprimeSoma(valor1,valor2);

        //Retornando a soma
        System.out.println("Resultado da soma:" + retornaSoma(10,20));

        //Função retornando um valor para uma variável
        double valorFinal = retornaComMais10(5.3);
        System.out.println("Número quebrado:" + valorFinal);

    }
}
