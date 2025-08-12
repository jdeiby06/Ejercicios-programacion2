# Ejercicios-programacion
Este repositorio contiene los ejercicios de programacion en java del taller de nivelacion.

### Contenido
- Respuestas a las preguntas de GIT y Porgramacion
- Calculadora Basica
- Contador de Vocales y Consonantes
- Invertir una Cadena

### Instrucciones

1. Clona el Repositorio.
2. Navega a cada directorio de ejercicios.
3. Compila y ejecuta los archivos '.java' para probar ejercicios.

### Calculadora basica 
import java.util.Scanner;
public class Main { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double num2 = scanner.nextDouble();

        System.out.println("Seleccione la operación (+, -, *, /):");
        char operacion = scanner.next().charAt(0);

        double resultado = 0;

        switch (operacion) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                    return; // Salir del programa si hay división por cero
                }
                break;
            default:
                System.out.println("Operación no válida.");
                return; // Salir del programa si la operación no es válida
        }

        System.out.println("El resultado es: " + resultado);
        scanner.close();
    }
}
