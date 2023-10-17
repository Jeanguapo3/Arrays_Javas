public class Casting {

    public static void main(String[] args) {

        //EN UN AÑO UBICAR 30 PERRITOS
        //CUANTOS PERRITOS UBIQUE AL MES


        double mountlyDogs = 30.0/12.0;
        System.out.println(mountlyDogs);

        //ESTIMACIÓN
        //castea el número double y lo pone un número entero
        int estimatedMonthlyDogs = (int) mountlyDogs;
        System.out.println(estimatedMonthlyDogs);

        //EXACTITUTD
        int a = 30;
        int b = 12;
        System.out.println((double) a/b);

        double c = (double) a/b;
        System.out.println(c);

        char n = '1';
        int nI = n;
        System.out.println(nI);
        //CORRESPONDE A LA TABLA ASCII

        //CASTING EN EL TAMAÑO DE DATO
        short nS = (short) n;
        System.out.println(nS);

    }
}

