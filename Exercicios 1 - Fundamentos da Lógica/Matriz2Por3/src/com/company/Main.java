package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Define a matriz
        int[][] matriz = {{1,2,3},{4,5,6}};

        //Lendo novos valores para a matriz
        Scanner leitor = new Scanner(System.in);
        //Percorre a matriz
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                //Lê o valor de cada posição
                matriz[i][j] = leitor.nextInt();
            }
            //Pula uma linha
            System.out.println();
        }

        /**
         * 1ª vez: i = 0
         *     1ª vez j = 0   -> Lê o valor para [0][0]
         *     2ª vez j = 1   -> Lê o valor para [0][1]
         *     3ª vez j = 2   -> Lê o valor para [0][2]
         *2ª vez: i = 1
         *     1ª vez j = 0   -> Lê o valor para [1][0]
         *     2ª vez j = 1   -> Lê o valor para [1][1]
         *     3ª vez j = 2   -> Lê o valor para [1][2]
         */

        //Percorre a matriz
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                //Imprime o valor de cada posição
                System.out.print(matriz[i][j]);
            }
            //Pula uma linha
            System.out.println();
        }
    }
}
