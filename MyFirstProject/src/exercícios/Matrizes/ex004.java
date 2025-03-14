package exercícios.Matrizes;

import java.util.Scanner;

public class ex004 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}};
        int [] vet = {0, 0, 0, 0, 0, 0, 0, 0};

        for(int i = 0; i < 3; i++){
            vet[0] += matriz[0][i];
            vet[1] += matriz[1][i];
            vet[2] += matriz[2][i];
            vet[3] += matriz[i][0];
            vet[4] += matriz[i][1];
            vet[5] += matriz[i][2];
            vet[6] += matriz[i][i];
            vet[7] += matriz[i][2 - i];
        }

        for(int i = 0; i < 8; i++){
            if(vet[i] != vet[0]){
                System.out.println("A matriz não é um quadrado mágico!");
                System.exit(0);
            }
        }
        System.out.println("A matriz é um quadrado mágico");

        scanner.close();
    }
}
