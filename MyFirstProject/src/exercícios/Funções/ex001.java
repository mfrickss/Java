package exercícios.Funções;

import java.util.Scanner;

public class ex001 {

    public static void media(String nome, float n1, float n2, float n3) {

        float media = (n1 + n2 + n3) / 3;

        if (media > 6) {
            System.out.printf("Olá %s, suas notas %.2f|%.2f|%.2f te deram a média: %.2f.\nVocê foi aprovado!", nome, n1, n2, n3, media);
            System.exit(0);
        }
        System.out.printf("Olá %s, suas notas %.2f|%.2f|%.2f te deram a média: %.2f.\nVocê foi reprovado seu viadinho!", nome, n1, n2, n3, media);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Escreva um método que receba o nome e as 3 notas de um aluno e mostre o nome do aluno e a sua média aritmética.

        System.out.print("Informe seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Informe nota 1: ");
        float n1 = scanner.nextFloat();

        System.out.print("Informe nota 2: ");
        float n2 = scanner.nextFloat();

        System.out.print("Informe nota 3: ");
        float n3 = scanner.nextFloat();

        media(nome, n1, n2, n3);

        scanner.close();
    }
}

