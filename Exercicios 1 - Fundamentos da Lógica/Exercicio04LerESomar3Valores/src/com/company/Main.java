package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // FAÇA UM PROGRAMA QUE LEIA 3 VALORES E MOSTRE O RESULTADO DA SOMA DELES
        Scanner leitor = new Scanner(System.in);
        int a, b, c;
        System.out.print("Digite o valor para a:");
        a = leitor.nextInt();
        leitor.nextLine();
        System.out.print("Digite o valor para b:");
        b = leitor.nextInt();
        leitor.nextLine();
        System.out.print("Digite o valor para c:");
        c = leitor.nextInt();
        leitor.nextLine();
        System.out.println("Resultado da soma:" + (a+b+c));
    }
}
