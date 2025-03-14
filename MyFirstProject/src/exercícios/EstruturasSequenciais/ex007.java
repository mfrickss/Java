package exercícios.EstruturasSequenciais;

import java.util.Scanner;

public class ex007 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //6. Escreva um programa que solicite do usuário o valor de um saque em caixa eletrônico, sendo que
        //estarão disponíveis cédulas de 5, 10, 20, 50 e 100. O programa deve apresentar a menor quantidade
        //de cédulas possível de acordo com o saque. Exemplos:
        //400,00: 4 cédulas de 100, 0 cédulas de 50, 0 cédulas de 20, 0 cédulas de 10 e 0 cédulas de 5.
        //350,00: 3 cédulas de 100, 1 cédulas de 50, 0 cédulas de 20, 0 cédulas de 10 e 0 cédulas de 5.
        System.out.print("Informe o valor do saque: ");
        int valor_saque = scanner.nextInt();
        System.out.printf("\nCédulas de 100: %d", valor_saque / 100);
        valor_saque %= 100;
        System.out.printf("\nCédulas de 50: %d", valor_saque / 50);
        valor_saque %= 50;
        System.out.printf("\nCédulas de 20: %d", valor_saque / 20);
        valor_saque %= 20;
        System.out.printf("\nCédulas de 10: %d", valor_saque / 10);
        valor_saque %= 10;
        System.out.printf("\nCédulas de 5: %d", valor_saque / 5);
        valor_saque %= 5;

        scanner.close();
    }
}
