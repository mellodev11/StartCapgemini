package Ex;

import java.util.Scanner;

public class Alg2 {
    public static void main(String[] args) {
        System.out.println("teste");

        //Faça um algoritimo que receba dois números e ao final mostre o resultado da soma dos dois números lidos.
        Scanner sc = new Scanner(System.in);

        System.out.println("escreva número 1");
        int n1 = sc.nextInt();
        System.out.println("escreva numero 2");
        int n2 = sc.nextInt();
        double soma = n1 + n2;
        System.out.println("A soma é nanan :" + soma);



        sc.close();
}
}