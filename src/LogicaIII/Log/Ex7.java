package LogicaIII.Log;

import java.util.Locale;
import java.util.Scanner;

//Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. Afórmula de
//conversão é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura emCelsius;
public class Ex7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double temp,fah;
        System.out.println("Qual a temp em Graus C: ");
        temp = sc.nextDouble();

        fah = (9*temp+160)/5;

        System.out.printf("Temperatura em graus C: %.1fC%n",temp);
        System.out.printf("Temperatura em graus F: %.1fF%n",fah);












        sc.close();
    }
}
