package exercicios.EstruturasSequenciais;

import java.util.Scanner;

public class ex006 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //5. Escreva um programa que calcule e mostre o consumo médio e a autonomia que um veículo ainda
        //teria antes de um abastecimento de combustível. Considere que o veículo sempre seja abastecido até
        //encher o tanque e que são fornecidas apenas a capacidade do tanque, a quantidade de litros
        //abastecidos e a quilometragem percorrida desde o último abastecimento.

        float tanque_capacidade;
        float litros_abastecidos;
        float km_percorrido;

        System.out.print("Capacidade do tanque: ");
        tanque_capacidade = scanner.nextFloat();
        System.out.print("Litros abastecidos: ");
        litros_abastecidos = scanner.nextFloat();
        System.out.print("Quilometros percorridos: ");
        km_percorrido = scanner.nextFloat();
        float consumo_medio = km_percorrido / litros_abastecidos;
        float autonomia = (tanque_capacidade - litros_abastecidos) * consumo_medio;
        System.out.printf("Consumo médio: %.1f km/litro", consumo_medio);
        System.out.printf("\nAutonomia: %.1f km", autonomia);

        scanner.close();



    }
}
