package application;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {

        System.out.print("Bom");
        System.out.print(" Dia!!\n");

        System.out.println("Bom");
        System.out.println("dia!!");

        System.out.printf("Salario: %.2f\n", 123.45);
        System.out.printf("Megasena: %d %d %d %d \n", 1,2,3,4);

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.printf("%s tem %d anos de idade ", nome, idade);

        entrada.close();

    }
}
