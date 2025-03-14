package exercícios;

import java.util.Scanner;

public class shoppingCart {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String item = "";
        double preco, preco_total;
        int quant;

        System.out.print("Qual item você gostaria de comprar?: ");
        item = scanner.nextLine();

        System.out.print("Qual é o preço por cada um?: ");
        preco = scanner.nextDouble();

        System.out.print("Quantos você gostaria de comprar?: ");
        quant = scanner.nextInt();

        preco_total = preco * quant;

        if(quant > 1) {
            System.out.printf("Você comprou %d %s/s\nSeu total é de: R$%.2f", quant, item, preco_total);
            System.exit(0);
        }
        System.out.printf("Você comprou %d %s\nSeu total é R$%.2f", quant, item, preco_total);

        scanner.close();

    }
}
