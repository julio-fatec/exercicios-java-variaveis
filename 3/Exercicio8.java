import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce deseja informar? ");
        int quantidade = sc.nextInt();

        double soma = 0;

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite o " + i + " numero: ");
            double numero = sc.nextDouble();

            soma += numero;
        }

        double media = soma / quantidade;

        System.out.println("Media: " + media);

        sc.close();
    }
}