package LogicaIII.Log;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2,total;
        System.out.println("Escola um número");
        n1 = sc.nextInt();
        System.out.println("Escola o segundo número");
        n2 = sc.nextInt();
        sc.nextLine();

        total = n1 + n2;
        System.out.println("primeiro número foi: "+n1+" E"+" Segundo número foi: "+n2+ " soma total foi: "+total);





        sc.close();
    }
}
