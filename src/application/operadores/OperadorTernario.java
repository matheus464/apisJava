package application.operadores;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
         double media = 5.6;
         String resultado = media >= 7.0 ? "Aprovado" : "Recuperação";
         System.out.println("O Aluno está: " + resultado);


         double nota = 9.0;
         boolean bomComportamento = false;
         boolean passouPorMedia = nota >= 7.0;
         boolean temDesconto = bomComportamento && passouPorMedia;
         String resultado1 = temDesconto ? "Sim": "Não";

        System.out.printf("Tem desconto ? %s", resultado1);


    }
}
