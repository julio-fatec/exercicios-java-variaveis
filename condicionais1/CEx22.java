import java.util.Scanner;
import java.util.Random;

public class CEx22 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int opcao;

        do {
            int numeroSorteado = rand.nextInt(100) + 1;
            int palpite = 0;

            System.out.println("\nJogo da Adivinhacao");
            System.out.println("Tente adivinhar o numero entre 1 e 100");

            while (palpite != numeroSorteado) {

                System.out.print("Digite seu palpite: ");
                palpite = sc.nextInt();

                if (palpite < numeroSorteado) {
                    System.out.println("O numero sorteado é MAIOR");
                } else if (palpite > numeroSorteado) {
                    System.out.println("O numero sorteado é MENOR");
                } else {
                    System.out.println("Parabens! Voce acertou o numero!");
                }
            }

            System.out.println("\n1 - Jogar novamente");
            System.out.println("2 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();

        } while (opcao == 1);

        System.out.println("Jogo encerrado");
        sc.close();
    }
}