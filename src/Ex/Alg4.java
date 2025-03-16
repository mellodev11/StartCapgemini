package Ex;

import java.util.Scanner;

public class Alg4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a distancia total percorrida ?");
        double dist = sc.nextDouble();
        System.out.println("total de combustivel gasto");
        double comb = sc.nextDouble();

        double media = dist / comb;
        System.out.printf("Média de consumo de automóvel %.2f kms/l",media);







        sc.close();
    }
}
