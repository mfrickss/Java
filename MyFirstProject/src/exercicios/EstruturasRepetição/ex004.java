package exercicios.EstruturasRepetição;

import java.util.Scanner;

public class ex004 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //4. Escreva um programa que some os números fornecidos pelo usuário até que o número lido seja igual
        //a zero. Ao final, mostre o resultado da soma.

        int num;
        int soma = 0;
        do{
            System.out.print("Informe um número(PRESSIONE 0 PARA PARAR): ");
            num = scanner.nextInt();

            soma += num;

        }while(num != 0);

        System.out.printf("A soma dos números é: %d", soma);

        scanner.close();
    }
}
