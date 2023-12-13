package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Cria o leitor
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma idade:");

        //O valor lido pelo usuário vai para a
        //variável idade
        int idade = leitor.nextInt();

        //Analisa a idade inserida e imprime algo
        if (idade > 17) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

    }
}
