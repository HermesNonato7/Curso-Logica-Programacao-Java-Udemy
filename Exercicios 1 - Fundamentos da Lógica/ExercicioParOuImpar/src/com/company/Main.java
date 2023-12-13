package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // FAÇA UM PROGRAMA QUE LEIA 1 NÚMERO INTEIRO E
        // IMPRIMA NA TELA SE ELE FOR ÍMPAR (PESQUISE
        // SOBRE A OPERAÇÃO RESTO DE DIVISÃO QUE É O %)
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();

        if(a % 2 > 0){
            System.out.println("É ímpar !");
        }else{
            System.out.println("É par !");
        }

    }
}
