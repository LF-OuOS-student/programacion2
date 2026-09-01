import java.util.ArrayList;
import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> calificaciones = new ArrayList<>();
        String entrada;

        System.out.println("Ingrese las calificaciones (escriba 'fin' para terminar):");

        while (true) {
            System.out.print("> ");
            entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("fin")) {
                break;
            }

            try {
                double nota = Double.parseDouble(entrada);
                calificaciones.add(nota);
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido, ingrese un número.");
            }
        }

        if (calificaciones.isEmpty()) {
            System.out.println("\nNo se ingresó ninguna calificación.");
        } else {
            System.out.println("\nCalificaciones ingresadas:");
            double suma = 0;
            for (double nota : calificaciones) {
                System.out.println(nota);
                suma += nota;
            }

            double promedio = suma / calificaciones.size();
            System.out.printf("\nPromedio: %.2f%n", promedio);
        }

        scanner.close();
    }
}