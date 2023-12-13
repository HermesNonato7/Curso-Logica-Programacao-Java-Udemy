package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // FAÇA UM PROGRAMA QUE LEIA 2 NÚMEROS INTEIROS E
        // IMPRIMA NA TELA SE A SOMA ENTRE ELES FOR MAIOR QUE 10
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número");
        int a = leitor.nextInt();

        System.out.println("Digite um número");
        int b = leitor.nextInt();

        int soma = a + b;

        if(soma > 10){
            System.out.println("A soma é maior que 10");
        }else{
            System.out.println("A soma não é maior que 10");
        }
    }
}
