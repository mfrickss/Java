package exercícios.EstruturasRepetição;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //3. Escreva um programa que mostre todos os números pares existentes entre 1 e um número lido do
        //teclado, bem como a quantidade de números apresentados.

        int quant = 0;
        System.out.print("Informe um número: ");
        int num = scanner.nextInt();

        System.out.printf("Números pares de 1 até %d\n", num);
        for(int i = 1; i <= num; i++){
            if(i % 2 == 0){
                System.out.println(i);
                quant++;
            }
        }
        System.out.printf("A quantidade de números pares entre 1 e %d é: %d\n", num, quant);

        scanner.close();
    }
}
