package com.company;

public class Main {

    static String saudacao = "Bom dia";

    //Quando crio funções que serão chamadas na main
    //Preciso que elas também sejam static
    //Pois a main em si não é um OBJETO
    public static void imprimeSaudacao(){
        //Imprime a mensagem de acordo com o momento
        System.out.println(saudacao);
    }

    public static void main(String[] args){
        imprimeSaudacao();
        //Muda a mensagem
        saudacao = "Boa noite";
        imprimeSaudacao();
    }
}
