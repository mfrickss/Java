package javaBasics;

import java.util.Scanner;

public class enhancedSwitch {
    public static void main(String[] args){
        //Enhanced switch = A replacement to many else if statements(JAVA 14 feature)

        Scanner scanner = new Scanner(System.in);


        System.out.print("Inform a day of the week: ");
        String day = scanner.nextLine();

//        switch(day){
//            case "Monday" -> System.out.println("It is a weekday..");
//            case "Tuesday" -> System.out.println("It is a weekday");
//            case "Wednesday" -> System.out.println("It is a weekday");
//            case "Thursday" -> System.out.println("It is a weekday");
//            case "Friday" -> System.out.println("It is a weekday");
//            case "Saturday" -> System.out.println("It is the weekend");
//            case "Sunday" -> System.out.println("It is the weekend");
//            default -> System.out.println(day + " is not a day.");


        switch (day){
            case "Monday", "Tuesday", "Wednesday", "Thursday" -> System.out.println("It is a weekday..");
            case "Friday" -> System.out.println("SEXTOU PORRA, BORA BEBER!");
            case "Saturday", "Sunday" -> System.out.println("It is the weekend!");
            default -> System.out.println(day + " is not a day.");
        }
    }
}
