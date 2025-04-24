/*
* Escreva um programa em Java que leia dois números e solicite o tipo de operação a
ser realizada. As operações podem ser: soma, subtração, multiplicação e divisão.
Para realizar os cálculos, programe uma classe que será responsável por realizar o
cálculo e programe uma classe chamada ProgramaCalculadora que será
responsável por executar o programa que solicitará do usuário os dois números
para uma operação que também deve ser informada por ele.
* */

package questao3;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o primeiro número");
        int num1 = scan.nextInt();
        System.out.println("Informe o segundo número");
        int num2 = scan.nextInt();
        System.out.println("Informe a operação");
        String operacao = scan.nextLine();
        int resultado = 0;
        switch (operacao) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
        System.out.println("Resultado: " + resultado);
    }
}
