package javaBasics;

public class ternaryOperator {
    public static void main(String[] args){
        // ternary operator ? = return 1 of 2 values if a condition is true

        // variable = (condition) ? iftrue : ifFalse;

        int score = 70;

//        if(score>=60){
//            System.out.println("PASS!");
//        }                                                 //JEITO PADRÃO DE FAZER
//        else{
//            System.out.println("FAIL!");
//        }

        //TERNARY OPERATOR

//        String passOrFail = (score >= 60) ? "PASS" : "FAIL";


//        int number = 2;
//
//        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";


//        int hours = 9;
//
//        String timeofDay = (hours < 12) ? "A.M." : "P.M.";

        int income = 60000;

        double taxeRate = (income >= 40000) ? 0.25 : 0.15;

        System.out.println(taxeRate);
    }
}
