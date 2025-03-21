package exercicios.EstruturasRepetição;

import java.util.Scanner;

public class ex007 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //7. Escreva um programa que mostre o resultado da série: 1/100 + 2/99 + 3/98 + 4/97 + ... + 100/1.

        float comeco = 1;
        float fim = 100;
        float soma = 0;

        for(int i = 1; i <= 100;i++){
            soma = comeco / fim + soma;
            comeco++;
            fim--;
        }
        System.out.printf("Soma: %.2f", soma);

        scanner.close();
    }
}
