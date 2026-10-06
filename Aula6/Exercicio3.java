package Aula6;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero inteiro e o sistema vai imprimir do 1 até o número informado");

        int numero = scanner.nextInt();

        System.out.println("Sequencia: ");

        for (int i = 1; i <= numero; i++) {

            System.out.println(i);

        }

        scanner.close();
    }
}