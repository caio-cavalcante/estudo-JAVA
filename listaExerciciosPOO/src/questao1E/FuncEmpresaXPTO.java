/*
* Sabendo que um Funcionário para o sistema de cadastro da Empresa XPTO
S.A. possui as seguintes características: nome, data de nascimento, RG,
CPF, endereço, naturalidade (Local de nascimento), salário, profissão, grau
de instrução e matrícula. O Funcionário possui os seguintes
* comportamentos: (i) cadastrar e alterar que recebem como parâmetro as
características do Funcionário; (ii) Imprimir dados do Funcionário;
* */

package questao1E;
import java.util.Scanner;

public class FuncEmpresaXPTO {
    private String nome;
    private String dataNasc;
    private String rg;
    private String cpf;
    private String endereco;
    private String naturalidade;
    private String salario;
    private String profissao;
    private String grauInstrucao;
    private String matricula;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        FuncEmpresaXPTO funcionario1 = new FuncEmpresaXPTO();
        FuncEmpresaXPTO funcionario2 = new FuncEmpresaXPTO();

        funcionario1.cadastrar();
        funcionario2.cadastrar();
        funcionario1.alterar();
        funcionario1.listar();
        funcionario2.listar();

        scan.close();
    }

    public void cadastrar() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o nome");
        nome = scan.nextLine();
        System.out.println("Informe a data de nascimento");
        dataNasc = scan.nextLine();
        System.out.println("Informe o RG");
        rg = scan.nextLine();
        System.out.println("Informe o CPF");
        cpf = scan.nextLine();
        System.out.println("Informe o endereço");
        endereco = scan.nextLine();
        System.out.println("Informe a naturalidade");
        naturalidade = scan.nextLine();
        System.out.println("Informe o salário");
        salario = scan.nextLine();
        System.out.println("Informe a profissão");
        profissao = scan.nextLine();
        System.out.println("Informe o grau de instrução");
    }

    public void alterar() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe qual valor deseja alterar");
        System.out.println("1 - Nome");
        System.out.println("2 - Data de Nascimento");
        System.out.println("3 - RG");
        System.out.println("4 - CPF");
        System.out.println("5 - Endereço");
        System.out.println("6 - Naturalidade");
        System.out.println("7 - Salário");
        System.out.println("8 - Profissão");
        System.out.println("9 - Grau de Instrução");
        System.out.println("10 - Matrícula");

        int opcao = scan.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Informe o novo nome");
                nome = scan.nextLine();
                break;
            case 2:
                System.out.println("Informe a nova data de nascimento");
                dataNasc = scan.nextLine();
                break;
            case 3:
                System.out.println("Informe o novo RG");
                rg = scan.nextLine();
                break;
            case 4:
                System.out.println("Informe o novo CPF");
                cpf = scan.nextLine();
                break;
            case 5:
                System.out.println("Informe o novo endereço");
                endereco = scan.nextLine();
                break;
            case 6:
                System.out.println("Informe a nova naturalidade");
                naturalidade = scan.nextLine();
                break;
            case 7:
        }
    }

    public void listar() {
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNasc);
        System.out.println("RG: " + rg);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
        System.out.println("Naturalidade: " + naturalidade);
        System.out.println("Salário: " + salario);
        System.out.println("Profissão: " + profissao);
        System.out.println("Grau de Instrução: " + grauInstrucao);
        System.out.println("Matrícula: " + matricula);
    }
}
