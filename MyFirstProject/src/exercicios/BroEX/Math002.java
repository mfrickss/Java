package exercicios.BroEX;

import java.util.Scanner;

public class Math002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double circunference, area, volume, radius;

        System.out.print("Inform the radius: ");
        radius = scanner.nextDouble();

        circunference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("The circunference is: %.2fcm\n", circunference);
        System.out.printf("The area is: %.2fcm²\n", area);
        System.out.printf("The volume is: %.2fcm³\n", volume);

        scanner.close();

    }
}