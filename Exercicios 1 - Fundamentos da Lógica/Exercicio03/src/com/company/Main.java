package com.company;

public class Main {

    public static void main(String[] args) {
	    // FAÇA UM PROGRAMA QUE MOSTRE O RESTO DA DIVISÃO DE 2 NÚMEROS QUEBRADOS
        double a = 3.2;
        double b = 1.5;
        double restoDaDivisao = a % b;
        System.out.println("Resto:" + String.format("%.2f",restoDaDivisao) );
    }
}
