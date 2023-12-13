package com.company;

public class Main {

    public static void main(String[] args) {
        int i = 10;

        while(i > -1){

            //Imprime i e pula uma linha
            System.out.println(i);

            //Diminui em 1 o valor do i atual
            i = i - 1;

            //Quando chega aqui, o código volta para
            //a linha 8 e verifica se a condição
            //i > -1 continua verdadeira, para
            //executar o laço novamente ou sair
        }
    }
}

