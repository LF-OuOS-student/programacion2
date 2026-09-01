import java.util.ArrayList;
import java.util.Scanner;

public class ControlDeTareas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> pendientes = new ArrayList<>();
        ArrayList<String> completadas = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n===== CONTROL DE TAREAS =====");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Marcar tarea como completada");
            System.out.println("3. Eliminar tarea");
            System.out.println("4. Mostrar tareas pendientes");
            System.out.println("5. Mostrar tareas completadas");
            System.out.println("6. Salir");
            System.out.print("Elija una opción: ");

            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la nueva tarea: ");
                    String tarea = scanner.nextLine();
                    pendientes.add(tarea);
                    System.out.println("Tarea agregada correctamente.");
                    break;

                case 2:
                    if (pendientes.isEmpty()) {
                        System.out.println("No hay tareas pendientes.");
                        break;
                    }
                    mostrarLista(pendientes, "Tareas pendientes");
                    System.out.print("Ingrese el índice de la tarea completada: ");
                    int indiceCompletar = Integer.parseInt(scanner.nextLine());

                    if (indiceCompletar >= 0 && indiceCompletar < pendientes.size()) {
                        String tareaCompletada = pendientes.remove(indiceCompletar);
                        completadas.add(tareaCompletada);
                        System.out.println("Tarea marcada como completada: " + tareaCompletada);
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 3:
                    if (pendientes.isEmpty()) {
                        System.out.println("No hay tareas pendientes para eliminar.");
                        break;
                    }
                    mostrarLista(pendientes, "Tareas pendientes");
                    System.out.print("Ingrese el índice de la tarea a eliminar: ");
                    int indiceEliminar = Integer.parseInt(scanner.nextLine());

                    if (indiceEliminar >= 0 && indiceEliminar < pendientes.size()) {
                        String tareaEliminada = pendientes.remove(indiceEliminar);
                        System.out.println("Se eliminó: " + tareaEliminada);
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 4:
                    mostrarLista(pendientes, "Tareas pendientes");
                    break;

                case 5:
                    mostrarLista(completadas, "Tareas completadas");
                    break;

                case 6:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 6);

        scanner.close();
    }

    // Método para mostrar cualquier lista con índices
    public static void mostrarLista(ArrayList<String> lista, String titulo) {
        if (lista.isEmpty()) {
            System.out.println("La lista de " + titulo.toLowerCase() + " está vacía.");
            return;
        }
        System.out.println("\n" + titulo + ":");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("[" + i + "] " + lista.get(i));
        }
    }
}