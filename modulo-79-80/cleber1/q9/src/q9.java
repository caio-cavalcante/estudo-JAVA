/*
9) Faça um algoritmo utilizando a representação de fluxograma que calcule o salário líquido
de um professor. Para elaborar o programa, é necessário solicitar do usuário alguns dados,
tais como valor da hora aula, número de horas trabalhadas no mês, percentual de desconto do
INSS. Em primeiro, deve-se estabelecer o seu salário bruto para fazer o desconto e ter o valor
do salário líquido.
 */

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor da hora aula:");
        double horaAula = scan.nextDouble();

        System.out.println("Informe a quantidade de horas trabalhadas:");
        double horasTrabalhadas = scan.nextDouble();

        System.out.println("Informe o desconto porcentual do INSS:");
        double descontoInss = scan.nextDouble();

        double salarioBruto = horaAula * horasTrabalhadas;
        double salarioLiquido = salarioBruto * ( 1 - descontoInss/100);

        System.out.printf("Seu salário bruto é de R$%.2f e seu salário líquido é de R$%.2f",salarioBruto, salarioLiquido);

        scan.close();
    }
}
