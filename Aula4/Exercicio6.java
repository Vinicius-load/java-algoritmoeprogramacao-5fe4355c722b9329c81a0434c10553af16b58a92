package Aula4;

import java.util.Scanner;

public class Exercicio6 {
 
    public static void main(String [] args) {

        Scanner Scanner = new Scanner(System.in);

        System.out.println("Informe a sua altura (em metros, ex: 1,75): ");
        double altura = Scanner.nextDouble();

        System.out.println("Informe o seu sexo Masculino/Feminino:");
        char sexo = Scanner.next().charAt(0);

        if (sexo == 'M') {

            double pesoIdeal = (72.7 * altura) - 58;

            System.out.println("Seu peso ideal é: " + pesoIdeal + " kg");

        } else if (sexo == 'F') {

            double pesoIdeal = (62.1 * altura) - 44.7;

            System.out.println("Seu peso ideal é: " + pesoIdeal + " kg");

        } else {

            System.out.println("Sexo inválido. Por favor, informe M ou F.");

        }

        Scanner.close();
    }
}
