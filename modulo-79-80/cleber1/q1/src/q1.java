/*
1) Construir um algoritmo utilizando a representação de fluxograma para que solicite ao
usuário a quantidade de horas trabalhadas no mês por um operário. Em seguida, calcular e
informar o seu salário sabendo que ele ganha R$ 20,00 por hora.
*/

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a quantidade de horas trabalhadas: ");

        double workHours = scan.nextDouble();
        double sallary = workHours * 20;

        System.out.println("Seu salário é de R$" + sallary);

        scan.close();
    }
}
