import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opcao: ");

            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.print("Digite o primeiro numero: ");
                int a = sc.nextInt();

                System.out.print("Digite o segundo numero: ");
                int b = sc.nextInt();

                System.out.println("Resultado: " + (a + b));

            } else if (opcao == 2) {
                System.out.print("Digite o primeiro numero: ");
                int a = sc.nextInt();

                System.out.print("Digite o segundo numero: ");
                int b = sc.nextInt();

                System.out.println("Resultado: " + (a - b));

            } else if (opcao == 3) {
                System.out.println("Encerrando o programa...");

            } else {
                System.out.println("Opcao invalida.");
            }

        } while (opcao != 3);

        sc.close();
    }
}