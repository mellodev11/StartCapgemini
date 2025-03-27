package LogicaIII.Log;

import java.util.Locale;
import java.util.Scanner;


//A Loja Mamão com Açúcar está vendendo seus produtos em5 (cinco) prestações sem juros. Faça um
//algoritmo que receba um valor de uma compra e mostre o valor das prestações;
public class Ex10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double valorCompra,valorParcelas ;
        int parcelas;

        System.out.println("Valor da Compra");
        valorCompra = sc.nextDouble();

        System.out.println("Quer dividir suas compras em quantas :");
        parcelas = sc.nextInt();

        valorParcelas = valorCompra / parcelas;

        System.out.printf("O valor das parcelas é: %dx %.2f de R$%n",parcelas, valorParcelas);


        sc.close();
    }
}
