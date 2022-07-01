package application;

public class ConversaoNumeroString {
    public static void main(String[] args) {
        // conversão de numero para string
        Integer num = 10000;
        System.out.println(num.toString().length());

        Integer num1 = 240;
        System.out.println(num1.toString().length());

        int num2 = 100000;
        System.out.println(Integer.toString(num2).length());

        int num3 = 1200;
        System.out.println(Integer.toString(num3).length());

        int num4 = 12;
        System.out.println(Integer.toString(num4).length());

        System.out.println(("" + num1).length());
        System.out.println(("" + num2).length());
    }
}
