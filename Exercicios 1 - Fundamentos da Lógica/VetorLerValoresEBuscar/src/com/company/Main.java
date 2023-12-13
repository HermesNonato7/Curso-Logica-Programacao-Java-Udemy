package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //FAÇA UM PROGRAMA QUE LEIA 5 NÚMEROS
        //E ADICIONE-OS NUM ARRAY.
        //DEPOIS QUANDO O USUÁRIO DIGITAR UM NÚMERO PARA SER BUSCADO,
        //INFORME SE ELE ESTÁ OU NÃO NO ARRAY.

        int[] vetor = new int[5];
        boolean foiEncontrado = false;
        Scanner leitor = new Scanner(System.in);

        //Adiciona os valores no array
        vetor[0] = leitor.nextInt();
        vetor[1] = leitor.nextInt();
        vetor[2] = leitor.nextInt();
        vetor[3] = leitor.nextInt();
        vetor[4] = leitor.nextInt();

        //Lê a busca
        System.out.println("Digite uma busca:");
        int valorBuscado = leitor.nextInt();

        for(int i = 0; i < 5; i++){
            //Se o vetor naquela posição atual é igual ao valor buscado
            if(vetor[i] == valorBuscado){
                foiEncontrado = true;
            }
        }

        if(foiEncontrado){
            System.out.println("Foi encontrado!");
        }else{
            System.out.println("Não foi encontrado!");
        }
    }
}
