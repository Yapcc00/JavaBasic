import java.util.Scanner;

public class ArraysOVector {
    public static void main(String[] args){
        //Declaracion
            int vector[] = new int [4];

        //Asignacio manual
         Scanner teclado = new Scanner (System.in);
         for(int i = 0; i<vector.length; i++){
        System.out.println("ingrese el valor del indice" + i);
        vector[i] = teclado.nextInt();
    }
        //Recorrido
        for(int i = 0; i<vector.length; i++){
            System.out.println("Estoy en el indice: " + i);
            System.out.println("Tengo guardado: " + vector[i]);
            System.out.println("------------");

        }
    }
}
