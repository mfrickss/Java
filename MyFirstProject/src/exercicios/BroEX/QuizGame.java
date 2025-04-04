package exercicios.BroEX;

import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] questions = {"What is the main function of a router?",
                              "Whitch part of the computer is considered the brain?",
                              "What year was Facebook launched?",
                              "Who is know as the father of computer?",
                              "What was the first programming language?"};

        String[][] options = {{"1. Storing files", "2. Encrypting data", "3. Directing internet traffic", "4. Managing Password"},
                              {"1. CPU", "2. Hard Drive", "3. RAM", "4. GPU"},
                              {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
                              {"1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage"},
                              {"1. COBOL", "2. C", "3. Fortran", "4. Assembly"}};

        int[] answers = {3, 1, 2, 4, 3};
        int score = 0;
        int guess;

        linha();
        System.out.println("Welcome to the JAVA QUIZ GAME!");
        linha();

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);

            for (String option : options[i]){
                System.out.println(option);
            }

            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if(guess == answers[i]){
                linha();
                System.out.println("CORRECT!");
                linha();
                score++;
            }
            else {
                linha();
                System.out.println("INCORRECT!");
                linha();
            }
            }
        if (score > 5){
            System.out.printf("Nice, you got %d points!\n", score);
            linha();
        }
        else if(score == 5){
            System.out.printf("YOU NAILED IT! %d POINTS!\n", score);
            linha();
        }
        else if(score < 3){
            System.out.printf("Damn dude, you sucks! Only %d correct.\n", score);
            linha();
        }
        if (score == 0){
            System.out.printf("%d POINTS? GET BETTER YOU DUMBASS\n", score);
            linha();
        }


        }

        static void linha(){
            System.out.println("==============================");
        }


}
