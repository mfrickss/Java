package javaBasics;

import java.util.Scanner;

public class subString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // .substring() = A method used to extract a portion of a string
        //                string.substring(start, end)

        String email;

        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        if (email.contains("@")) {
            String username = email.substring(0, email.indexOf("@")); //Retorna do indice informado até                                                        até o @.
            String domain = email.substring(email.indexOf("@") + 1); //Vai retornar tudo do @                                                                    pra frente. da pra                                                                       usar o +1 pra ser                                                                        tudo DEPOIS do @.

            System.out.println(username);
            System.out.println(domain);
        } else {
            System.out.println("Email must contain '@'.");
        }


        scanner.close();
    }
}
