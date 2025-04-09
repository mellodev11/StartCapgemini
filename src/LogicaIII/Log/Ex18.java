package LogicaIII.Log;

import java.util.Locale;
import java.util.Scanner;

//Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando “maior de idade” e
//“menor de idade” para cada pessoa. Considere a idade a partir de 18 anos como maior de idade;

public class Ex18 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int count = 0;

        for (int i=0;i<5;i++){
            System.out.println("Responda sua idade" +(i+1) + " :");
            int numero = sc.nextInt();


             if (numero >=18){
                count++;
            }

        }
        System.out.println("Pessoas maiores de Idade:"+count);




        sc.close();
    }

}
