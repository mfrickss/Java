package exercicios.EstruturasCondicionais;

import java.util.Scanner;

public class ex005 {
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);
        //5. Em uma certa papelaria, até 100 folhas, a cópia do xerox custa R$ 0,25 e, acima de 100 folhas, cada
        //cópia adicional custa R$ 0,20. Escreva um programa que dado o número total de cópias, informe o
        //valor a ser pago.

        System.out.print("Informe quantas folhas para impressão: ");
        int copias = scanner.nextInt();

        if(copias <= 100){
            System.out.print("O valor à pagar é de: R$" + (copias * 0.25));
        }
        else{
            System.out.print("O valor à pagar é de: R$" + ((copias - 100) * 0.2 + 25));
        }
        scanner.close();
    }
}
