import java.util.Scanner;

public class CEx18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opcao: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o primeiro numero: ");
                    int a = sc.nextInt();
                    System.out.print("Digite o segundo numero: ");
                    int b = sc.nextInt();
                    System.out.println("Resultado: " + (a + b));
                    break;

                case 2:
                    System.out.print("Digite o primeiro numero: ");
                    int x = sc.nextInt();
                    System.out.print("Digite o segundo numero: ");
                    int y = sc.nextInt();
                    System.out.println("Resultado: " + (x - y));
                    break;

                case 3:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opcao invalida");
            }

        } while (opcao != 3);

        sc.close();
    }
}