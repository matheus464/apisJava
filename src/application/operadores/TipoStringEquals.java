package application.operadores;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class TipoStringEquals {
    public static void main(String[] args) {

        System.out.println("2" == "2");



        String s = new String("4");
        System.out.println("4".equals(s.length()));



        Scanner entrada = new Scanner(System.in);

        String s2 = entrada.next();
        System.out.println("2" == s2.trim());
        System.out.println("2".equals(s2.trim()));


        entrada.close();
    }
}
