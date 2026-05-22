import java.util.Random;
import java.util.Scanner;

public class Exercicio12 {

    public static String converter(int j) {
        if (j == 1) return "Pedra";
        if (j == 2) return "Papel";
        if (j == 3) return "Tesoura";
        return "Erro";
    }

    public static String vencedor(int j, int c) {
        if (j == c) return "Empate";

        if ((j == 1 && c == 3) ||
            (j == 2 && c == 1) ||
            (j == 3 && c == 2)) {
            return "Jogador";
        }

        return "Computador";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jogador = sc.nextInt();
        int comp = new Random().nextInt(3) + 1;

        System.out.println(converter(jogador));
        System.out.println(converter(comp));
        System.out.println(vencedor(jogador, comp));

        sc.close();
    }
}