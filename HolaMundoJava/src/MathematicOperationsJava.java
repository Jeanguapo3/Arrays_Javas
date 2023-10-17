public class MathematicOperationsJava {

    public static void main(String[] args) {

        double x = 4.0;
        double y = 3;

        //DEVUELVE UN ENTERO HACIA ARRIBA
        System.out.println(Math.ceil(x));
        //DEVUELVE UN ENTERO HACIA ABAJO
        System.out.println(Math.floor(x));
        //DEVUELVE UN NÚMERO ELEVADO A OTRO
        System.out.println(Math.pow(x,y));
        //DEVUELVE EL NÚMERO MAYOR
        System.out.println(Math.max(x,y));
        //DEVUELVE LA RAIZ CUADRADA
        System.out.println(Math.sqrt(y));
        //DUELVE LA BASE ELEVADA AL EXPONENTE
        System.out.println(Math.pow(x,y));

        //AREA DE UN CIRCULO
        //PI * 2
        System.out.println(Math.PI * Math.pow(y,2));

        //AREA DE UNA ESFERA
        //4*PI*R2
        System.out.println((4) * Math.PI * Math.pow(y,2));

        //VOLUMEN DE UNA ESFERA
        //(4/3)*PI * R3
        System.out.println((4 / 3) * Math.PI * Math.pow(y,3));

    }
}
