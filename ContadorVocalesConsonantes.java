
import java.util.Scanner;

public class ContadorVocalesConsonantes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra en minúsculas, sin símbolos, caracteres especiales, acentos ni números:");
        String palabra = scanner.nextLine();

        if (esPalabraValida(palabra)) {
            int[] conteo = contarVocalesConsonantes(palabra);
            System.out.println("Número de vocales: " + conteo[0]);
            System.out.println("Número de consonantes: " + conteo[1]);
        } else {
            System.out.println("La palabra ingresada no es válida. Por favor, siga las instrucciones.");
        }
        scanner.close();
    }

    // Método para verificar si la palabra cumple con las condiciones
    public static boolean esPalabraValida(String palabra) {
        return palabra.matches("[a-z]+");
    }

    // Método para contar vocales y consonantes
    public static int[] contarVocalesConsonantes(String palabra) {
        int vocales = 0;
        int consonantes = 0;
        String vocalesStr = "aeiou";

        for (char letra : palabra.toCharArray()) {
            if (vocalesStr.contains(String.valueOf(letra))) {
                vocales++;
            } else {
                consonantes++;
            }
        }
        return new int[]{vocales, consonantes};
    }
}