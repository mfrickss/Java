package exercicios.Vetores;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //2. 2. Escreva um programa que alimente um vetor com 5 números e calcule a média destes valores. Na
        //sequência, apresente na tela os valores que são iguais ou superiores à média.

        int[] vetor = new int[5];
        int soma = 0;

        for(int i = 0; i < 5; i++){
            System.out.printf("Informe o número do indice[%d]: ", i);
            vetor[i] = scanner.nextInt();
            soma += vetor[i];
        }
         float media = soma / 5;

        System.out.printf("\nA média é %.1f\n", media);

        System.out.println("Valores superiores à média:");
        for(int i = 0; i < 5; i++){
            if(vetor[i] > media){
                System.out.println(vetor[i]);
            }
        }
        scanner.close();
    }
}
