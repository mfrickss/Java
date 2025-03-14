package exercícios.EstruturasSequenciais;

import java.util.Scanner;
public class ex004 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // 3. Uma fabrica de refrigerantes vende seu produto em três formatos: lata de 350 ml, garrafa de 600 ml e
        //garrafa de 2 litros. Tomando por base que um comerciante compre uma determinada quantidade de
        //cada um dos formatos disponíveis, escreva um programa para calcular quantos litros de refrigerante
        //ele comprou.

        int lata_350;
        int garrafa_600;
        int garrafa_2L;

        System.out.print("Informe a quantidade de latas 350ml: ");
        lata_350 = scanner.nextInt();
        System.out.print("Informe a quantidade de garras 600ml: ");
        garrafa_600 = scanner.nextInt();
        System.out.print("Informe a quantidade de garrafas 2L: ");
        garrafa_2L = scanner.nextInt();

        float litros_totais = (lata_350 * 0.35f) + (garrafa_600 * 0.6f) + garrafa_2L * 2;

        System.out.println("Litros totais: " + litros_totais);

        scanner.close();

    }
}
