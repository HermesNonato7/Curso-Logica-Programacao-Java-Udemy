package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //1-FAÇA UM PROGRAMA QUE LEIA DOIS NÚMEROS
        //2-E IMPRIMA TODOS OS NÚMEROS INTEIROS ENTRE ELES.

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o limite inferior:");
        int limiteInferior = leitor.nextInt();
        System.out.println("Digite o limite superior");
        int limiteSuperior = leitor.nextInt();

        int i = limiteInferior + 1;
        while(i < limiteSuperior){
            System.out.println(i);
            i++;
        }

    }
}
