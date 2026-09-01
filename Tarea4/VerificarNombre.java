import java.util.ArrayList;
import java.util.Scanner;

public class VerificarNombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        String entrada;

        System.out.println("Ingrese nombres (escriba 'fin' para terminar):");

        while (true) {
            System.out.print("> ");
            entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("fin")) {
                break;
            }

            nombres.add(entrada);
        }

        System.out.print("\nIngrese el nombre a buscar: ");
        String buscado = scanner.nextLine();

        if (nombres.contains(buscado)) {
            System.out.println("El nombre \"" + buscado + "\" SÍ existe en la lista.");
        } else {
            System.out.println("El nombre \"" + buscado + "\" NO existe en la lista.");
        }

        scanner.close();
    }
}