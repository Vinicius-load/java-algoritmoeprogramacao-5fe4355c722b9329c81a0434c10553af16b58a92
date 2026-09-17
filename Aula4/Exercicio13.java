package Aula4;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua idade: ");

        int idade = entrada.nextInt();

        System.out.println("Você é cidadão brasileiro? (S/N): ");

        char cidadao = entrada.next().charAt(0);

        if (cidadao == 'N' || cidadao == 'n') {

            System.out.println("Não apto a votar: apenas cidadãos brasileiros podem votar.");

        } else if (cidadao == 'S' || cidadao == 's') {

            if (idade < 16) {

                System.out.println("Não apto a votar: idade mínima é 16 anos.");

            } else if (idade < 18) {

                System.out.println("Apto a votar (voto facultativo).");

            } else if (idade < 70) {

                System.out.println("Apto a votar (voto obrigatório).");

            } else {

                System.out.println("Apto a votar (voto facultativo - 70 anos ou mais).");

            }

        } else {

            System.out.println("Resposta inválida! Digite S ou N.");

        }

        entrada.close();
    }
}