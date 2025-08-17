import java.util.Scanner;

public class InvertirCadenaTexto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cadena:"); 
        String cadena = scanner.nextLine();
        String cadenaInvertida = new StringBuilder(cadena).reverse().toString();
        System.out.println("Cadena invertida: " + cadenaInvertida);
        scanner.close();
    }
}