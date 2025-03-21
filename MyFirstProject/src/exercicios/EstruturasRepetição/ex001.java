package exercicios.EstruturasRepetição;

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //1. Escreva um programa que mostre os números de 1 até 10, um número por linha.

        for(int i = 0; i <= 10; i++){
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
