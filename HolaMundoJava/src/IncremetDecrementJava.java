public class IncremetDecrementJava {

    public static void main(String[] args) {


//                Operadores de asignación:
//
//                +=: a += b es equivalente a a = a + b.
//                -=: a -= b es equivalente a a = a - b.
//                *=: a *= b es equivalente a a = a * b.
//                /=: a /= b es equivalente a a = a / b.
//                %=: a %= b es equivalente a a = a % b.
//
//                Operadores de incremento:
//                ++: i++ es equivalente a i = i + 1.
//                --: i-- es equivalente a i = i - 1.


        int lives = 5;
        lives = lives - 1;
        System.out.println(lives); //4

        lives--; //DECREMENTO
        System.out.println(lives); //3

        lives++; //INCREMENTO
        System.out.println(lives); //4

        //PREFIJA
        //GANA UN REGALO POR GANAR UNA VIDA
        int gift = 100 + lives++; //posfijo
        System.out.println(gift);
        System.out.println(lives); //5

    }

}
