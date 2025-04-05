package exercicios.BroEX;

import java.util.Random;
import java.util.Scanner;

public class Tigrinho {

    static Random random = new Random();

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        String[] row = {};
        double balance = 100, bet, payout;

        linha();
        System.out.println("  WELCOME TO JAVA TIGRINHO!  ");
        System.out.println("      🦍 🦊 🐯 🐼 🦝  ");
        linha();

        while(balance > 0) {
            System.out.println("Current balance: $" + balance);

            System.out.print("Place your bet amount: ");
            bet = scanner.nextDouble();

            if (bet > balance){
                linha();
                System.out.println("INSUFFICIENTE FUNDS");
                linha();
                continue; // volta pro começo
            }
            else if(bet <= 0){
                linha();
                System.out.println("BET MUST BE GREATER THAN ZERO");
                linha();
                continue;
            }
            else{
                balance -= bet;
            }
            System.out.println("Spinning...");
            spinRow();




        }
    }
    static void linha(){
        System.out.println("===========================");
    }
    static String[] spinRow() {

        String[] symbols = {"🦍", "🦊", "🐯", "🐼", "🦝"};
        String[] row = new String[3];

        for (int i = 0; i < row.length; i++) {
            System.out.print(symbols[random.nextInt(0, 5)]);



        }
        return new String[0];
    }
}
