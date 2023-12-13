package com.company;

public class Main {

    static int retorna10(){
        int a = 10;
        return a;
    }

    static double retornaQuebrado(){
        double a = 100.8;
        return a;
    }

    static char retornaLetra(){
        char letra = 'x';
        return letra;
    }

    public static void main(String[] args) {
        //Função direto no System.out.println
        System.out.println("Retorna 10 da funcao:" + retorna10());

        //Função retornando um valor para uma variável
        double numeroQuebrado = retornaQuebrado();
        System.out.println("Número quebrado:" + numeroQuebrado);

        //Retornando direto no System.out.println
        System.out.println("Retorna letra: " + retornaLetra());
    }
}

