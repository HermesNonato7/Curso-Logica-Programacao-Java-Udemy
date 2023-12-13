package com.company;

import java.util.Scanner;

public class Main {

    static String saudacaoPortugues() {
        return "Bom dia";
    }

    static String saudacaoEspanhol() {
        return "Buenos dias";
    }

    public static void main(String[] args) {
        // FAÇA UM PROGRAMA QUE LEIA UM IDIOMA SELECIONADO NUMERICAMENTE
        // E EXIBA “BOM DIA” OU “BUENOS DIAS” ATRAVÉS DE FUNÇÕES COM RETORNO.

        Scanner leitor = new Scanner(System.in);
        System.out.println("Escolha um idioma:");
        System.out.println("1- Português");
        System.out.println("2- Espanhol");
        int opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                System.out.println(saudacaoPortugues());
                break;
            case 2:
                System.out.println(saudacaoEspanhol());
                break;
        }
    }
}
