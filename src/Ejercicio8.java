import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ejercicio8 ejercicio8 = new Ejercicio8();

        System.out.println("#".repeat(33));
        System.out.printf("# %-29s #%n", "Suma usando métodos");
        System.out.println("#".repeat(33));

        System.out.println();
        System.out.print("Ingresa el primer número: ");
        float firstNumber = scanner.nextFloat();
        System.out.print("Ingresa el segundo número: ");
        float secondNumber = scanner.nextFloat();

        System.out.println();
        System.out.println("#".repeat(33));
        System.out.printf(
                "# %9.2f + %.2f = %-9.2f #%n",
                firstNumber, secondNumber,
                ejercicio8.suma(firstNumber, secondNumber)
        );
        System.out.println("#".repeat(33));
    }

    public float suma(float a, float b) {
        return a + b;
    }
}
