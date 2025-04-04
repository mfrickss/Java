package exercicios.BroEX;

import java.util.Random;
import java.util.Scanner;

public class JoKenPo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] options = {"rock", "paper", "scissors"};
        String userChoice;
        String computerChoice;
        String playAgain = "yes";


        do {
            System.out.print("Enter your move (rock, paper, scissors): ");
            userChoice = scanner.nextLine().toLowerCase();

            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Enter a valid choice.");
                continue; // Se o user digitar algo invalido o codigo "continua"

            }


            computerChoice = options[random.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);

            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if (userChoice.equals("rock") && computerChoice.equals("scissors") ||
                    userChoice.equals("scissors") && computerChoice.equals("paper") ||
                    userChoice.equals("paper") && computerChoice.equals("rock")) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            System.out.println("Play again?(yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();

        } while (playAgain.equals("yes"));

        System.out.print("GG! Thanks for playing.");


        scanner.close();


    }
}
