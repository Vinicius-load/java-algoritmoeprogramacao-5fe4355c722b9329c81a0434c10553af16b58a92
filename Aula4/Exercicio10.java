package Aula4;
import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o 1° número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Informe o 2° número: ");
        int numero2 = scanner.nextInt();
        System.out.println("Informe o 3° número: ");
        int numero3 = scanner.nextInt();

        if (numero1 == numero2 && numero2 == numero3) {
            System.out.println("Todos os números são iguais.");
        } else if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("O 1° número é o maior.");
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("O 2° número é o maior.");
        } else {
            System.out.println("O 3° número é o maior.");
        }

        scanner.close();
    }
    
}
