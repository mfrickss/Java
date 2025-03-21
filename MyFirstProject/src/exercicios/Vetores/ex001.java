package exercicios.Vetores;

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //1. Escreva um programa que alimente um vetor com 5 números inteiros e apresente na tela o vetor
        //em ordem inversa.

        int[] vetor = new int[5];


        for(int i = 0; i < 5; i++){
            System.out.print("Informe número: ");
            vetor[i] = scanner.nextInt();
        }

        for(int i = 4; i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }
        scanner.close();
    }
}
