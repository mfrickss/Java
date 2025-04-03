package javaBasics;

import java.util.Scanner;

import static java.awt.AWTEventMulticaster.add;

public class varargs {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // varargs = allow a metheod to acept a varying # of arguments
//                   makes methedos more flexible, no need for overload metheods
//                   java will pack the arguments into an array
//                   ... (ellipsis)

//        System.out.println(add(1, 2,  3, 4, 5, 6));
        System.out.println(avarege());
    }
    static double avarege(double... numbers){
        double sum = 0;

        if(numbers.length == 0){
            return 0;
        }

        for(double number : numbers){
            sum += number;
        }
        return sum / numbers.length;
    }
//    static int add(int ... numbers){
//        int sum = 0;
//
//        for(int number : numbers){
//            sum += number;
//        }
//        return sum;
//
//    }
}
