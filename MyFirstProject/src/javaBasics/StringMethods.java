package javaBasics;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "MFRICKS";

//        int length = name.length();
//        char letter = name.charAt(0);  //Acha a letra do indice passado.
//        int index = name.indexOf(" "); //Acha o index em que a letra passada aparece pela primeira vez.
//        int lastIndex = name.lastIndexOf("R"); // Acha o último index da letra passada.(Se é Upper ou Lower importa)
//        name = name.toUpperCase();
//        name = name.toLowerCase();
//        name = name.trim();
//        name = name.replace("r", "R");
//
//        if(name.isEmpty()){
//            System.out.println("Your name is empty.");
//        } else{
//            System.out.println("Hello, " + name);
//        }
//
//        if(name.contains(" ")){
//            System.out.println("Your name contains a space.");
//        } else{
//            System.out.println("Your name doesn't contains a space.");
//        }
//
//        System.out.println(name.isEmpty());

        if (name.equals("password")) { //name.equalsIgnoreCase para ignorar upper e lower pois naturalmente ele não faz.
            System.out.println("Your name cant be 'PASSWORD'.");
        } else {
            System.out.println("Hello, " + name + "!");
        }


        scanner.close();
    }
}
