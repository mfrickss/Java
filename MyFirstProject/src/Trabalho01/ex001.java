package Trabalho01;

import java.util.ArrayList;
import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //VETOR DE 10 COM BUBBLESORT E PRINTAR UM Q NÃO REPETE NÚMERO.

        int[] vetor = {3, 5, 1, 7, 1, 5, 3, 9, 2, 8};

//        for (int i = 0; i < 10; i++) {
//            System.out.print("Informe elementos do vetor: ");
//            vetor[i] = scanner.nextInt();
//        }

        System.out.println("Vetor desordenado");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.print("\n");

        System.out.println("Vetor ordenado.");

        boolean troca = false;
        do {
            troca = false;
            for (int i = 0; i < vetor.length - 1; i++) {

                //Trocar valores
                if (vetor[i] > vetor[i + 1]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    troca = true;
                }
            }
        } while (troca == true);

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        ArrayList<Integer> uniqueList = new ArrayList<>();

        for (int i = 0; i < vetor.length; i++) {
            if (!uniqueList.contains(vetor[i])) {
                uniqueList.add(vetor[i]);
            }
        }

        System.out.print("\nVetor ordenado e sem números repetidos.\n");
        for (int num : uniqueList) {
            System.out.print(num + " ");
        }

        scanner.close();

    }
}