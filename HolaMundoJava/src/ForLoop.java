public class ForLoop {
    static boolean isTurnOnLigth = false;

    public static void main(String[] args) {

        turnOnOffLigth();
        for (int i = 1; i <=10; i++) {
            printSOS();
        }
    }
    public static void printSOS(){
        System.out.println(". . . _ _ _ . . .");
    }
    public static boolean turnOnOffLigth(){
        isTurnOnLigth = (isTurnOnLigth)?false:true;
        //Ahorar el codigo
//        if (isTurnOnLigth){
//            isTurnOnLigth = false;
//        }else {
//            isTurnOnLigth = true;
//        }
        return isTurnOnLigth;
    }
}

