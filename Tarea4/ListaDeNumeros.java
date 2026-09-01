import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Ingrese 10 números enteros:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            int valor = scanner.nextInt();
            numeros.add(valor);
        }

        System.out.println("\nElementos ingresados:");
        for (int num : numeros) {
            System.out.println(num);
        }

        scanner.close();
    }
}