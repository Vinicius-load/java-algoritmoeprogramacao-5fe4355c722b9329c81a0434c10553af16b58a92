package Aula4;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe quanto tempo de empresa você tem (em anos): ");

        int anosTrabalhados = scanner.nextInt();

        System.out.println("Informe seu salário atual:");

        double salario = scanner.nextDouble();

        double bonus;

        if (anosTrabalhados >= 5) {

            bonus = salario * 0.20;

        } else {

            bonus = salario * 0.10;

        }

        System.out.printf("O valor do bonus é: R$ %.2f%n", bonus);

        scanner.close();

    }
}



