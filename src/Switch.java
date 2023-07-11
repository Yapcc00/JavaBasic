public class Switch {
    public static void main(String []args){
        int dia = 4;
        String nombreDia;

        switch (dia){
            case 1: nombreDia = "Lunes";

            case 2: nombreDia = "Martes";

            case 3: nombreDia = "Miercoles";

            case 4: nombreDia = "Jueves";

            case 5: nombreDia = "Viernes";
            break;

            case 6: nombreDia = "Sabado";

            case 7: nombreDia = "Domingo";
            break;

            default: nombreDia = "Dia invalido";
        break;
        }
        System.out.println("El dia de la semana es " + nombreDia);
    }
}
