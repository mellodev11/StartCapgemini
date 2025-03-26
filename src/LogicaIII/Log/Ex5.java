package LogicaIII.Log;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
    //Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre.
    //No final informar o nome do aluno e a sua média (aritmética);
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String aluno;
        double nota1,nota2,nota3,media;

        System.out.println("Qual nome do Aluno:");
        aluno = sc.nextLine();
        System.out.println("Nota do primeiro Bimestre:");
        nota1 = sc.nextDouble();
        System.out.println("Nota do primeiro Bimestre:");
        nota2 = sc.nextDouble();
        System.out.println("Nota do primeiro Bimestre:");
        nota3 = sc.nextDouble();

        media = (nota1 + nota2 + nota3)/3;

        System.out.printf("Media do aluno %s é: %.2f%n",aluno ,media);















        sc.close();
    }
}
