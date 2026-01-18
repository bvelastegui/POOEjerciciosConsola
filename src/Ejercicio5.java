import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("#".repeat(33));
        System.out.printf("# %-29s #%n", "Área de figuras");
        System.out.println("#".repeat(33));

        System.out.println();
        System.out.print("Ingresa el valor de la base: ");
        float base = scanner.nextFloat();
        System.out.print("Ingresa el valor de la altura: ");
        float altura = scanner.nextFloat();

        System.out.println();
        System.out.println("#".repeat(33));
        System.out.printf("# %-20s %8.2f #%n", "Área del rectángulo:", (base * altura));
        System.out.printf("# %-20s %8.2f #%n", "Área del triángulo:", (base * altura / 2));
        System.out.println("#".repeat(33));
    }
}
