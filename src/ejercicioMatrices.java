import java.util.Scanner;

public class ejercicioMatrices {
    public static void main(String[] args){

        Double matriz [][] = new Double [4][4];
        Scanner teclado = new Scanner(System.in);
        Double suma = 0.0;

        //for para cargar nuestra matriz
        for (int f = 0; f<4; f++ ){
            for (int c =0; c<3; c++){
                System.out.println("Ingree el alumno N•" + f);
                matriz [f][c] = teclado.nextDouble();
                //aqui se hace la logica para la suma de las notas de columna de promedio
                suma += matriz[f][c];
            }
            //se seleciona la fila y la columna donde se realizara el promedio
            matriz[f][3] = suma / 3;
            //para devvolver la suma a 0 al siguiente estudiante
            suma = 0.0;
        }

        //for para recorrer
        for (int f = 0; f<4; f++ ){
            System.out.println("Las notas del alumno N•" + f + " Son: ");
            for (int c =0; c<3; c++){
                System.out.println("Nota N•" + c + " " + matriz[f][c] );
            }
            System.out.println("El promedio de las notas es: " + matriz[f][3]);
            System.out.println("-----------------------------------------------");
        }



    }
}
