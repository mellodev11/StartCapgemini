package LogicaIII.Log;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1,n2,sub,som,mult,div;
        System.out.println("Escolha o primeiro número:");
        n1 = sc.nextInt();
        System.out.println("Escolha o segundo número:");
        n2 = sc.nextInt();
        sc.nextLine();

        sub = n1 - n2;
        som = n1 + n2;
        mult = n1 * n2;
        div = n1 / n2;

        System.out.printf("Números escolhidos: %.2f e %.2f%n", n1,n2);
        System.out.printf("A subtração dos números é : %.2f%n",sub);
        System.out.printf("A soma dos números é : %.2f%n",som);
        System.out.printf("A divisão dos números é : %.2f%n",div);
        System.out.printf("A Multiplicação dos números é : %.2f%n",mult);





        sc.close();
    }
}
