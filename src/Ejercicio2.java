import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("#".repeat(30));
        System.out.println("#  Operaciones aritméticas   #");
        System.out.println("#".repeat(30));
        System.out.println();

        System.out.println("Ingresa el primer número: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Ingresa el segundo número: ");
        int secondNumber = scanner.nextInt();

        System.out.println();
        System.out.println("#".repeat(30));
        System.out.printf("# %-15s %-11d#%n", "Suma:", firstNumber + secondNumber);
        System.out.printf("# %-15s %-11d#%n", "Resta:", firstNumber - secondNumber);
        System.out.printf("# %-15s %-11d#%n", "Multiplicación:", firstNumber * secondNumber);
        System.out.println("#".repeat(30));
    }
}
