package exercícios.Funções;

import java.util.Scanner;

public class ex002 {

    public static void salario(String nome, int nivel, int horas) {

        float salario = 0;

        if(nivel == 1){
            salario = horas * 20;
        }
        else if(nivel == 2){
            salario = horas * 25;
        }
        else if(nivel == 3){
            salario = horas * 30;
        }

        System.out.printf("Professor: %s\nNível: %d\nSeu sálario com base nas %d horas de aula será: R$%.2f", nome, nivel, horas, salario);

    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Professor, informe seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Informe seu nível(1, 2 ou 3): ");
        int nivel =  scanner.nextInt();

        if(nivel > 3 || nivel < 1){
            System.out.print("ERRO! Informe um nível válido!(1|2|3): ");
            nivel = scanner.nextInt();
        }

        System.out.print("Informe horas de aula: ");
        int horas = scanner.nextInt();

        salario(nome, nivel, horas);

        scanner.close();
    }
}



