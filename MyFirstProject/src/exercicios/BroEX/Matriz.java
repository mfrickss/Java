package exercicios.BroEX;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int colunas, linhas;
        char simbolo;

        System.out.print("Informe a quantidade de linhas desejada: ");
        linhas = scanner.nextInt();

        System.out.print("Informe a quantidade de colunas desejada: ");
        colunas = scanner.nextInt();

        System.out.print("Informe o símbolo desejado: ");
        simbolo = scanner.next().charAt(0);

        for(int i = 0; i < linhas; i++){
           for(int j = 0; j < colunas; j++){
               System.out.print(simbolo + " ");
           }System.out.println();
        }

        scanner.close();
    }
}
