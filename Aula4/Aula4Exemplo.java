package Aula4;
import java.util.Scanner;

public class Aula4Exemplo {
    public static void main (String [] args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número de pontos do Jogador 1 na fase 1.");
        Double pontos = entrada.nextDouble();

        if (pontos >= 1000){
            System.out.println("Parabéns! Você passou a fase 2.");
        }else{
            System.out.println("Você não atingiu a pontuação necessária. Tente novamente.");
        }
        System.out.println("Siga para a proxima etapa!");
        entrada.close();
    }
}


