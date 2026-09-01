import java.util.ArrayList;
import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();
        String entrada;

        System.out.println("Ingrese números enteros (escriba 'fin' para terminar):");

        while (true) {
            System.out.print("> ");
            entrada = scanner.nextLine();s

            if (entrada.equalsIgnoreCase("fin")) {
                break;
            }

            try {
                int numero = Integer.parseInt(entrada);
                numeros.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido, ingrese un número entero.");
            }
        }

        // Filtrar los números pares
        for (int num : numeros) {
            if (num % 2 == 0) {
                pares.add(num);
            }
        }

        System.out.println("\nLista completa de números:");
        System.out.println(numeros);

        System.out.println("\nNúmeros pares encontrados:");
        if (pares.isEmpty()) {
            System.out.println("No se encontraron números pares.");
        } else {
            for (int p : pares) {
                System.out.println(p);
            }
        }

        scanner.close();
    }
}