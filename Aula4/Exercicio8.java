package Aula4;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
         
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        String senha = Scanner.nextLine();

        if (senha.equals("*R10p5*")) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }
        Scanner.close();    

    }
    
}
