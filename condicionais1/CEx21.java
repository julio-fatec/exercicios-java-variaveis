import java.util.Scanner;

public class CEx21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";

        boolean logado = false;

        // LOGIN - 3 tentativas
        for (int tentativa = 1; tentativa <= 3; tentativa++) {

            System.out.print("Usuario: ");
            String usuario = sc.nextLine();

            System.out.print("Senha: ");
            String senha = sc.nextLine();

            if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                logado = true;
                System.out.println("Login realizado com sucesso!");
                break;
            } else {
                System.out.println("Dados incorretos");
            }
        }

        if (!logado) {
            System.out.println("Conta bloqueada");
            sc.close();
            return;
        }

        // SISTEMA BANCARIO
        double saldo = 1000.0;
        int opcao;

        do {
            System.out.println("\n===== MENU BANCARIO =====");
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opcao: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: R$ " + saldo);
                    break;

                case 2:
                    System.out.print("Digite o valor do deposito: ");
                    double deposito = sc.nextDouble();

                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Deposito realizado com sucesso");
                    } else {
                        System.out.println("Valor invalido");
                    }
                    break;

                case 3:
                    System.out.print("Digite o valor do saque: ");
                    double saque = sc.nextDouble();

                    if (saque <= 0) {
                        System.out.println("Valor invalido");
                    } else if (saque > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo -= saque;
                        System.out.println("Saque realizado com sucesso");
                    }
                    break;

                case 4:
                    System.out.println("Sistema encerrado");
                    break;

                default:
                    System.out.println("Opcao invalida");
            }

        } while (opcao != 4);

        sc.close();
    }
}