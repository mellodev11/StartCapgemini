package LogicaIII.Log;

import java.util.Locale;
import java.util.Scanner;

//Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um
//mês.Considere fixo o juro da poupança em 0,07% a. m;

public class Ex9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double deposito,valorFinal;
        double juros = 0.007;


        System.out.println("Quanto vai depositar hoje:");
        deposito = sc.nextDouble();


        valorFinal = deposito + (deposito* juros);

        System.out.printf("O valor depois de 1 mês é de: %.2f reais%n",valorFinal);





        sc.close();
    }
}
