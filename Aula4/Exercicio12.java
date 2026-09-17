package Aula4;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o salário: ");
        double salario = entrada.nextDouble();

        double desconto;

        if (salario <= 600.0) {
            desconto = 0;
        }
        else if (salario <= 1200.0) {
            desconto = salario * 0.20;
        }
        else if (salario <= 2000.0) {
            desconto = salario * 0.25;
        }
        else {
            desconto = salario * 0.30;
        }

        System.out.printf("O desconto do INSS é R$ %.2f%n", desconto);

        entrada.close();
    }
}