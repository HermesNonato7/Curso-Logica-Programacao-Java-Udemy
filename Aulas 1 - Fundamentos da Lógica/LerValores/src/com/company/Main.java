package com.company;
//É preciso adicionar uma biblioteca antes da public class para ele ser reconhecido
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Inicializa o scanner
        Scanner leitor = new Scanner(System.in);

        //Ler Idade
        System.out.println("Quantos anos você tem?: ");
        int idade;
        idade = leitor.nextInt();
        leitor.nextLine();

        //Ler Sexo
        System.out.println("Qual é o seu sexo: ");
        String sexo = leitor.nextLine();

        //Ler Altura
        System.out.println("Qual é a sua altura: ");
        double altura = leitor.nextDouble();
        leitor.nextLine();

        System.out.println("Sexo lido:" + sexo);
        System.out.println("Altura lida:" + altura);
        System.out.println("Idade lida:" + idade);

    }
}
