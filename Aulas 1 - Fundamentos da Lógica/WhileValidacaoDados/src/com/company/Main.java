package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int i = 0;

        while(i != 10){

            System.out.println("Digite 10:");

            //Lê o valor digitado
            Scanner leitor = new Scanner(System.in);
            i = leitor.nextInt();

            //Quando chega aqui, o código volta para
            //a linha 8 e verifica se o valor digitado
            //é 10 para poder continuar, ou se ele
            //NÃO FOR == 10, então executa de novo
        }

        System.out.println("Fim");
    }
}
