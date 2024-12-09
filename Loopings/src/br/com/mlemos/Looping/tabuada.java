package br.com.mlemos.Looping;

import java.util.Scanner;

public class tabuada {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite qual br.com.mlemos.Looping.tabuada deseja saber: ");
        int num = s.nextInt();

        for (int i=0; i<=10; i++) {
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }

}
