package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //FAÇA UM PROGRAMA QUE LEIA UMA PALAVRA E
        //INFORME SE ELA TEM PELO MENOS 5 LETRAS OU SE TEM MENOS
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma palavra");
        String palavra = leitor.nextLine();

        if(palavra.length() >= 5){
            System.out.println("Tem pelo menos 5 letras");
        }else{
            System.out.println("Tem menos que 5 letras");
        }
    }
}
