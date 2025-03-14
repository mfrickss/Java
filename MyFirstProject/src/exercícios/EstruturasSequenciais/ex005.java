package exercícios.EstruturasSequenciais;

import java.util.Scanner;

public class ex005 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //4. Escreva um programa que pergunte ao usuário a quantidade de km percorridos por um carro alugado
        //e a quantidade de dias pelos quais ele foi alugado. Calcule e mostre o valor a pagar, sabendo que o
        //carro custa R$ 70,00 por dia e R$ 0,15 por km rodado

        double km_perc;
        int dias_alu;
        double valor_pago;

        System.out.print("Informe a quantidade de km percorridos: ");
        km_perc = scanner.nextInt();
        System.out.print("Por quantos dias o carro ficou alugado?");
        dias_alu = scanner.nextInt();

        valor_pago = km_perc * 0.15 + dias_alu * 70;

        System.out.print("O valor pago será de: " + valor_pago);

        scanner.close();
    }
}
