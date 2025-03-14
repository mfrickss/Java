package javaBasics;

import java.util.Random;

public class random {
    public static void main(String[] args){
        Random random = new Random();

        int number;
        boolean coroa;
        double number2;

        number = random.nextInt(1, 896);
        coroa = random.nextBoolean();
        number2 = random.nextDouble();

        System.out.println(number);
        if(coroa) {
            System.out.println("COROA");
        }
        else{
            System.out.println("CARA");
        }
        System.out.println(number2);
    }
}
