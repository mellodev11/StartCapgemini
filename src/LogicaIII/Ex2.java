package LogicaIII;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número");
        numero = sc.nextInt();
        if(numero >=100 && numero <=200){
            System.out.println("número está no intervalo");
        }else {
            System.out.println("número fora do intervalo");
        }




        sc.close();
    }
}
