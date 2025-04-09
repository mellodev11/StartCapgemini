package LogicaIII.Log;

import java.util.Locale;
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        if (num >= 100 && num <= 200) {
            System.out.println("Numero escolhido foi " + num);
            System.out.println("Numero entre 100 e 200");
        } else {
            System.out.println("Numero escolhido foi " + num);
            System.out.println("Numero fora entre 100 e 200");
        }


        sc.close();
    }
}
