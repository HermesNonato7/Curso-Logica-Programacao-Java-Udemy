package com.company;

import java.util.Scanner;

public class Main {

    //Quando crio funções que serão chamadas na main
    //Preciso que elas também sejam static
    //Pois a main em si não é um OBJETO
    static void desenhaSeparador(){
        System.out.println("-+-+-+-+-+-+-+-+-+");
    }

    public static void main(String[] args) {
        desenhaSeparador();
        System.out.println("Oi");
        desenhaSeparador();
        System.out.println("Fim");
    }
}
