package Aula4;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu salario Bruto: ");
        double salario= scanner.nextDouble();

        System.out.println("Informe o valor da prestação: ");
        double prestacao= scanner.nextDouble();

        double salario_porcetagem30 = salario * 0.30;

        if (prestacao > salario_porcetagem30) {

            System.out.println("Empréstimo não pode ser concedido!");

        } else {

            System.out.println("Empréstimo de " + prestacao + " concedido com sucesso!");

        }
        scanner.close();
    }
    
}
