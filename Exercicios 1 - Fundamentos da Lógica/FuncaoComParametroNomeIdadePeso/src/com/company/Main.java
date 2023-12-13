package com.company;

import java.util.Scanner;

public class Main {

    static void imprimeDetalhesPessoa(String nome, int idade, double peso){
        System.out.println("NOME :" + nome);
        System.out.println("IDADE:" + idade);
        System.out.println("PESO :" + peso);
    }

    public static void main(String[] args) {
	    //FAÇA UM PROGRAMA QUE LEIA UM NOME, IDADE E PESO
        // E IMPRIMA NA TELA AS INFORMAÇÕES DA SEGUINTE FORMA:
            //NOME:
            //IDADE:
            //PESO:
        Scanner leitor = new Scanner(System.in);

        //Lê o nome
        System.out.println("Digite um nome:");
        String nome = leitor.nextLine();

        //Lê a idade
        System.out.println("Digite a idade:");
        int idade = leitor.nextInt();

        //Lê o peso
        System.out.println("Digite o peso:");
        double peso = leitor.nextDouble();

        //Chama a função para imprimir tudo na tela
        imprimeDetalhesPessoa(nome, idade, peso);

    }
}
