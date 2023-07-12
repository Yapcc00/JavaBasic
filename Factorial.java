import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        //Añadir el scanner para ingresar el numero
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");

        //Declaracion de variables
        int number = scanner.nextInt();
        int factorial = 1;

        //Recorrer el array para el factorial
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }


        System.out.println("El factorial de " + number + " es: " + factorial);
        scanner.close();
    }
}