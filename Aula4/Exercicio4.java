package Aula4;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número flutuante (separado por vírgula): ");
        float numero1 = scanner.nextFloat();

        System.out.println("Informe o segundo número flutuante (separado por vírgula): ");
        float numero2 = scanner.nextFloat();

        if (numero1 > numero2) {
            System.out.println("Em ordem decrescente:\n" + numero1 + "\n" + numero2);
        } else if (numero2 > numero1) {
            System.out.println("Em ordem decrescente:\n" + numero2 + "\n" + numero1);
        } else {
            System.out.println("Os números precisam ser diferentes.");
        }

        scanner.close();
    }
}