public class While {
    public static void main(String[] args){
        int cont = 0;

        boolean centinela =true;

        while  (cont <= 10){
            System.out.println("Estoy en la vuelta " + cont);
            cont = cont +1 ;
        }

        while(centinela == true){
            System.out.println("El valor de la bandera es " + centinela);

            //cerrando el bucle
            centinela = false;
        }
    }
}
