package com.company;

public class Main {

    static void imprimeBomDia(){
        System.out.println("Bom dia!");
    }

    public void imprimeOi(){
        System.out.println("oi");
    }

    public static void main(String[] args) {
        //FAÇA UM PROGRAMA QUE IMPRIMA “BOM DIA”
        //10 VEZES NA TELA
        //USANDO UMA FUNÇÃO.
        for(int i = 0; i < 10; i++){
            imprimeBomDia();
        }

        Main main = new Main();
        main.imprimeOi();

    }
}
