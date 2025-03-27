package LogicaIII.Log;

import java.util.Locale;
import java.util.Scanner;



//Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o
//preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário;
public class Ex11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double precoCusto,valorVenda,valorPercentual;
        double percentual, soma,lucroTotal;


        System.out.println("Preço de custo:");
        precoCusto = sc.nextDouble();
        System.out.println("Valor de venda:");
        valorVenda = sc.nextDouble();

        System.out.println("Quantos % de acréscimo vai ter o produto:");
        percentual = sc.nextDouble();

        valorPercentual = (percentual/100) * precoCusto;
        soma = precoCusto + valorPercentual;
        lucroTotal = valorVenda - soma;
        System.out.printf("O preço de custo é:%.2fR$, com o valor de imposto subiu para: %.2fR$, preço de venda foi:%.2fR$.%n",precoCusto,soma,valorVenda);
        System.out.printf("O valor de lucro foi: %.2fR$%n",lucroTotal);
        sc.close();
    }
}
