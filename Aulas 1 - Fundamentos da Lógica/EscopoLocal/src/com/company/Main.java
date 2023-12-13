package com.company;

public class Main {

    //Quando crio funções que serão chamadas na main
    //Preciso que elas também sejam static
    //Pois a main em si não é um OBJETO
    //Retorna nada
    public static void imprimeSaudacao(){
        //Imprime a mensagem de acordo com o momento
        //System.out.println("olá" + nome);
    }

    public static void main(String[] args){
        String nome = "João";
        imprimeSaudacao();
    }
}
