package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // FAÇA UM PROGRAMA QUE
        // 1-LEIA 2 NÚMEROS INTEIROS E
        // 2-IMPRIMA NA TELA SE PELO MENOS UM DELES FOR MAIOR QUE 10
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();

        if(a > 10 || b > 10){
            System.out.println("Pelo menos um deles é maior que 10");
        }else{
            System.out.println("Nenhum deles é maior que 10");
        }
    }
}
