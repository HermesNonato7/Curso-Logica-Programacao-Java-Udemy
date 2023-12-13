package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // 1-FAÇA UM PROGRAMA QUE LEIA UM NÚMERO
        // 2-E IMPRIMA QUAL DIA DA SEMANA DE ACORDO COM O NÚMERO LIDO USANDO SWITCH
        // (1-Domingo,2-Segunda,3-Terça,4-Quarta,//5-Quinta,6-Sexta,7-Sábado)

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 7");

        int opcao = leitor.nextInt();
        switch (opcao){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
        }

    }
}
