package exercicios.Matrizes;

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //1. Escreva um programa que alimente uma matriz de 2 x 3 elementos inteiros e, utilizando
        //estruturas de repetição, apresente na tela a soma de todos os elementos da matriz

        int[][] matriz = new int[2][3];
        int i, j, soma;

        for(i = 0; i < 2; i++){
            for(j = 0; j < 3; j++){
                System.out.printf("Informe elemento [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }
        for(i = 0; i < 2; i++){
            for(j = 0; j < 3; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.print("\n");
        }
        soma = 0;

        for(i = 0; i < 2; i++){
            for(j = 0; j < 3; j++){
                soma += matriz[i][j];
            }
        }
        System.out.printf("A soma da matriz é: %d", soma);

        scanner.close();
    }
}
