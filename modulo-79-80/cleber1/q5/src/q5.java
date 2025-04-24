/*
5) Faça um algoritmo utilizando a representação de fluxograma que solicite ao usuário 2
números diferentes e mostre o maior deles.
 */

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        double numA = scan.nextDouble();

        System.out.println("Informe o primeiro segundo:");
        double numB = scan.nextDouble();

        if (numA > numB){
            System.out.println("O primeiro número é maior que o segundo.");
        } else if (numB > numA) {
            System.out.println("O segundo número é maior que o primeiro.");
        } else {
            System.out.println("Os números são iguais.");
        }
        scan.close();
    }
}