import java.util.Scanner;

public class Matrices {
    public static void main(String[] args){
        //Declaracion
        int matriz [][] = new int [3][3];
        Scanner teclado = new Scanner (System.in);

        //Asignacion (manual)
        for (int f = 0; f<3; f++){
            for(int c = 0; c<3; c++){
                System.out.println("EL VALOR DE LA POSICIONE DE FILA ES: " + f + " COLUMNA ES: " + c);
                matriz[f][c] = teclado.nextInt();
            }
        }

        //Recorrido
        for(int f = 0; f<3; f++ ){
            for (int c = 0; c<3; c++){
                System.out.println("EL VALOR DE LA POSICIONE DE FILA ES: " + f + " COLUMNA ES: " + c);
                System.out.println("Es DE: " + matriz[f][c]);
            }
        }
    }
}
