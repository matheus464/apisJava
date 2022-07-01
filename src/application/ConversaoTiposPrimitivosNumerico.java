package application;

public class ConversaoTiposPrimitivosNumerico {
    public static void main(String[] args) {

        //  Oredm dos tipos para conversão implicita sem casting = byte, short, int, double , long

        //convesrão implicita
        double a = 1;
        System.out.println(a);

        //conversão explicita (casting)
        float d = (float)1.234567;
        System.out.println(d);

        //conversão explicita (casting)
        int c = 340;
        byte b = (byte) c;
        System.out.println(b);

        //conversão explicita (casting)
        double e = 1.99999;
        int f = (int) e;
        System.out.println(f);

    }
}
