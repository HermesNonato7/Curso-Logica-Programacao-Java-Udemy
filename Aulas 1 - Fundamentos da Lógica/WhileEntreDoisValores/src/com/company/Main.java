package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a = 0;

        while(a < 1 || a > 6){

            System.out.println("Digite de 1 e 6:");

            //Lê os valores digitados
            Scanner leitor = new Scanner(System.in);
            a = leitor.nextInt();

            //Quando chega aqui, o código volta para
            //a linha 8 e verifica se está entre 1 e 6
        }

        System.out.println("Fim");
    }
}

