/*
7) Faça um algoritmo utilizando a representação de fluxograma que leia o peso e a altura do
usuário e informa se o mesmo está obeso. Lembre que para saber se uma pessoa está obesa
deve-se utilizar a fórmula: imc = peso/altura2. Caso o resultado do imc seja maior que 30 o
usuário está obeso.
 */

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe sua altura em centímetros:");
        double altura = scan.nextDouble() / 100;

        System.out.println("Informe seu peso em quilos:");
        double peso = scan.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Você está com peso ideal.");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Você está com sobrepeso.");
        } else if (imc >= 30) {
            System.out.println("Você está obeso.");
        }
        
        scan.close();
    }
}

