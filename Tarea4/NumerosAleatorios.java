import java.util.ArrayList;
import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int numero = random.nextInt(100);
            numeros.add(numero);
        }

        System.out.println("Números aleatorios generados:");
        for (int num : numeros) {
            System.out.println(num);
        }
    }
}