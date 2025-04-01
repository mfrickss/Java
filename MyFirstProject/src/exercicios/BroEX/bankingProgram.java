package exercicios.BroEX;

import java.util.Scanner;

public class bankingProgram {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice = 0;
        double balance = 0;

        linha();
        System.out.println("BANKING PROGRAM");
        linha();


        while (choice != 4) {
            System.out.println("1. Show balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            linha();
            System.out.print("Enter your choice(1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showBalance(balance);
                    break;
                case 2:
                    balance = (deposit(balance));  //BRO MODE = balance += deposit();
                    break;
                case 3:
                    balance = (withdraw(balance));
                    break;
                case 4:
                    System.out.println("Thank you for using our bank! Have a nice day.");
                    break;
                default:
                    linha();
                    System.out.println("INVALID CHOICE");
                    linha();
            }
        }


    }

    static void linha() {
        System.out.println("***************");
    }

    static void showBalance(double balance) {
        linha();
        System.out.printf("Your balance is: $%.2f\n", balance);
        linha();
    }


    static double depositBRO() {

        double amount;
        System.out.print("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        } else {
            return amount;
        }
    }

    static double deposit(double balance) {
        linha();
        System.out.print("Enter the amount to be deposited: ");
        double deposit = scanner.nextDouble();
        if (deposit > 0) {
            balance += deposit;
            System.out.printf("Your balance is now: $%.2f\n", balance);
            linha();
        } else {
            linha();
            System.out.println("ERROR! Enter a valid value!");
            linha();
        }
        return balance;
    }

    static double withdraw(double balance) {
        linha();
        System.out.print("Enter the amount to be withdrawn: ");
        double withdraw = scanner.nextDouble();

        if (withdraw > 0 && balance >= withdraw) {
            balance -= withdraw;
            System.out.printf("Your balance is now: $%.2f\n", balance);
            linha();
        } else if(withdraw < 0){
            System.out.println("AMOUNT CAN'T BE NEGATIVE!");
        }else {
            linha();
            System.out.println("ERROR! You don't have enough balance.");
            linha();
        }
        return balance;

    }
}
