import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float notaQ1, notaQ2, notaQ3;

        System.out.println("#".repeat(33));
        System.out.println("# Calcula tu promedio de notas. #");
        System.out.println("#".repeat(33));

        System.out.println();

        System.out.println("Ingresa las calificaciones:");
        System.out.print("Quimestre 1: ");
        notaQ1 = scanner.nextFloat();
        System.out.print("Quimestre 2: ");
        notaQ2 = scanner.nextFloat();
        System.out.print("Quimestre 3: ");
        notaQ3 = scanner.nextFloat();

        float promedio = (notaQ1 + notaQ2 + notaQ3) / 3;

        System.out.println();

        System.out.println("#".repeat(33));
        System.out.printf("# El promedio es: %-13.2f #%n", promedio);
        System.out.println("#".repeat(33));
    }
}
