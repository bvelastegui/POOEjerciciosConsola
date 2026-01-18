import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ejercicio4 ejercicio4 = new Ejercicio4();

        System.out.println("#".repeat(33));
        System.out.printf("# %-29s #%n", "Calcula tu salario");
        System.out.println("#".repeat(33));

        System.out.println();
        System.out.print("Ingresa las horas trabajadas: ");
        int workedHours = scanner.nextInt();
        System.out.print("Ingresa el salario por hora: ");
        float salaryPerHour = scanner.nextFloat();

        System.out.println();
        ejercicio4.printCalculatedSalary(workedHours, salaryPerHour);
    }

    public void printCalculatedSalary(int workedHours, float salaryPerHour) {
        System.out.println("#".repeat(33));
        System.out.printf("# Tu salario es: %-15.2f#%n", (workedHours * salaryPerHour));
        System.out.println("#".repeat(33));
    }
}
