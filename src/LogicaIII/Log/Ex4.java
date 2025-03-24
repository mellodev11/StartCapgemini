package LogicaIII.Log;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        String vendedor;
        double salarioFixo,totalVendas,comissao, salarioFinal;
        System.out.println("Qual nome do vendedor:");
        vendedor = sc.nextLine();
        System.out.println("Qual salario fixo do vendedor:");
        salarioFixo = sc.nextDouble();
        System.out.println("Qual total de vendas efetuadas no mês:");
        totalVendas = sc.nextDouble();

        comissao = totalVendas * 0.15;
        salarioFinal = salarioFixo + comissao;
        System.out.println("\nResumo do vendedor: "+vendedor);
        System.out.printf("Salario Fixo do vendedor é : %.2f%n" ,salarioFixo);
        System.out.printf("Total de vendas foi de : %.2f%n",totalVendas);
        System.out.printf("Sua comissão foi de : %.2f%n",comissao);
        System.out.printf("Salario total final do mês ficou em : %.2f%n",salarioFinal);












        sc.close();
    }
}
