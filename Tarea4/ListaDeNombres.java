import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeNombres {
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

        System.out.println("\nLista de nombres ingresados:");
        for (String nombre : nombres) {
            System.out.println("- " + nombre);
        }

        scanner.close();
    }
}