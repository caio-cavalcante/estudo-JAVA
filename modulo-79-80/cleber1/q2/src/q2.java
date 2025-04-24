/*
2) Construa um algoritmo utilizando a representação de fluxograma que calcule e informe a
quantidade de gasolina que será preciso colocar no carro e quanto irá custar para o seu dono ir
até a sua fazenda. O usuário deverá informar a distância que será percorrida e o preço do litro
da gasolina. Para o cálculo, sabe-se que o carro faz em média 12 km/litro.
*/

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a distância a ser percorrida:");
        double distance = scan.nextDouble();

        System.out.println("Informe o preço do litro da gasolina:");
        double gasPrice = scan.nextDouble();

        double gasLitres = (distance / 12);
        double gasTotalPrice = gasLitres * gasPrice;

        System.out.printf("Serão necessários %.2f litros de gasolina, totalizando R$%.2f", gasLitres, gasTotalPrice);
    }
}
