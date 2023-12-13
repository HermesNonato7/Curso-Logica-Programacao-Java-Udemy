package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // FAÇA UM PROGRAMA QUE LEIA 1 NÚMERO QUEBRADO
        // E IMPRIMA NA TELA SE ELE FOR MENOR QUE 5 OU MAIOR QUE 10
        Scanner leitor = new Scanner(System.in);
        double num = leitor.nextDouble();

        if(num < 5 || num > 10){
            System.out.println("É menor que 5 ou maior que 10");
        }

    }
}
