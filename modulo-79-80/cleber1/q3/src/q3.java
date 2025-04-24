/*
3)Faça um algoritmo utilizando a representação de fluxograma que solicite ao usuário sua
idade e informe se o mesmo já pode tirar carteira de motorista. O usuário somente poderá
tirar a carteira de motorista se a idade for maior que 18 anos.
*/

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe sua idade:");
        int idade = scan.nextInt();

        if (idade < 0) {
            System.out.println("Idade inválida");
        }else if (idade < 18) {
            System.out.println("Você não pode tirar carteira de motorista.");
        }else {
            System.out.println("Você pode tirar carteira de motorista");
        }

        scan.close();
    }
}