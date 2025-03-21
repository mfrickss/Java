package exercicios.EstruturasRepetição;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //2. Escreva um programa que mostre na tela a soma obtida dos 100 primeiros números inteiros (1 + 2 + 3
        //+ 4 + 5 + ... + 100).

        int soma = 0;
        for(int i = 1; i <= 100; i++){
            soma += i;
        }
        System.out.printf("A soma é: %d", soma);

        scanner.close();
    }
}
