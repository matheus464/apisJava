package application.operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = 3 > 7;

        System.out.println(condicao1 && !condicao2);
        System.out.println(condicao1 || condicao2);
        System.out.println(condicao1 ^ condicao2);
        System.out.println(!!condicao1);
        System.out.println(!condicao2);

        System.out.println("tabela verdade E");
        System.out.println(true && true); // true
        System.out.println(true && false );//false
        System.out.println(false && true );//false
        System.out.println(false && false );//false

        System.out.println("\ntabela verdade OU");
        System.out.println( true || false); // true
        System.out.println( false || true); // true
        System.out.println( true || true); //true
        System.out.println( false || false); // false

        System.out.println("\ntabela verdade OU exclusivo");
        System.out.println(true ^ true);//true
        System.out.println(true ^ false);//true
        System.out.println(false ^ true);//false
        System.out.println(false ^ false);//false

        System.out.println("\ntabela verdade Negação !");
        System.out.println(!true);//false
        System.out.println(!false);//true


    }
}
