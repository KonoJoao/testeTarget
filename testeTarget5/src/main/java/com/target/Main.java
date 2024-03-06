package com.target;

public class Main {
    public static void main(String[] args) {
        System.out.println(inverterString("Hello world!"));
    }

    private static String inverterString(String stringEntrada){
        String stringSaida = "";
        int tamanhoString = stringEntrada.length();
        int count;
        for(count=tamanhoString-1;count>=0;count--){
            stringSaida += stringEntrada.charAt(count);
        }

        return stringSaida;
    }
}