package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Cria um arraylist sem informar tamanho, pois ele se adapta
        ArrayList<Integer> listaDeNumeros = new ArrayList<>();

        //Adiciona um valor
        listaDeNumeros.add(15);

        //Adicionar um valor que foi digitado pelo usuário
        System.out.println("Digite um número inteiro:");
        Scanner leitor = new Scanner(System.in);
        listaDeNumeros.add(leitor.nextInt());

        //Pegar um valor de uma posição no arraylist e imprimir na tela
        System.out.println(listaDeNumeros.get(0));

        //Como saber o tamanho atual de um arraylist
        listaDeNumeros.size();

        //Como percorrer um arraylist
        for (int i = 0; i < listaDeNumeros.size(); i++) {
            System.out.println(listaDeNumeros.get(i));
        }

        //Esvaziando
        listaDeNumeros.clear();
    }
}
