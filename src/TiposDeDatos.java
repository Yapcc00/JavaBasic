public class TiposDeDatos {
    public static void main(String[] args){
        //tipo  de dato int = 4 bytes;
        int n = 1234567899;

        //tipo de dato long = 8 bytes
        long nL = 6546498498415L;

        //Tippo de dato double
        double nD = 123.12354;

        //Tipo de dato float
        float nF = 132.123F;

        var salary = 1000; //int
        //Pension 3%
        var pension = salary*0.03; //double
        var totalSalary =  salary - pension;


        System.out.println(pension);
        System.out.println(salary);
        System.out.println(totalSalary);

        var emplyeeName = "Yeison Cordoba";
        System.out.println("El empleado es " + emplyeeName + " Salario total es: " + totalSalary);



    }
}
