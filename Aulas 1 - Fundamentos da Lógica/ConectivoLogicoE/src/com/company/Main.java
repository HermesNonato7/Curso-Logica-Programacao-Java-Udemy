package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Digite 2 idades. Se as duas pessoas são maiores de idade o programa retorna OK, senão retorna PROBLEMA\n");

        //Cria o leitor
        Scanner leitor = new Scanner(System.in);

        //Lê a idade de cada pessoa
        System.out.println("Digite a idade da pessoa 1:");
        int pessoa1 = leitor.nextInt();
        System.out.println("Digite a idade da pessoa 2:");
        int pessoa2 = leitor.nextInt();

        //Comparações em que as duas pessoas precisam
        //ser maiores de idade
        if (pessoa1 > 17 && pessoa2 > 17) {
            System.out.println("OK");
        } else {
            System.out.println("PROBLEMA");
        }
    }
}
