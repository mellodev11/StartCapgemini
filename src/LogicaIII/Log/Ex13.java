package LogicaIII.Log;

import java.util.Locale;
import java.util.Scanner;

//Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10;
public class Ex13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero;
        System.out.println("Escolha um numero");
        numero = sc.nextInt();

        if (numero >10){
            System.out.println("Mensagem");
        }








        sc.close();
    }
}
