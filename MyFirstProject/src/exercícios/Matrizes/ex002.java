package exercícios.Matrizes;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //2. Escreva um programa que leia uma matriz de 5 x 5 elementos e, utilizando estruturas de
        //repetição, apresente na tela a soma de todos os elementos da terceira linha da matriz:
        //. . . . .
        //. . . . .
        //x x x x x
        //. . . . .
        //. . . . .

        int[][] matriz = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15},
                {15, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        int i, j;

        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.print("\n");
        }
        int soma = 0;

        for (i = 0; i < 5; i++) {
            soma += matriz[2][i];
        }
        System.out.printf("A soma é: %d", soma);

        scanner.close();
    }
}

