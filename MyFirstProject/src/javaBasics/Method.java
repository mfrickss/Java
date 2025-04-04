package javaBasics;

import javax.swing.*;
import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = "Ricks";
        int idade = 21;
        int age = 12;


//        happyBirthday(nome, idade);
//        happyBirthday(nome, idade);
//        happyBirthday(nome, idade);
//        happyBirthday(nome, idade);

//        double result = square(3);
//        System.out.println(result);
        System.out.println(cube(3));

        String fullName = getFullName("Ricks", "MF");
        System.out.println(fullName);


        if (ageCheck(age)) {
            System.out.println("You may sign up!");
        } else {
            System.out.println("You must be 18+ to sign up!");
        }

    }

    static void happyBirthday(String nome, int idade) {
        System.out.println("Happy birthday to you!");
        System.out.printf("Happy birthday dear %s!\n", nome);
        System.out.printf("You are %d years old!\n", idade);
        System.out.println("Happy birthday to you...!\n");
    }

    static double square(double number) {
        return number * number;
    }

    static double cube(double number) {
        return number * number * number;
    }

    static String getFullName(String first, String last) {
        return first + " " + last;
    }

    static boolean ageCheck(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
        //return age >= 18 |-> Simplify mode
    }
}
