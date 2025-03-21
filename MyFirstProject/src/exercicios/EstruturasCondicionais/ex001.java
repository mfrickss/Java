package exercicios.EstruturasCondicionais;

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //1. Escreva um programa que leia dois números inteiros e os apresente em ordem crescente.

        System.out.print("Informe um número: ");
        int n1 = scanner.nextInt();
        System.out.print("Informe um número: ");
        int n2 = scanner.nextInt();

        if(n1 > n2){
            System.out.printf("Maior: %d\nMenor: %d", n1, n2);
        }
        else{
            System.out.printf("Maior: %d\nMenor: %d", n2, n1);
        }
        scanner.close();
    }
}
