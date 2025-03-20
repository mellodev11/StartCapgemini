package LogicaIII;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalAlunos = 3;

        while (totalAlunos >0){
            System.out.println("Escreva o nome");
            String nomeAluno = sc.nextLine();

            System.out.println("Escreva a idade");
            int idadeAluno = sc.nextInt();
            sc.nextLine();

            System.out.println("O Nome do aluno é: "+nomeAluno+" e a idade é "+idadeAluno);

            totalAlunos = totalAlunos - 1;
        }









        sc.close();
    }
}
