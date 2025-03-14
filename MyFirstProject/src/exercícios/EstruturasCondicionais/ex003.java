package exercícios.EstruturasCondicionais;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //3. Escreva um programa que efetue a leitura de um número inteiro e apresente se esse número é
        //divisível por 2 e divisível por 3

        System.out.print("Informe um número: ");
        int num = scanner.nextInt();

        if(num % 2 == 0 && num % 3 == 0){
            System.out.printf("O Número %d é dívisível por 2 e por 3.", num);
        }
        else{
            System.out.printf("O Número %d não é dívisível por 2 e por 3.", num);
        }

        scanner.close();
    }
}
