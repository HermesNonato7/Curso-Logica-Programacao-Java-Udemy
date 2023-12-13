package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Apresenta o menu
        System.out.println("Menu               \n");
        System.out.println("a -  Espresso      \n");
        System.out.println("b -  Cappuccino    \n");
        System.out.println("c -  Macchiato     \n");
        System.out.println("Escolha uma opcao: \n");

        //Lê a opção escolhida
        Scanner leitor = new Scanner(System.in);
        String opcao = leitor.next();

        //Seleção da opção
        switch (opcao) {
            case "a":
                System.out.println("Espresso escolhido.");
                break;
            case "b":
                System.out.println("Cappuccino escolhido.");
                break;
            case "c":
                System.out.println("Macchiato escolhido.");
                break;
        }
    }
}
