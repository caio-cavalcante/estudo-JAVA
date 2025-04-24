/*
10) Faça um algoritmo utilizando a representação de fluxograma que solicite ao usuário dois
valores numéricos. Em seguida o algoritmo deverá efetuar a soma dos dois valores e
apresentar o resultado caso seja maior que 10.
 */

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro valor:");
        double numA = scan.nextDouble();

        System.out.println("Informe o segundo valor:");
        double numB = scan.nextDouble();

        double soma = numA + numB;

        if (soma > 10) {
            System.out.println("O resultado " + soma + " é maior que 10.");
        } else {
            System.out.println("O resultado " + soma + " é menor que 10.");
        }

        scan.close();
    }
}
