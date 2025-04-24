/*
11) Faça um algoritmo utilizando a representação de fluxograma que solicite ao usuário dois
valores numéricos. Em seguida o algoritmo deverá efetuar a soma dos dois valores e caso o
resultado seja maior ou igual a 10, deve-se ser somado a 5 caso contrário o valor do resultado
deverá ser subtraído de 7. Após a obtenção do resultado apresente essa informação para o
usuário.
 */

import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro valor:");
        double numA = scan.nextDouble();

        System.out.println("Informe o segundo valor:");
        double numB = scan.nextDouble();

        double soma = numA + numB;

        if (soma >= 10) {
            soma = soma + 5;
            System.out.println("O novo resultado é " + soma);
        } else {
            soma = soma - 7;
            System.out.println("O novo resultado é " + soma);
        }

        scan.close();
    }
}