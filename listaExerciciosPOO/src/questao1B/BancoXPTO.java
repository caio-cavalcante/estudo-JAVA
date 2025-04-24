/*
b. Sabendo que uma Conta Poupança para o Banco XPTO possui as seguintes
informações: Nome do Correntista, RG, CPF, saldo, número, agência. O
objeto possui os seguintes comportamentos: (i) cadastrar e alterar que
recebem como parâmetro as características da Conta Poupança; (ii)
Imprimir Saldo - que é responsável por imprimir o Saldo do Correntista.
*/

package questao1B;

import java.util.Scanner;

public class BancoXPTO {
    private String nome;
    private long rg;
    private long cpf;
    private double saldo;
    private int numConta;
    private int agencia;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BancoXPTO banco1 = new BancoXPTO();
        BancoXPTO banco2 = new BancoXPTO();

        banco1.cadastrar();
        banco1.imprimirSaldo();
        banco1.alterar();
        banco2.cadastrar();
        banco1.listar();
        banco2.listar();

        scan.close();
    }

    public void cadastrar() {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nInforme o nome");
        nome = scan.nextLine();
        System.out.println("Informe o RG");
        rg = scan.nextLong();
        System.out.println("Informe o CPF");
        cpf = scan.nextLong();
        System.out.println("Informe o saldo");
        saldo = scan.nextDouble();
        System.out.println("Informe o número da conta");
        numConta = scan.nextInt();
        System.out.println("Informe a agência");
        agencia = scan.nextInt();
    }

    public void imprimirSaldo() {
        System.out.println("\nSaldo: " + saldo);
    }

    public void listar() {
        System.out.println("\nNome: " + nome);
        System.out.println("RG: " + rg);
        System.out.println("CPF: " + cpf);
        System.out.println("Saldo: " + saldo);
        System.out.println("Número da conta: " + numConta);
        System.out.println("Agência: " + agencia);
    }

    public void alterar() {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nInforme qual valor deseja alterar:");
        System.out.println("1 - Nome");
        System.out.println("2 - RG");
        System.out.println("3 - CPF");
        System.out.println("4 - Saldo");
        System.out.println("5 - Número da conta");
        System.out.println("6 - Agência");

        int opcao = scan.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Informe o novo nome");
                nome = scan.nextLine();
                break;
            case 2:
                System.out.println("Informe o novo RG");
                rg = scan.nextLong();
                break;
            case 3:
                System.out.println("Informe o novo CPF");
                cpf = scan.nextLong();
                break;
            case 4:
                System.out.println("Informe o novo saldo");
                saldo = scan.nextDouble();
                break;
            case 5:
                System.out.println("Informe o novo número da conta");
                numConta = scan.nextInt();
                break;
            case 6:
                System.out.println("Informe a nova agência");
                agencia = scan.nextInt();
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}

