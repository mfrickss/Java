package exercicios.EstruturasCondicionais;

import java.util.Scanner;

public class ex006 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //6. Escreva um programa que converta números inteiros, de sua representação numérica para
        //representação em extenso. O programa deverá solicitar ao usuário um número inteiro (de 0 a 9) e
        //mostrar na tela o valor em extenso. Por exemplo, se o usuário digitar "7", o programa deverá mostrar
        //"Sete". Se o usuário digitar um valor fora da faixa prevista (de 0 a 9), o programa deverá mostrar
        //"Valor inválido!".

        System.out.print("Informe um número de 0 à 9: ");
        int num = scanner.nextInt();

        switch(num){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("Um");
                break;
            case 2:
                System.out.println("Dois");
                break;
            case 3:
                System.out.println("Três");
                break;
            case 4:
                System.out.println("Quatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            case 6:
                System.out.println("Seis");
                break;
            case 7:
                System.out.println("Sete");
                break;
            case 8:
                System.out.println("Oito");
               break;
            case 9:
                System.out.println("Nove");
                break;
            default:
                System.out.println("Número inválido. Tente novamente!(0-9)");
        }
        scanner.close();
    }
}
