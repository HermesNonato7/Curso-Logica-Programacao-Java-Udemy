package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //-FAÇA UM PROGRAMA QUE LEIA UM NÚMERO
        //-E IMPRIMA QUAL DIA DA SEMANA DE ACORDO COM O NÚMERO LIDO USANDO O VETOR:
        //-[Domingo,Segunda,Terça,Quarta,Quinta,Sexta,Sábado]
        final String[] diasDaSemana = {"Domingo","Segunda","Terça","Quarta","Quinta","Sexta","Sábado"};

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 7");
        int opcao = leitor.nextInt();
        System.out.println("Dia correspondente:"+diasDaSemana[opcao-1]);

    }
}
