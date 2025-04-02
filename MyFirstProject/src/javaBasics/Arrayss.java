package javaBasics;
import java.util.Arrays;

public class Arrayss {
    public static void main(String[] args){

        String[] fruits = {"apple", "orange", "banana", "coconut"};

//        fruits[1] = "pineaplle";
//        int numOfFruits = fruits.length;

//        System.out.println(numOfFruits);

//        for (int i = 0; i < fruits.length; i++){
//            System.out.print(fruits[i] + " ");
//        }
            Arrays.sort(fruits);
            Arrays.fill(fruits, "pineapple");

        for(String fruit : fruits){  //-> foreach loop
            System.out.println(fruit);
        }
    }
}
