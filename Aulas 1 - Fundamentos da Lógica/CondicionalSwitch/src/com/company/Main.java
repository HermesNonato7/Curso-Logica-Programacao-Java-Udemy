package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        //Apresenta o menu
        System.out.println("Menu               \n");
        System.out.println("1 -  Espresso      \n");
        System.out.println("2 -  Cappuccino    \n");
        System.out.println("3 -  Macchiato     \n");
        System.out.println("Escolha uma opcao: \n");

        //Lê a opção escolhida
        Scanner leitor = new Scanner(System.in);
        int opcao = leitor.nextInt();

        //Seleção da opção
        switch(opcao){
            case 1:
                System.out.println("Espresso escolhido.");
                break;
            case 2:
                System.out.println("Cappuccino escolhido.");
                break;
            case 3:
                System.out.println("Macchiato escolhido.");
                break;
            default:
                System.out.println("Opcao invalida!");
                break;
        }
    }
}
