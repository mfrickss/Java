package exercícios.EstruturasSequenciais;
import java.util.Scanner;

public class ex003 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // 2. Escreva um programa que leia um número inteiro e apresente o seu antecessor e o seu sucessor.

        int sucessor;
        int antecessor;
        int num;

        System.out.print("Informe um número: ");
        num = scanner.nextInt();

        sucessor = num + 1;
        antecessor = num - 1;

        System.out.println("Você escolheu o número: " + num + ".\nSeu antecessor é: " + antecessor + ".\nSeu sucessor é: " + sucessor + "." );

        scanner.close();

    }
}
