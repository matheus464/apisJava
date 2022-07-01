package application;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Informe o primeiro salario: ");
        String salario1 = entrada.next().replace(",", ".");

        System.out.print("Informe o segundo salario: ");
        String salario2 = entrada.next().replace(",", ".");

        System.out.print("Informe o segundo salario: ");
        String salario3 = entrada.next().replace(",", ".");

        double sal1 = Double.parseDouble(salario1);
        double sal2 = Double.parseDouble(salario2);
        double sal3 = Double.parseDouble(salario3);
        double soma = (sal1 + sal2 + sal3) / 3;

        System.out.printf("o salário em média é: R$%.3f ", soma);

        entrada.close();

    }
}
