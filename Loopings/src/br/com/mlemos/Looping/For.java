package br.com.mlemos.Looping;

import java.util.ArrayList;
import java.util.List;

public class For {

    public static void main(String[] args) {
        List<Integer> valores = new ArrayList<>();

        //Usando contador sabendo a qtd de registros
        for (int i =0; i <= 10; i++) {
            System.out.println("linha " + i);
        }

        //Usando coleções e não sabe a quantidade de registros
        for (Integer i : valores) {
            System.out.println("linha " + i);
        }

        //Usando coleção de lambda
        valores.forEach(i-> System.out.println("linha " + i));
    }
}