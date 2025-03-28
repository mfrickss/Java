package exercicios.BroEX;

import java.util.Scanner;
import java.util.Random;

public class numberGuessing {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int num, attempts = 0, guess;

        num = random.nextInt(1, 1001);


        System.out.println("--- BEM VINDO AO JOGO DE ADIVINHAÇÃO! ---\n--- ADIVINHE O NÚMERO ENTRE 1 E 1000 ---");


        do{
            System.out.println("FAÇA A SUA ESCOLHA!");
            guess = scanner.nextInt();

            if(guess > num){
                System.out.println("MUITO ALTO! TENTE NOVAMENTE!");
            }
            else if(guess < num){
                System.out.println("MUITO BAIXO! TENTE NOVAMENTE!");
            }
            else{
                System.out.println("PARABÉNS, VOCÊ ACERTOU!");
            }
        } while(guess != num);


    }
}
