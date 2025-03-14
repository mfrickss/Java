package exercícios.Vetores;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //3. Escreva um programa alimente um vetor de 5 números inteiros distintos. Em seguida, leia um
        //número qualquer do teclado e mostre na tela o índice em que ele se encontra no vetor, ou então
        //a mensagem "Elemento não encontrado!", se ele não estiver presente no vetor.


        int[] vetor = new int[5];
        boolean encontrado = false;
        for(int i = 0; i < 5; i++){
            System.out.printf("Informe o número do índice[%d]: ", i);
            vetor[i] = scanner.nextInt();
        }

        System.out.print("Informe número para achar no vetor: ");

        int num = scanner.nextInt();
        for(int i = 0; i < 5; i++){
            if(num == vetor[i]){
                System.out.printf("Elemento encontrado no ìndice: [%d]", i);
                encontrado = true;
                break;
            }
        }
        if(encontrado == false){
            System.out.println("Elemento não encontrado!");
        }
        scanner.close();
    }
}
