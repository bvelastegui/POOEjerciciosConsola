import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-".repeat(33));
        System.out.printf("%-29s%n", "Concatención de cadenas");
        System.out.println("-".repeat(33));

        System.out.println();
        System.out.print("Ingresa tu nombre: ");
        String firstName = scanner.nextLine();

        System.out.print("Ingresa tu apellido: ");
        String lastName = scanner.nextLine();

        System.out.print("Ingresa tu dirección: ");
        String address = scanner.nextLine();

        System.out.println();
        System.out.println("Hola "  + firstName + " " + lastName + "!");
        System.out.println("Tu dirección es: "  + address);
    }
}
