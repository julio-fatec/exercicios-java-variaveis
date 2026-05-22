import java.util.Scanner;

public class Exercicio13 {

    public static int curar(int vida) {
        vida += 15;
        if (vida > 100) vida = 100;
        return vida;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        int vida = 100;

        vida -= 10;
        System.out.println(vida);

        vida = curar(vida);
        System.out.println(vida);

        System.out.println("Personagem: " + nome);

        sc.close();
    }
}