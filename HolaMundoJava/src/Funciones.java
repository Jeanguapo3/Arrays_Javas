public class Funciones {

    public static void main(String[] args) {

        double y = 3;

        //AREA DE UN CIRCULO
        //PI * 2
        circuleArea(y);

        //AREA DE UNA ESFERA
        //4*PI*R2
        sphereArea(y);

        //VOLUMEN DE UNA ESFERA
        //(4/3)*PI * R3
        shpereVolumen(y);

        System.out.println("Pesos a dolares: " + converDolar(1000, "COP"));


    }


    public static double circuleArea(double r){

        return Math.PI * Math.pow(r,2);

    }
    public static double sphereArea(double r){

        return (4) * Math.PI * Math.pow(r,2);

    }
    public static double shpereVolumen(double r){

        return (4 / 3) * Math.PI * Math.pow(r,3);

    }

    /**
     *
     * Descripción: Función que especificando su moneda entre MXN o COP,
     * convierte una cantidad de dinero en dolares
     * @param currency Cantidad de dinero
     * @param currency Tipo de Moneda: Solo acepta MXN o COP
     * @return quantity Devuelve la cantidad actualiza en Dolares
     */
    public static double converDolar(double quantity, String currency){
        //MXN COP
        switch (currency){
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;

        }
        return quantity;
    }

}
