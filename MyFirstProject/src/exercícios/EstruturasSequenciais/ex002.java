package exercícios.EstruturasSequenciais;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // 1. Escreva um programa que leia horas, minutos e segundos do teclado e apresente o tempo total em
        //segundos.



        System.out.print("Informe a quantidade de horas: ");
        int horas = scanner.nextInt();
        System.out.print("Informe a quantidade de minutos: ");
        int minutos = scanner.nextInt();
        System.out.print("Informe a quantidade de segundos: ");
        int segundos = scanner.nextInt();

        int soma = (horas * 3600) + (minutos * 60) + segundos;

        System.out.println("O tempo total em segundos é de: " + soma);

        scanner.close();
    }

}
