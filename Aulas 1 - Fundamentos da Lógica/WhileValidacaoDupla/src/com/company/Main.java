package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a = 0;
        int b = 0;

        while(a < 10 || b < 10){

            System.out.println("Digite valores > 10:");

            //Lê os valores digitados
            Scanner leitor = new Scanner(System.in);
            a = leitor.nextInt();
            b = leitor.nextInt();

            //Quando chega aqui, o código volta para
            //a linha 8 e verifica se os dois valores
            //digitados são maiores ou iguais a 10
            //se um for menor, repete
        }

        System.out.println("Fim");
    }
}