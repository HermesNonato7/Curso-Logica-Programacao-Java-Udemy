package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //FAÇA UM PROGRAMA QUE LEIA UMA PALAVRA
        //E INFORME SE A PALAVRA FOR “DIA” OU NÃO
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma palavra");
        String palavra = leitor.nextLine();

        if(palavra.equals("dia")){
            System.out.println("Digitou dia");
        }else{
            System.out.println("Digitou outra coisa");
        }
    }
}
