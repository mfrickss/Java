package exercicios.BroEX;

import java.util.Scanner;

public class KGtoLB {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double peso, pesoConvertido;
        int escolha;

        System.out.println("--Programa conversor de peso--");
        System.out.println("1 - Converter lbs para kgs");
        System.out.println("2 - Converter kgs para lbs");

        System.out.print("Escolha sua opção: ");
        escolha = scanner.nextInt();

        if(escolha == 1){
            System.out.print("Informe o peso à ser convertido: ");
            peso = scanner.nextDouble();
            pesoConvertido = peso * 0.453592;
            System.out.printf("%.2f Lbs em Kgs é: %.2f", peso, pesoConvertido);
        }
        else if(escolha == 2){
            System.out.print("Informe o peso à ser convertido: ");
            peso = scanner.nextDouble();
            pesoConvertido = peso * 2.205;
            System.out.printf("%.2f Kgs em Lbs é: %.2f", peso, pesoConvertido);
        }
        else{
            System.out.println("Opção inválida. Tente de novo!");
        }

        scanner.close();
    }
}
