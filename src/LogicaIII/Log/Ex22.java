package LogicaIII.Log;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomeProduto;
        int totalProdutos = 3;
        float pCusto,pVenda;
        float totalVenda =0 ,totalCusto = 0;
        float lucroTotal;

        for (int i = 0;i < totalProdutos; i++){

            System.out.println("Digite o nome do produto: ");
            nomeProduto = sc.nextLine();

            System.out.println("Qual preço de custo:");
            pCusto = sc.nextFloat();

            System.out.println("Qual preço de venda");
            pVenda = sc.nextFloat();
            sc.nextLine();


            totalCusto += pCusto;
            totalVenda += pVenda;




            if (pVenda > pCusto){
                System.out.println("Obteve lucro");
            }else if(pVenda == pCusto)  {
                System.out.println("Empate");
            }else {
                System.out.println("prejuizo");
            }
            System.out.println(nomeProduto + " custou: R$" + pCusto + " | Saiu por: R$" + pVenda);

    }
        float mediaCusto = totalCusto/totalProdutos;
        float mediaVenda = totalVenda/totalProdutos;
         lucroTotal = totalVenda - totalCusto;
        System.out.println("\n--- Resumo Final ---");
        System.out.println("Média do preço de custo: R$" + mediaCusto);
        System.out.println("Média do preço de venda: R$" + mediaVenda);
        System.out.println("Total lucro foi : R$"+lucroTotal);
     sc.close();
    }
}
