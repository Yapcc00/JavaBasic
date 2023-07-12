import java.util.Scanner;

public class ejercicioVector {
    public static void main(String[] args){
        int vector [] = new int [15];
        Scanner teclado = new Scanner(System.in) ;

        //Cargar nuetro vector
        for(int i = 0; i <15;i++){
            System.out.println("Ingrese un umero para el vector");
            vector[i] = teclado.nextInt();
        }

        //Recorrer y contar cuantos numero 3 hay

        int cont = 0;

        for(int i = 0; i<15; i++){
            if(vector[i] == 3){
                cont = cont +1;
            }

        }
        System.out.println("La cantidad de numero 3 que hay en el vextor es: " + cont);
    }

}
