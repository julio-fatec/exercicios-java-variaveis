import java.util.Scanner;

public class CEx14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro lado: ");
        int a = sc.nextInt();

        System.out.print("Digite o segundo lado: ");
        int b = sc.nextInt();

        System.out.print("Digite o terceiro lado: ");
        int c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println("Triangulo Equilatero");
        } else if (a == b || a == c || b == c) {
            System.out.println("Triangulo Isosceles");
        } else {
            System.out.println("Triangulo Escaleno");
        }

        sc.close();
    }
}