package exercicios.Matrizes;

import java.util.Scanner;


public class ex003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //3. Escreva um programa que leia uma matriz de 5 x 5 elementos e, utilizando estruturas de
        //repetição, apresente na tela o menor valor da matriz, o maior valor da matriz, a soma dos valores
        //da matriz e a média dos valores da matriz;

        int[][] matriz = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15},
                         {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        int i, j;

        int menor = matriz[0][0];
        int maior = matriz[0][0];
        int soma = 0;

        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                if(matriz[i][j] > maior){
                    maior = matriz[i][j];
                }
                if(matriz[i][j] < menor){
                    menor = matriz[i][j];
                }
                soma += matriz[i][j];
            }
        }

        float media = soma / 25.0f;

        System.out.printf("O maior número da matriz é: %d\nO menor número da matriz é: %d\n", maior, menor);
        System.out.printf("A soma dos valores é: %d\nA média é: %.2f", soma, media);

        scanner.close();

    }
}
