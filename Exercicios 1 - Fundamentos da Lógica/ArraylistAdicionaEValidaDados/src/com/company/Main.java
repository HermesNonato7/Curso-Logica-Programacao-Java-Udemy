package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //FAÇA UM PROGRAMA QUE ADICIONE NÚMEROS INTEIROS NUM ARRAYLIST
        //ATÉ O NÚMERO DIGITADO SER -1.
        //DEPOIS IMPRIMA O ARRAYLIST LIDO NA TELA.
        ArrayList<Integer> listaDeNumeros = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);
        int valorLido = 0;

        //Enquanto usuário digitar valores diferentes de -1
        while (valorLido != -1) {
            //Lê o valor do usuário
            System.out.println("Digite um valor:");
            valorLido = leitor.nextInt();

            //Só adiciona o valor ao arraylist se ele não for -1
            if (valorLido != -1) {
                listaDeNumeros.add(valorLido);
            }
        }

        //Imprime o arraylist
        for (int i = 0; i < listaDeNumeros.size(); i++) {
            System.out.println(listaDeNumeros.get(i));
        }

    }
}
