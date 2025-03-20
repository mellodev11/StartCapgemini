package LogicaIII.Log;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float cMedio,distancia,combustivel;

        System.out.println("Distancia percorrida: ");
        distancia = sc.nextFloat();
        System.out.println("Combustivel Gasto: ");
        combustivel = sc.nextFloat();
        sc.nextLine();

        cMedio = distancia / combustivel;


        System.out.printf("Consumo médio do carro foi: %.1f KM/L %n",cMedio);




        sc.close();
    }
}
