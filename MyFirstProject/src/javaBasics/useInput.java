package javaBasics;

import java.util.Scanner;

public class useInput {
    public static void main(String[] args){

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine(); // sem o "Line" ele lê somente o que estiver antes do espaço.
//
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//
//        System.out.print("What is your GPA: ");
//        double gpa = scanner.nextDouble();
//
//        System.out.print("Are you a student? (true/false): ");
//        boolean isStudent = scanner.nextBoolean();
//
//        System.out.println("Hello " + name);
//        System.out.println("Your are " + age + " years old!");
//        System.out.println("Your GPA is: " + gpa);
////        System.out.println("Student: " + isStudent);
//
//        if(isStudent){
//            System.out.println("You are enrolled as a student");
//        }
//        else{
//            System.out.println("You are NOT enrolled");
//        }

        // PROBLEMA COMUM

//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//        scanner.nextLine(); // ISSO TA AQUI PARA NÃO BUGAR E FICA EM CIMA DO PROXIMO INPUT QUE É UMA STRING!
//
//        System.out.print("Enter your favorite color: ");
//        String color = scanner.nextLine();
//
//        System.out.println("You are " + age + "years old!");
//        System.out.println("You like de color: " + color);

        // Calcular a area de um retângulo!

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter de width: ");
        width = scanner.nextDouble();

        System.out.print("Enter de heigth: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The area is: " + area + "cm²");

        scanner.close();

    }
}
