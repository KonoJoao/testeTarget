package com.target;

public class Main {
    public static void main(String[] args){
        int indice = 13;
        int soma = 0;
        int k = 0;

        while(k<indice){
            k += 1;
            soma += k;
        }

        /**
         * Ao final do processamento a soma tem valor = 91
         */

        System.out.println(soma);

    }
}