package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // 1-FAÇA UM PROGRAMA QUE LEIA UM NÚMERO
        // 2-E MULTIPLIQUE O RESULTADO POR 2
        // 3-ATÉ O NÚMERO PASSAR 100.

        Scanner leitor = new Scanner(System.in);
        int num = 0;

        //Validação da entrada
        while(num < 1 || num > 100){
            System.out.println("Digite um número de 1 a 100");
            num = leitor.nextInt();
        }

        //Multiplicação até ser maior que 100
        while(num < 100){
            System.out.println(num);
            num = num * 2;
        }
    }
}
