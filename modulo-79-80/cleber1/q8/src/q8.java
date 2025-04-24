/*
8) Faça um algoritmo utilizando a representação de fluxograma que calcule a área de uma
circunferência e apresente a medida da área calculada. Sabe-se que para realizar o cálculo da
área de uma circunferência é necessário utilizar a seguinte fórmula: A = Pi*r² . O
valor do Raio será informado pelo usuário.
 */

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double PI = 3.14;

        System.out.println("Informe o raio da circunferência:");
        double raio = scan.nextDouble();

        double area = PI * raio * raio;

        System.out.println("A área da circunferência é " + area);

        scan.close();
    }
}
