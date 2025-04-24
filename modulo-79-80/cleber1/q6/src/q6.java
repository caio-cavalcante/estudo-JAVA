/*
6) Faça um algoritmo utilizando a representação de fluxograma que solicite ao usuário as
notas de 2 provas e um trabalho e que seja capaz de calcular a média aritmética. Caso a média
final seja maior ou igual a 7 mostre a mensagem “aprovado”, caso contrario, imprimir a
mensagem reprovado”.
 */

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a primeira nota:");
        double nota1 = scan.nextDouble();

        System.out.println("Informe a segunda nota:");
        double nota2 = scan.nextDouble();

        System.out.println("Informe a nota do trabalho:");
        double nota3 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println("Você está aprovado!");
        } else {
            System.out.println("Você está reprovado.");
        }

        scan.close();
    }
}
