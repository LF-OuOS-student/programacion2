import java.util.ArrayList;
import java.util.Scanner;

public class MenuArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> elementos = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n===== MENÚ =====");
            System.out.println("1. Agregar elemento");
            System.out.println("2. Eliminar elemento por índice");
            System.out.println("3. Mostrar lista");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");

            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el elemento a agregar: ");
                    String elemento = scanner.nextLine();
                    elementos.add(elemento);
                    System.out.println("Elemento agregado correctamente.");
                    break;

                case 2:
                    if (elementos.isEmpty()) {
                        System.out.println("La lista está vacía, no hay nada que eliminar.");
                        break;
                    }
                    mostrarLista(elementos);
                    System.out.print("Ingrese el índice a eliminar: ");
                    int indice = Integer.parseInt(scanner.nextLine());

                    if (indice >= 0 && indice < elementos.size()) {
                        String eliminado = elementos.remove(indice);
                        System.out.println("Se eliminó: " + eliminado);
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 3:
                    mostrarLista(elementos);
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 4);

        scanner.close();
    }

    public static void mostrarLista(ArrayList<String> lista) {
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía.");
            return;
        }
        System.out.println("\nLista actual:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("[" + i + "] " + lista.get(i));
        }
    }
}