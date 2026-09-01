import java.util.ArrayList;
import java.util.Scanner;

class Empleado {
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return nombre + " - $" + salario;
    }
}

public class PromedioSalarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<>();
        String continuar;

        System.out.println("Registro de empleados");

        do {
            System.out.print("\nNombre del empleado: ");
            String nombre = scanner.nextLine();

            double salario = 0;
            boolean valido = false;
            while (!valido) {
                System.out.print("Salario: ");
                try {
                    salario = Double.parseDouble(scanner.nextLine());
                    valido = true;
                } catch (NumberFormatException e) {
                    System.out.println("Valor inválido, ingrese un número.");
                }
            }

            empleados.add(new Empleado(nombre, salario));

            System.out.print("\n¿Desea agregar otro empleado? (s/n): ");
            continuar = scanner.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("\nLista de empleados:");
        for (Empleado e : empleados) {
            System.out.println("- " + e);
        }

        if (!empleados.isEmpty()) {
            double suma = 0;
            for (Empleado e : empleados) {
                suma += e.getSalario();
            }
            double promedio = suma / empleados.size();
            System.out.printf("\nPromedio de salarios: $%.2f%n", promedio);
        } else {
            System.out.println("No se registraron empleados.");
        }

        scanner.close();
    }
}