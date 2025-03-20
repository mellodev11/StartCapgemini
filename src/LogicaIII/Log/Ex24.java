package LogicaIII.Log;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char continuar = 'S';
        while (continuar == 'S' || continuar == 's'){

            System.out.println("Digite um número");
        int numero = sc.nextInt();
        sc.nextLine();
        if (numero ==0){
            System.out.println("Numero é 0");
        }else {
            if (numero > 0){
                System.out.println("Numero maior que 0");
            }else {
                System.out.println("Numero menor que 0");

            }
        }
            System.out.println("Deseja continuar ? S para Sim N para Não");
        continuar = sc.nextLine().charAt(0);



        }




        sc.close();
    }
}
