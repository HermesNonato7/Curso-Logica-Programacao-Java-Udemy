package com.company;

public class Main {

    static int retorna10(){
        int a = 10;
        return a;
    }

    static double retornaQuebrado(){
        double a = 5.5;
        return a;
    }

    static char retornaLetra(){
       return 'a';
    }

    public static void main(String[] args) {
	    //Função direto no System.out.println
        System.out.println("Retorna 10 da funcao:" + retorna10());

        //Função retornando um valor para uma variável
        double numeroQuebrado = retornaQuebrado();
        System.out.println("Número quebrado:" + retornaQuebrado());

        //Retornando direto no System.out.println
        System.out.println("Retorna letr" + retornaLetra());

    }
}
