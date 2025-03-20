package LogicaIII;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual sua idade ?");
        int age = sc.nextInt();
        System.out.println("Sua idade é : " + age);

       sc.nextLine();
       String name = sc.nextLine();
        float cotacaoDolar = sc.nextFloat();
        double cotacaoEuro = sc.nextDouble();

        System.out.println("Seu nome é : "+ name + " idade "+age + " Cotação dollar é :" +cotacaoDolar+" Cotação Euro :"+cotacaoEuro);







    sc.close();
    }
}
