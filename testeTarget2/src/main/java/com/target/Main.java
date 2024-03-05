package com.target;

public class Main {
    public static void main(String[] args) {
        System.out.println(fibonacci(6765));
    }

    private static String fibonacci(Integer numero){
        int numeroAnterior = 0;
        int numeroAtual = 1;
        int count = 0;
        int aux;

        while(count < numero){
            aux = numeroAtual;
            numeroAtual += numeroAnterior;
            numeroAnterior = aux;
            if(numeroAnterior==numero){
                return numero + " pertence à sequência";
            }
            count++;
        }
        return numero + " não pertence à sequência";
    }
}