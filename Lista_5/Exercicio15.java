import java.util.Random;
import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int player = 100;
        int enemy = 80;

        while (player > 0 && enemy > 0) {

            int op = sc.nextInt();

            if (op == 1) {
                int dano = new Random().nextInt(10) + 5;
                enemy -= dano;

                if (enemy > 0) {
                    player -= new Random().nextInt(10) + 5;
                }

            } else if (op == 2) {
                player += 10;
            }

            System.out.println("P:" + player + " E:" + enemy);
        }

        sc.close();
    }
}