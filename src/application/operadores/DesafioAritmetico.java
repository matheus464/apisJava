package application.operadores;

import java.util.Scanner;

public class DesafioAritmetico {
    public static void main(String[] args) {

        /*int x = 4 * 3 -10;
        int a = (int) Math.pow(x, 3);
        System.out.println(a);*/

        /*
        É possivel utilizar o Math.pow(calculo, potenciação)*/
        int x = 6;
        int y = 3;
        int a = 2;

        int b = 1;
        int c = 5;
        int d = 7;
        int e = 10;

        int calculo1 = x * (y+a);
        double calculo2 = Math.pow(calculo1, 2);
        double calculo3 = calculo2 / (y * a);

        int calculo4 = (b - c) * (a - d) / 2;
        int calculo5 = (int) Math.pow(calculo4, 2);

        int soma = (int) (calculo3 - calculo5);
        double resultadoFinal =  Math.pow(soma, 3) / Math.pow(e, 3);

    }
}
