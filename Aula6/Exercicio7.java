package Aula6;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalPessoas = 10;

        int pessoasMaisDe50 = 0;

        double somaAlturasEntre10e20 = 0;

        int contadorEntre10e20 = 0;

        int pessoasPesoMenor40 = 0;

        for (int i = 1; i <= totalPessoas; i++) {

            System.out.printf("Pessoa %d, informe sua idade: ", i);
            int idade = scanner.nextInt();

            System.out.printf("Pessoa %d, informe sua altura (em metros): ", i);
            double altura = scanner.nextDouble();

            System.out.printf("Pessoa %d, informe seu peso (em quilos): ", i);
            double peso = scanner.nextDouble();

            if (idade > 50) {
                pessoasMaisDe50++;
            }

            if (idade >= 10 && idade <= 20) {
                somaAlturasEntre10e20 += altura;
                contadorEntre10e20++;
            }

            if (peso < 40) {
                pessoasPesoMenor40++;
            }
        }

        double mediaAlturasEntre10e20;

        if (contadorEntre10e20 > 0) {
            mediaAlturasEntre10e20 =
                    somaAlturasEntre10e20 / contadorEntre10e20;
        } else {
            mediaAlturasEntre10e20 = 0;
        }

        double percentualPesoMenor40 =
                ((double) pessoasPesoMenor40 / totalPessoas) * 100;

        System.out.println();
        System.out.println("Resultados:");

        System.out.println(
                "Quantidade de pessoas com mais de 50 anos: "
                + pessoasMaisDe50
        );

        System.out.printf(
                "Média das alturas das pessoas com idade entre 10 e 20 anos: %.2f metros%n",
                mediaAlturasEntre10e20
        );

        System.out.printf(
                "Percentual de pessoas com peso inferior a 40 quilos: %.2f%%%n",
                percentualPesoMenor40
        );

        scanner.close();
    }
}