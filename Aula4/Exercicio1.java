package Aula4;
import java.util.Scanner;

public class Exercicio1 {
    public static void main (String [] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe um número inteiro maior que 20: ");
        int numero = entrada.nextInt();

        if (numero > 20) {
            int metade = numero / 2;
            System.out.println("A metade de " + numero + " é " + metade);
        }

        entrada.close();
    }
}