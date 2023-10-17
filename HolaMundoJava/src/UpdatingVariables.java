public class UpdatingVariables {

    public static void main(String[] args) {

        int salary = 1000;

        //BONO: $200
        salary = salary + 200;
        System.out.println(salary);

        //PENSIÓN: $50 DESCUENTO

        salary = salary - 50;
        System.out.println(salary);

        //2 HORAS EXTRA: $30 c/u
        //COMIDA: $45

        salary = salary + (30*2) - 45;
        System.out.println(salary);

        //CADENAS DE TEXTO

        String employeeName = "Jean";
        employeeName = employeeName + " Jiménez ";
        System.out.println(employeeName);

        employeeName = "Gerardo " + employeeName;
        System.out.println("Tu nombre es: " + employeeName);



    }

}
