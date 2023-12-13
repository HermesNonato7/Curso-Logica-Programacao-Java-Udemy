package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Define uma matriz vazia
        int[][] matriz1 = new int[2][];

        //Define uma matriz já com valores
        int[][] matriz2 = {{1,2},{3,4}};


        //Modifica um valor
        matriz2[0][0] = 2;

        //Define a matriz
        int[][] matriz = {{1,2,3},{4,5,6}};

        //Lendo novos valores para a matriz
        Scanner leitor = new Scanner(System.in);
        //Percorre a matriz
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                //Lê o valor de cada posição
                matriz[i][j] = leitor.nextInt();
            }
            //Pula uma linha
            System.out.println();
        }

        //Percorre a matriz
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                //Imprime o valor de cada posição
                System.out.print(matriz[i][j]);
            }
            //Pula uma linha
            System.out.println();
        }

    }

}





