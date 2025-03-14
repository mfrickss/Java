package exercícios.EstruturasRepetição;

import java.util.Scanner;

public class ex006 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //6. Escreva um programa que escreva os 10 primeiros números da sequência de Fibonacci (1, 1, 2, 3, 5, 8,
        //13, 21, 34, 55)

        int ant = 1;
        int atual = 1;
        int aux = 0;

        System.out.println("1\n1");
        for(int i = 3; i <= 10; i++){
            atual = atual + ant;
            ant = atual - ant;

            System.out.println(atual + " ");
        }
    }
}
