package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu peso");
        String peso = leitor.nextLine();
        double metadePeso = Double.parseDouble(peso) / 2;
        System.out.println("Metade do peso:" + metadePeso + "kg");

    }
}
