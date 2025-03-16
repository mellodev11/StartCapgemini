package Ex;

import java.util.Scanner;

public class Alg3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota da sua primeira prova:");
        double p1 = sc.nextDouble();
        System.out.println("Digite a nota da sua segunda prova:");
        double p2 = sc.nextDouble();
        System.out.println("Digite a nota da sua terceira prova:");
        double p3 = sc.nextDouble();

        double total = p1 + p2 + p3;
        double media = total /3;

        if (media > 7){
            System.out.println("Joaozinho está aprovado média: %.2f%n"+media);
        }else {
            System.out.printf("Joãozinho está reprovado, média : %.2f%n ", media);
        }












    }
}
