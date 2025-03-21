package exercicios.BroEX;

import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double principal, rate, amount;
        int timesCompounded, years;

        System.out.print("Enter the principal amount: $");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate(in %): ");
        rate = scanner.nextDouble() / 100; //DIVIDINDO POR 100 PARA SER LIDO EM %.

        System.out.print("Enter the number of times coumpounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the number of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.printf("The amount after %d years is: $%.2f", years, amount);

        scanner.close();

    }
}
