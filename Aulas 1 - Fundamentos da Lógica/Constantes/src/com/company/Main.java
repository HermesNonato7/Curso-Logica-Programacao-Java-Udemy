package com.company;

public class    Main {

    public static void main(String[] args) {

        final int LIMITE_SUPERIOR = 10;

        //Consigo imprimir e usar o valor
        System.out.println("A vale:" + LIMITE_SUPERIOR);

        for(int i = 0; i < LIMITE_SUPERIOR; i++){
            System.out.println(i);
        }

        //Não consigo mudar o valor
        //LIMITE_SUPERIOR = 20;
    }
}
