import java.util.Random;
import java.util.Scanner;

public class Exercicio11 {

    public static int sortearNumero() {
        return new Random().nextInt(100) + 1;
    }

    public static int lerPalpite(Scanner scanner) {
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = sortearNumero();
        int tentativas = 0;

        while (true) {
            int p = lerPalpite(scanner);
            tentativas++;

            if (p == numero) {
                System.out.println("Acertou em " + tentativas);
                break;
            } else if (p < numero) {
                System.out.println("Maior");
            } else {
                System.out.println("Menor");
            }
        }

        scanner.close();
    }
}