import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ejercicio9 ejercicio9 = new Ejercicio9();
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Laptop", 1456.72F, 1));
        productos.add(new Producto("Monitor", 465.99F, 2));
        productos.add(new Producto("Teclado", 63.70F, 1));
        productos.add(new Producto("Mouse", 110.0F, 1));

        int selectedOption;

        System.out.println("-".repeat(33));
        do {
            System.out.printf(" %-24s [%d] \uD83D\uDCE6%n", "Productos", productos.size());
            System.out.println("-".repeat(33));
            System.out.println("1. Agregar producto");
            System.out.println("2. Calcular el total");
            System.out.println("-".repeat(33));
            System.out.print("Selecciona una opción: ");
            selectedOption = scanner.nextInt();

            if (selectedOption == 1) {
                ejercicio9.agregarProducto(productos, scanner);
            }
            if (selectedOption == 2) {
                ejercicio9.mostrarTotal(productos);
            }
        } while (selectedOption != 2);
    }

    private void agregarProducto(ArrayList<Producto> productos, Scanner scanner) {
        System.out.println("-".repeat(33));
        System.out.println("Agregar producto");
        System.out.println("-".repeat(33));
        System.out.print("Nombre: ");
        String nombre = scanner.next();
        System.out.print("Precio unitario: ");
        double precio = scanner.nextDouble();
        System.out.print("Cantidad: ");
        int cantidad = scanner.nextInt();
        System.out.println("-".repeat(33));

        productos.add(new Producto(nombre, precio, cantidad));
    }

    private void mostrarTotal(ArrayList<Producto> productos) {
        double total = 0;
        System.out.println("-".repeat(60));
        System.out.printf(
                "| %-18s | %10s | %8s | %10s |%n",
                "Producto",
                "Precio U",
                "Cantidad",
                "Total"
        );
        System.out.println("-".repeat(60));
        for (Producto producto : productos) {
            double productTotal = producto.precio * producto.cantidad;
            total += productTotal;
            System.out.printf(
                    "| %-18s | %9.2f$ | %8d | %9.2f$ |%n",
                    producto.nombre,
                    producto.precio,
                    producto.cantidad,
                    productTotal
            );
        }
        System.out.println("-".repeat(60));
        System.out.printf("| %42s | %9.2f$ |%n", "TOTAL A PAGAR", total);
    }
}

class Producto {
    String nombre;
    double precio;
    int cantidad;

    Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
}
