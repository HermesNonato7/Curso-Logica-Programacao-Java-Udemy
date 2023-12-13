package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // FAÇA UM PROGRAMA QUE LEIA 1 NÚMERO QUEBRADO E IMPRIMA
        // NA TELA SE ELE ESTIVER ENTRE 5 E 20
        Scanner leitor = new Scanner(System.in);
        double num = leitor.nextDouble();

        if(num > 5 && num < 20){
            System.out.println("Está entre 5 e 20");
        }else{
            System.out.println("Não está entre 5 e 20");
        }

    }
}
