package exercícios.EstruturasCondicionais;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //2. Escreva um programa que leia três números inteiros e apresente na tela o menor valor.

        System.out.print("Informe um número: ");
        int n1 = scanner.nextInt();

        int menor = n1;

        System.out.print("Informe um número: ");
        int n2 = scanner.nextInt();

        if(n2 < menor){
            menor = n2;
        }

        System.out.print("Informe um número: ");
        int n3 = scanner.nextInt();

        if(n3 < menor){
           menor = n3;
        }

        System.out.printf("Menor valor: %d", menor);

        scanner.close();
    }
}

