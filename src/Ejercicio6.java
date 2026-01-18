import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("#".repeat(33));
        System.out.printf("# %-29s #%n", "Temperatura en Fahrenheit");
        System.out.println("#".repeat(33));

        System.out.println();
        System.out.print("Ingrese la temperatura (⁰C): ");
        float temperatura = scanner.nextFloat();
        float fahrenheitTemperature = (temperatura * 1.8f) + 32;

        System.out.println();
        System.out.println("#".repeat(33));
        System.out.printf(
                "# %10.2f ⁰C = %.2f ⁰F %5s#%n",
                temperatura,
                fahrenheitTemperature,
                " "
        );
        System.out.println("#".repeat(33));
    }
}
