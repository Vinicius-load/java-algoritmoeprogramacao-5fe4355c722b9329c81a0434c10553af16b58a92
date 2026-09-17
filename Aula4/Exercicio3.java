package Aula4;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int numero1 = Scanner.nextInt();

        System.out.print("Informe o segundo número: ");
        int numero2 = Scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("A diferença do maior número para o menor é " + (numero1 - numero2));

        } else if (numero2 > numero1) {
            System.out.println("A diferença do maior número para o menor é " + (numero2 - numero1));

        } else {
            System.out.println("Os números são iguais!");
        }
        Scanner.close();
    }
}