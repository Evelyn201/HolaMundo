public class InvrementDecrement {
    public static void main(String[] args) {
        //postfija
        int lives = 5;
        lives = lives -1;
        System.out.println(lives);//4
        lives--;//decremento
        System.out.println(lives);//3

        lives++;//incremento
        System.out.println(lives);

        //Prefija
        // gana un regalo por ganar una vida
        //int gift = 100 + lives ++; //postfijo
        int gift = 100 + ++lives; //prefijo
        System.out.println(gift);
        System.out.println(lives);//5


    }
}
