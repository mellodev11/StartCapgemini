package LogicaIII.Log;

import java.util.Locale;
import java.util.Scanner;
//Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variávelApasse a
//possuir ovalor da variável B e a variável B passe a possuir o valor da variável A.Apresentar osvalores
//trocados;

public class Ex6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b;
        double i ;
        System.out.println("Valor de A");
        a= sc.nextDouble();
        System.out.println("Valor de B");
        b= sc.nextDouble();
        System.out.println();
        System.out.println("O valor de A é "+a);
        System.out.println("O valor de B é "+b);
        i = a;
        a = b;
        b = i;

        System.out.println("Agora o valor de A passou a ser "+a);
        System.out.println("Agora o valor de B passou a ser "+b);








        sc.close();
    }
}
