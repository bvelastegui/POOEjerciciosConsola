import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre;
        String ciudad;
        int edad;

        System.out.println("Ingresa tu nombre:");
        nombre = scanner.nextLine();

        System.out.println("Ingresa tu ciudad:");
        ciudad = scanner.nextLine();

        System.out.println("Ingresa tu edad:");
        edad = scanner.nextInt();

        System.out.println("*".repeat(50));
        System.out.printf("%-14s %s%n", "Tu nombre es:", nombre);
        System.out.printf("%-14s %s%n", "Tu edad es:", edad);
        System.out.printf("%-14s %s%n", "Tu ciudad es:", ciudad);
        System.out.println("*".repeat(50));
    }
}
