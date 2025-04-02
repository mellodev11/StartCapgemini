package LogicaIII.Log;

import java.util.Locale;
import java.util.Scanner;

//Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior;
public class Ex14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int valor1, valor2;
        System.out.println("Escreva o primeiro valor:");
        valor1 = sc.nextInt();
        System.out.println("Escreva o segundo valor:");
        valor2 = sc.nextInt();

        if (valor1 > valor2) {
            System.out.println("Valor 1 é maior");
        } else if (valor1 == valor2) {
            System.out.println("São iguais");
        } else {
            System.out.println("valor 2 maior");
        }


        sc.close();
    }
}
