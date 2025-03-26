package LogicaIII.Log;

import java.util.Locale;
import java.util.Scanner;

//Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valorlido em
//dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também aquantidade de dólares
//disponíveis com ousuário;
public class Ex8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double real,dolar,conversao;
        System.out.println("Qual valor do real");
        real = sc.nextDouble();
        System.out.println("Qual valor do dolar");
        dolar = sc.nextDouble();

        conversao = real / dolar;
        System.out.printf("Se você tem %.2f BRL reais, terá %.2f USD  dolares: ",real,conversao);





        sc.close();
    }
}
