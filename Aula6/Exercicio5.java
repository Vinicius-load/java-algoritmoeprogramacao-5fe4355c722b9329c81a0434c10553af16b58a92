package Aula6;

import java.util.Scanner;

public class Exercicio5 {

    static Scanner scanner = new Scanner(System.in);

    public static void main (String [] args) {

        int totalAlunos = 6;

        int totalAprovados = 0;
        int totalExame = 0;
        int totalReprovados = 0;

        double somaMedias = 0;

        for (int i = 1; i <= totalAlunos; i++) {

            System.out.println("Aluno " + i + ", informe a primeira nota:");
            double nota1 = scanner.nextDouble();

            System.out.println("Aluno " + i + ", informe a segunda nota:");
            double nota2 = scanner.nextDouble();

            double media = (nota1 + nota2) / 2;

            somaMedias += media;

            System.out.printf("A média do aluno %d é: %.2f%n", i, media);

            if (media <= 3) {

                System.out.println("REPROVADO");
                totalReprovados++;

            } else if (media < 7) {

                System.out.println("EXAME");
                totalExame++;

            } else {

                System.out.println("APROVADO");
                totalAprovados++;
            }
        }

        double mediaClasse = somaMedias / totalAlunos;

        System.out.println("--------------------------------");

        System.out.println("Total de alunos aprovados: " + totalAprovados);
        System.out.println("Total de alunos de exame: " + totalExame);
        System.out.println("Total de alunos reprovados: " + totalReprovados);

        System.out.printf("Média da classe: %.2f%n", mediaClasse);

        scanner.close();
    }

    }
