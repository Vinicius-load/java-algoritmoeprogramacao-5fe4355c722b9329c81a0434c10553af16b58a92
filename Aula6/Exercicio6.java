package Aula6;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vote 1 para Candidato 1");
        System.out.println("Vote 2 para Candidato 2");
        System.out.println("Vote 3 para Candidato 3");
        System.out.println("Vote 4 para Candidato 4");
        System.out.println("Vote 5 para Voto Nulo");
        System.out.println("Vote 6 para Voto em branco");

        int numeroEleitores = 10;

        int contagemCandidato1 = 0;
        int contagemCandidato2 = 0;
        int contagemCandidato3 = 0;
        int contagemCandidato4 = 0;
        int contagemNulo = 0;
        int contagemEmBranco = 0;

        for (int i = 1; i <= numeroEleitores; i++) {

            System.out.printf("Eleitor %d, digite seu voto: ", i);

            int voto = scanner.nextInt();

            switch (voto) {

                case 1 -> contagemCandidato1++;

                case 2 -> contagemCandidato2++;

                case 3 -> contagemCandidato3++;

                case 4 -> contagemCandidato4++;

                case 5 -> contagemNulo++;

                case 6 -> contagemEmBranco++;

                default -> System.out.println("Voto inválido!");
            }
        }

        int totalVotos = contagemCandidato1
                + contagemCandidato2
                + contagemCandidato3
                + contagemCandidato4
                + contagemNulo
                + contagemEmBranco;

        double percentualBrancosENulos =
                ((double) (contagemNulo + contagemEmBranco) / totalVotos) * 100;

        System.out.println();
        System.out.println("Resultado da votação:");

        System.out.println("Candidato 1: " + contagemCandidato1 + " votos");
        System.out.println("Candidato 2: " + contagemCandidato2 + " votos");
        System.out.println("Candidato 3: " + contagemCandidato3 + " votos");
        System.out.println("Candidato 4: " + contagemCandidato4 + " votos");

        System.out.println("Votos nulos: " + contagemNulo);
        System.out.println("Votos em branco: " + contagemEmBranco);

        System.out.printf(
                "Percentual de votos brancos e nulos: %.2f%%%n",
                percentualBrancosENulos
        );

        scanner.close();
    }
}