package javaBasics;

import java.util.Scanner;

public class ArraysInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] foods;

        System.out.print("Quantas comidinhas você quer? rsrs: ");
        int size = scanner.nextInt();
        scanner.nextLine(); //cleaning the scanner

        foods = new String[size];

//        foods[0] = "pizza";
//        foods[1] = "taco";
//        foods[2] = "hamburger";
//
//        for(String food : foods){
//            System.out.println(food);
//        }

        for(int i = 0; i < foods.length; i++){
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        for(String food : foods){
            System.out.println(food);
        }

        scanner.close();
    }
}
