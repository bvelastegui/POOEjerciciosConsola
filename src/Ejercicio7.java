import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ejercicio7 ejercicio7 = new Ejercicio7();

        System.out.println("#".repeat(33));
        System.out.printf("# %-29s #%n", "Verificación de edad");
        System.out.println("#".repeat(33));

        System.out.println();
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        System.out.println();
        System.out.println("#".repeat(33));
        System.out.printf("# %-29s #%n", ejercicio7.verificarEdad(edad));
        System.out.println("#".repeat(33));
    }

    public String verificarEdad(int edad) {
        if (edad >= 18) {
            return "Mayor de edad";
        }

        return "Menor de edad";
    }
}
