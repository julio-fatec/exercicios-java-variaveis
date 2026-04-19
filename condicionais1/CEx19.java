import java.util.Scanner;

public class CEx19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura: ");
        double temp = sc.nextDouble();

        if (temp < 15) {
            System.out.println("Frio");
        } else if (temp <= 25) {
            System.out.println("Agradavel");
        } else {
            System.out.println("Quente");
        }

        sc.close();
    }
}