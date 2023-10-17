public class Arrays {

    public static void main(String[] args) {

        String[] androidVersions = new String[17];
        int days[] = new int[7];

        String[][] cites = new String[4][2]; //4 * 2 = 8

        /*
         * +------------------------------+
         * |  Country    |  City          |
         * --------------------------------
         * | México      | CDMX           |
         * | México      | Guadalajara    |
         * | Colombia    | Bogotá         |
         * | Colombia    | Medellín       |
         * +------------------------------+
         * */

        int[][][] numbers = new int[2][2][2];
        int[][][][] numbers4 = new int[2][2][2][2];

        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Bannana Pie";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        //Con un for mejor
//
//        for (int i = 0; i <=3; i++) {
//            System.out.println(androidVersions[i]);
//       }

//        //Mucho mejor
//
//        for (int i = 0; i < androidVersions.length ; i++) {
//            System.out.println(androidVersions[i]);
//
//        }
//
//        //Para days
//        for (int i = 0; i < days.length; i++) {
//            System.out.println(days[i]);
//        }


        //foreach anidados
        for (String androidVersion : androidVersions) {

            System.out.println(androidVersion);

        }

        System.out.println(androidVersions[0]);
        System.out.println(androidVersions[1]);
        System.out.println(androidVersions[2]);
        System.out.println(androidVersions[3]);


        System.out.println();
        System.out.println();

        cites[0][0] = "COLOMBIA";
        cites[0][1] = "Medellín";
        cites[1][0] = "Colombia";
        cites[1][1] = "Bogotá";
        cites[2][0] = "México";
        cites[2][1] = "Guadalajara";
        cites[3][0] = "México";
        cites[3][1] = "CDMX";


        System.out.println(cites[0][0]);
        System.out.println(cites[0][1]);
        System.out.println(cites[1][0]);
        System.out.println(cites[1][1]);
        System.out.println(cites[2][0]);
        System.out.println(cites[2][1]);
        System.out.println(cites[3][0]);
        System.out.println(cites[3][1]);

        //Con dos arreglos con dos for dentro de una caja

        for (int i = 0; i < cites.length; i++) {
            for (int j = 0; j < cites[i].length; j++) {
                System.out.println(cites[i][j]);
            }
        }

        //Foreach anidado
        for (String[] cite : cites) {
            for (String name: cite) {
                System.out.println(name);
            }
        }

        String[][][][] animals = new String[2][3][2][2]; //4 * 2 = 8
        animals[1][0][0][1] = "Monkey";

        System.out.println();
        System.out.println();
        System.out.println(animals[1][0][0][1]);

        //for utilizando en una dimension de 4
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <=0 ; j++) {
                for (int k = 0; k <=0 ; k++) {
                    for (int l = 0; l <=1 ; l++) {
                        System.out.println(animals[i][j][k][l]);
                    }
                }
            }
        }

        //Otra froma de hacerlo con un for
        String[][][][][][] mono = new String[2][3][1][2][2][2];
        String monitos = mono[1][0][0][0][0][1] = "MONITO";

        System.out.println();
        System.out.println("ENCONTRE AL " + monitos);
    }
}
