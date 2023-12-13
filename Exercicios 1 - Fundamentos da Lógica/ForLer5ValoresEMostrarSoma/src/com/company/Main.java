package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //-FAÇA UM PROGRAMA QUE LEIA 5 VALORES (USANDO O FOR)
        //-E MOSTRE A SOMA DELES

        Scanner leitor = new Scanner(System.in);
        int valorLido;
        int soma = 0;

        //Lê valores 5 vezes
        for(int i = 0; i < 5; i++){

            //Lê um valor digitado pelo usuário
            System.out.println("Digite um valor:");
            valorLido = leitor.nextInt();

            //Incrementa a soma com o novo valor lido
            soma = soma + valorLido;
        }

        System.out.println("Resultado:"+soma);
    }
}
