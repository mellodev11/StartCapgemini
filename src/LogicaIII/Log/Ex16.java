package LogicaIII.Log;

import java.util.Locale;
import java.util.Scanner;


//Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a
//sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e
//Recuperação (media entre 5.1 a 6.9);
public class Ex16 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nota1, nota2, nota3, media;
        System.out.println("Digite a nota do 1 bimestre:");
        nota1 = sc.nextDouble();
        System.out.println("Digite a nota do 1 bimestre:");
        nota2 = sc.nextDouble();
        System.out.println("Digite a nota do 1 bimestre:");
        nota3 = sc.nextDouble();

        media = (nota1 + nota2 + nota3)/3;
        if (media >=7){
            System.out.printf("Sua média foi de: %.2f%n e você está aprovado",media);
        } else if (media >=5.1 & media <=6.9) {
            System.out.printf("Sua média foi de: %.2f Aluno recuperação",media);
        }else {
            System.out.printf("Sua média foi de %.2f Aluno Reprovado",media);
        }

        sc.close();
    }
}
