package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // FAÇA UM PROGRAMA QUE LEIA UM NOME E UM SOBRENOME
        // E IMPRIMA NA TELA O NOME COMPLETO.
        String nome, sobrenome;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        nome = leitor.nextLine();
        System.out.println("Digite seu sobrenome:");
        sobrenome = leitor.nextLine();
        System.out.println("Nome completo:" + nome + " " + sobrenome);

    }
}
