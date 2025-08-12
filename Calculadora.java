import java.util.Scanner;
public class Calculadora { 
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese el primer número:");
            double num1 = scanner.nextDouble();
            
            System.out.println("Ingrese el segundo número:");
            double num2 = scanner.nextDouble();
            
            System.out.println("Seleccione la operación (+, -, *, /):");
            char operacion = scanner.next().charAt(0);
            
            double resultado = 0;
            
            switch (operacion) {
                case '+' -> resultado = num1 + num2;
                case '-' -> resultado = num1 - num2;
                case '*' -> resultado = num1 * num2;
                case '/' -> {
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("Error: No se puede dividir por cero.");
                        return; // Salir del programa si hay división por cero
                    }
                }
                default -> {
                    System.out.println("Operación no válida.");
                    return; // Salir del programa si la operación no es válida
                }
            }
            
            System.out.println("El resultado es: " + resultado);
        }
    }
}

