package exercícios.EstruturasCondicionais;

import java.util.Scanner;

public class ex004 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //4. Escreva um programa que efetue a leitura de um número inteiro e apresente se esse número é
        //divisível por 2 ou divisível por 7.

        System.out.print("Informe um número: ");
        int num = scanner.nextInt();

        if(num % 2 == 0 || num % 7 == 0){
            System.out.printf("O Número %d é dívisível por 2 ou por 7.", num);
        }
        else{
            System.out.printf("O Número %d não é dívisível por 2 e/ou por 7.", num);
        }

        scanner.close();
    }
}


