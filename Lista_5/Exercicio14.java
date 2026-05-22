import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = 1000;
        int op;

        do {
            op = sc.nextInt();

            if (op == 1) saldo += sc.nextDouble();
            else if (op == 2) saldo -= sc.nextDouble();
            else if (op == 3) System.out.println(saldo);

        } while (op != 0);

        sc.close();
    }
}