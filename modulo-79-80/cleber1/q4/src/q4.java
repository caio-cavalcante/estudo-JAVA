/*
4) Faça um algoritmo utilizando a representação de fluxograma para ler a temperatura do
corpo medida com um termômetro. Caso a temperatura seja maior que 37 graus o paciente
está com febre, caso contrário, sua temperatura está normal. Após ler a temperatura mostre a
mensagem apropriada.
*/

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe sua temperatura corporal:");
        double temperatura = scan.nextDouble();

        if (temperatura < 35) {
            System.out.println("Você está com hipotermia.");
        } else if (temperatura > 37) {
            System.out.println("Você está com febre.");
        } else {
            System.out.println("Sua temperatura está normal.");
        }

        scan.close();
    }
}
