package javaBasics;

import java.util.Scanner;

public class searchArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1, 9, 2, 8, 3, 5 , 4};
        String[] fruits = {"apple", "orange", "banana"};
        boolean isFound = false;


        System.out.print("Enter a fruit to search for: ");
        String target = scanner.nextLine();

//        String target = "pineaplle";
//        int target = 7;
//        boolean isFound = false;

        for(int i = 0; i < fruits.length; i++){
//            if (target == numbers[i])
              if (fruits[i].equals(target)){
                System.out.printf("Elemente found at index: %d", i);
                isFound = true;
                break;
            }
        }
        if (!isFound){
            System.out.println("Element not found in the array.");
        }
        scanner.close();
    }
}
