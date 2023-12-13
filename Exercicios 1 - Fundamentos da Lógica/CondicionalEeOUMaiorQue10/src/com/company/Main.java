package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // FAÇA UM PROGRAMA QUE
        // X-1-LEIA 2 NÚMEROS INTEIROS
        // X-2-IMPRIMA NA TELA (um oi) SE OS 2 SÃO MAIORES QUE 10
        // 3-OU SE PELO MENOS UM NÃO É MAIOR QUE 10
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        //                        V
        //           V            ||           F
        //     (V    &&    V)     ||    (F    ||    F)
        //  (20 > 10 && 20 > 10)  ||   (20 < 10 || 20 < 10)
        if ((a > 10 && b > 10) || (a < 10 || b < 10)) {
            System.out.println("oi");
        }
    }
}
