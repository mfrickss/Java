package javaBasics;

public class variable {
    public static void main(String[] args) {

        // INT
        int age = 21;
        int year = 2025;
        int quant = 1;

//        System.out.println(age);
//        System.out.println("The year is " + year);
//        System.out.println("I've studied " + quant);

        //DOUBLE - FLOAT
        double price = 19999.99;
        double gpa = 3.5;
        double temp = -12.5;

//        System.out.println("$" + price);

        //CHAR - ASPAS SIMPLES!
        char grade = 'A';
        char symbol = '!';
        char currency = '$';

//        System.out.println(grade);

        //BOOLEAN
        boolean isStudent = false;
        boolean forSale = true;
        boolean isOnline = true;

//        if(isStudent){
//            System.out.println("You're a student!");
//        }
//        else{
//            System.out.println("You're NOT a student");
//        }


        //STRING
        String name = "Ricks CODE"; //TEM Q SER COM 'S' MAIÚSCULO.
        String food = "Pizza";
        String email = "ricks11@gmail.com";
        String car = "Lancer EVO";
        String color = "Red";

//        System.out.println("Your favorite food is " + food);
//        System.out.println("Hello, my name is " + name);
//        System.out.println("Your email is: " + email);
//        System.out.println("The SICKEST car is " + car);
//        System.out.println("A pretty cool color is " + color);

//        System.out.println("Hello " + name);
//        System.out.println("You are " + age + " years old");
//        System.out.println("Your gpa is: " + gpa);
//        System.out.println("Your avarage letter grade is: " + grade);

           System.out.println("Your choice is a " + color + " " + year + " " + car);
           System.out.println("The price is " + currency + price);

           if(forSale){
               System.out.println("There is a " + car + " for sale");
           }
           else{
                   System.out.println("The " + car + " is not for sale");
               }

    }
}
