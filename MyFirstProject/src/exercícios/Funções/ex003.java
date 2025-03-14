package exercícios.Funções;

import java.util.Scanner;

public class ex003 {

    public static void pagarEnergia(float kwConsumido, int pagador){

        double valorPago = 0;

        if(pagador == 1){
           valorPago = kwConsumido * 0.6;
        }
        if(pagador == 2){
           valorPago = kwConsumido * 0.48;
        }
        if(pagador == 3){
           valorPago = kwConsumido * 1.29;
        }

        System.out.printf("O valor da sua conta de energia é: R$%.2f", valorPago);

    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //3 - Escreva um método que calcule e retorne o valor da conta de energia a ser paga de acordo com a quantidade de kW consumidos, sendo que o valor do kW é 0,60 (pessoa física), 0,48 (comércio) e 1,29 (indústria).


        System.out.print("Informe a quantidade de KW consumidos: ");
        float kwConsumido = scanner.nextFloat();

        System.out.print("Informe se você é: (1 - Pessoa física)|(2 - Comércio)|(3 - Industria): ");
        int pagador = scanner.nextInt();

        pagarEnergia(kwConsumido, pagador);

        scanner.close();
    }
}
