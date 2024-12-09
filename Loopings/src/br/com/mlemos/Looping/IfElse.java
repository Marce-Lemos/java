package br.com.mlemos.Looping;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        //if-else
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = s.nextInt();

        String idad = getIdade(idade);
        System.out.println(idad);
    }

    public static String getIdade (int idade) {
        if (idade >= 0 && idade <= 5) {
            return "Você é uma bebe";
        } else if (idade > 5 && idade <= 10 ) {
            return "Você é uma criança";
        } else if (idade > 10 && idade < 18) {
            return "Você é um adolescente";
        } else {
            return "Você é um adulto";
        }
    }
}