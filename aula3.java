import java.util.Scanner;

public class aula3{
    public static void main (String [] args) {

        System.out.println("Olá Mundo");
        System.out.println("Minha idade é: "+ 19 + " anos.");
        System.out.println("O resultado é: " + (3+5 <= 22));
        
    Exercicio1();
    Exercicio2();
    Exercicio3();
    Exercicio4();
    Exercicio5();
    Exercicio6();
    Exercicio7();
    Exercicio8();
    Exercicio9();
    Exercicio10();
    Exercicio11();
    Exercicio12();
}

    private static void Exercicio1() {
        System.out.println("-------------------------------------------------------");
        System.out.println("Meu nome é: Vinicius");
        System.out.println("O meu registro acadêmico é: " + 06263335+" RA.");
        System.out.println("O meu curso é: Analise e desenvolvimento de sistemas");
    }

    private static void Exercicio2() {
       System.out.println("-------------------------------------------------------");
       System.out.println("Minha idade é: "+ 19 + " anos.");
       System.out.println("Minha altura é: "+ 1.83 + ".");
       System.out.println("Meu status em aula hoje é: Presente");
    }

    private static void Exercicio3() {
        System.out.println("-------------------------------------------------------");
        int numero = 5;
        for (int i = 1; i <= 10; i++) {

         System.out.printf("%d X %d = %d%n", numero, i, numero * i);
        }

    }

    private static void Exercicio4() {
      System.out.println("-------------------------------------------------------");
      
      Scanner scanner = new Scanner(System.in);
      System.out.print("Digite um número: ");
       int numero1 = scanner.nextInt();

       System.out.print("Digite outro número: ");
       int numero2 = scanner.nextInt();
        
        scanner.close();

}
private static void Exercicio5() {
        System.out.println("-------------------------------------------------------");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.print("Digite outro número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int numero3 = scanner.nextInt();

        System.out.print("Digite o quarto número: ");
        int numero4 = scanner.nextInt();

        int soma = numero + numero2 + numero3 + numero4;
        System.out.println("A soma dos quatro números é: " + soma);

        scanner.close();
    }

    private static void Exercicio6() {
        System.out.println("-------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua primeira nota: ");
        double numero = scanner.nextDouble();

        System.out.print("Digite sua segunda nota: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite sua terceira nota: ");
        double numero3 = scanner.nextDouble();

        double media = (numero + numero2 + numero3) / 3;
        System.out.println("A média das três notas é: " + media);

        scanner.close();
    }

    private static void Exercicio7() {
        System.out.println("-------------------------------------------------------");

         double exp1 = (20.0 - 15.0) / 2.0;

        double exp2 = Math.pow(2.0, (5.0 / 20.0)) + 30.0 / Math.pow(15.0, 2.0);


        double exp3 = 35.0 / (6.0 + 2.0);


        int exp4 = 23 % 4;

        System.out.printf("Resultado da expressão 1: %.2f%n", exp1);
        System.out.printf("Resultado da expressão 2: %.4f%n", exp2); 
        System.out.printf("Resultado da expressão 3: %.2f%n", exp3);

        System.out.println("Resultado da expressão 4: " + exp4);

    }

    private static void Exercicio8() {
        System.out.println("-------------------------------------------------------");
         
        boolean exp1 = (120 - 30) == Math.pow(3, 30);
        System.out.println("O resultado da expressao 1 é: " + exp1);

        boolean exp2 = ! ((20 % 4) == 1) || (9 != 9);
        System.out.println("O resultado da expressao 2 é: " + exp2);

        boolean exp3 = (5 % 2) > 3;
        System.out.println("O resultado da expressao 3 é: " + exp3);

        boolean exp4 = 'a' == 'A';
        System.out.println("O resultado da expressao 4 é: " + exp4);
    }

    private static void Exercicio9() {
            
        
        Double numero1 =  8.0;
        Double numero2 = 7.5;
        Double numero3 = 4.5;
        Double numero4 = 9.0;

        Double media = (numero1 + numero2 + numero3 + numero4) / 4;
        System.out.printf("A média dos quatro números é: %.2f%n", media);
        
    }

    private static void Exercicio10() {
        System.out.println("-------------------------------------------------------");

        double raio = 5.0;
        double pi = 3.14159;


        double area = pi * (raio * raio);

        System.out.printf("A área do círculo de raio %.2f é: %.2f%n", raio, area);


}

    private static void Exercicio11() {
        System.out.println("-------------------------------------------------------");

        Scanner scanner = new Scanner (System.in);
        
        System.out.print("informe o ano do seu nascimento:");
        int anoNascimento = scanner.nextInt();

        System.out.print("Informe o ano atual que você está:");
        int anoAtual = scanner.nextInt();

        int idade = anoAtual - anoNascimento;
        System.out.println("Sua idade é: " + idade);

        int idade2030 = 2030 - anoNascimento;
        System.out.println("Sua idade em 2030 será: " + idade2030);
    }

    private static void Exercicio12() {
        System.out.println("-------------------------------------------------------");

        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite um numero: ");
        double numero = scanner.nextDouble();

        double quadrado = Math.pow(numero, 2);
        double cubo = Math.pow(numero, 3);
        double raizQuadrada = Math.sqrt(numero);
        double potencia10 = Math.pow(numero, 10);

        System.out.printf("O número elevado ao quadrado: %.2f%n", quadrado);
        System.out.printf("O número elevado ao cubo: %.2f%n", cubo);
        System.out.printf("A raiz quadrada do número: %.2f%n", raizQuadrada);
        System.out.printf("O número elevado a potência 10: %.2f%n", potencia10);

        scanner.close();
    }
}

