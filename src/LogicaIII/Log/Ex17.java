package LogicaIII.Log;
//Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150
//(inclusive);

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;


        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = sc.nextInt();

            // Verifica se o número está no intervalo [10, 150]
            if (numero >= 10 && numero <= 150) {
                count++;
            }
        }

        // Exibe o resultado final
        System.out.println("Quantidade de números no intervalo [10, 150]: " + count);
        sc.close();
    }
}
