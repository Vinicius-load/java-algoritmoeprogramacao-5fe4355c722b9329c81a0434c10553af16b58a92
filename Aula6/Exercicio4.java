package Aula6;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalPessoas = 10;

        double somaAlturas = 0.0;

        int contadorPessoasMaisDe50 = 0;

        for (int i = 1; i <= totalPessoas; i++) {

            System.out.println("Pessoa " + i + ", informe sua idade: ");

            int idade = scanner.nextInt();

            System.out.println("Pessoa " + i + ", informe sua altura (em metros): ");

            double altura = scanner.nextDouble();

            if (idade > 50) {

                somaAlturas += altura;

                contadorPessoasMaisDe50++;
            }
        }

        if (contadorPessoasMaisDe50 > 0) {

            double mediaAlturas = somaAlturas / contadorPessoasMaisDe50;

            System.out.printf(
                "A média das alturas das pessoas com mais de 50 anos é: %.2f metros.%n",
                mediaAlturas
            );

        } else {

            System.out.println("Nenhuma pessoa com mais de 50 anos foi registrada.");
        }

        scanner.close();
    }
}