package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Digite a idade de 2 pessoas. Se a idade de uma delas for maior que 17 anos o programa retornará OK, senão retornará PROBLEMA");

        //Cria o leitor
        Scanner leitor = new Scanner(System.in);

        //Lê a idade de cada pessoa
        int pessoa1 = leitor.nextInt();
        int pessoa2 = leitor.nextInt();

        //Comparações em que uma pessoa precisa ser
        //maior de idade
        if (pessoa1 > 17 || pessoa2 > 17) {
            System.out.println("OK");
        } else {
            System.out.println("PROBLEMA");
        }
    }
}
