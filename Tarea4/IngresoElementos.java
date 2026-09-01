import java.util.ArrayList;
import java.util.Scanner;

public class IngresoElementos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> elementos = new ArrayList<>();
        String entrada;

        System.out.println("Ingrese elementos (escriba 'fin' para terminar):");

        while (true) {
            System.out.print("> ");
            entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("fin")) {
                break;
            }

            elementos.add(entrada);
        }

        System.out.println("\nElementos ingresados (" + elementos.size() + "):");
        for (String e : elementos) {
            System.out.println("- " + e);
        }

        scanner.close();
    }
}