public class OperadoresDeAsignacion {
    public static void main(String[] args){

        //POSFIJA
        //mario bros tiene 5 vidas
        int lives = 5;

        //sucede algo en el camino y se le debe quitar una vida
        lives = lives -1;
        System.out.println(lives); //4


        lives--;
        System.out.println(lives); //3

        //encontro una vida en el camino
        lives++;
        System.out.println(lives);//4


        //PREFIJA
        //Cuando gana un regalo por reclamar una vida
        int gift = 100 + ++lives; //PREFIJO
        System.out.println(gift);
    }
}
