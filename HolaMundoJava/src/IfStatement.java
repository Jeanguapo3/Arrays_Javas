public class IfStatement {

    public static void main(String[] args) {

        boolean condicionA = true; // verdadero
        boolean condicionB = false; // falso

        boolean condicionC = 2 + 2 == 4; // verdadero
        boolean condicionD = 2 + 2 == 5; // falso

        boolean condicionE = "Pepito" == "Pepito"; // verdadero
        boolean condicionF = "Pepito" == "Pepe"; // falso


//        Para esto debemos usar los operadores lógicos:
//
//        Operadores de equidad:
//
//        Igualdad: ==
//        Desigualdad: !=
//        Operadores Relacionales:
//
//        Menor que: <
//        Mayor que: >
//        Menor o igual que: <=
//        Mayor o igual que: >=
//        Operadores lógicos:
//
//&&: AND (evaluar si dos o más condiciones son verdaderas).
//
//||: OR (evaluar si al menos una de las condiciones es verdadera).
//
//!: NOT (evaluar que la condición NO sea verdadera).
//Recuerda que además de las sentencias IF y ELSE, también podemos usarELSE IF.
//Esta la usamos cuando queremos evaluar alguna condición diferente a la condición delIF`
//pero no exactamente al revés.

        boolean isBluetoothEnabled = false;
        int fileSended = 3;


        if(isBluetoothEnabled){
            //send file
            fileSended++;
            System.out.println("Archivo Enviado");
        }
        else {
            fileSended--;
            System.out.println("Por favor enciende tu Bluetooth, para inciar la transferencia");

        }
    }
}