package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //FAÇA UM PROGRAMA QUE LEIA 9 VALORES NUMA MATRIZ 3X3
        //E IMPRIMA ESSES VALORES NA TELA (3 POR LINHA)
        int[][] matriz = new int[3][3];
        Scanner leitor = new Scanner(System.in);

        //Percorre cada posição da matriz
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                //Lê um valor em cada posição
                System.out.println("Digite um valor["+i+","+j+"]:");
                matriz[i][j] = leitor.nextInt();
            }
        }

        //Percorre cada posição da matriz
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                //Imprime na tela o valor daquela posição
                System.out.print(matriz[i][j]);
            }
            //Pula linha
            System.out.println();
        }
    }
}
