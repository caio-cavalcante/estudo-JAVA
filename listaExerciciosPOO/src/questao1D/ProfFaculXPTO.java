/*
Sabendo que um Professor para o sistema de cadastro da Faculdade XPTO
possui as seguintes características: nome, titulação, formação, carga horária,
salário e uma descrição das disciplinas que professor pode ensinar. O
Professor possui os seguintes comportamentos: (i) cadastrar e alterar que
recebem como parâmetro as características do Professor; (ii) alterar a
descrição de disciplina ensinada; (iii) Imprimir dados do Professor;
*/

package questao1D;
import java.util.Scanner;

public class ProfFaculXPTO {
    private String nome;
    private String titulacao;
    private String formacao;
    private int cargaHoraria;
    private double salario;
    private String disciplinas;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ProfFaculXPTO prof1 = new ProfFaculXPTO();
        ProfFaculXPTO prof2 = new ProfFaculXPTO();

        prof1.cadastrar();
        prof2.cadastrar();
        prof1.alterar();
        prof1.imprimir();
        prof2.imprimir();
    }

    public void cadastrar() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o nome");
        nome = scan.nextLine();
        System.out.println("Informe a titulação");
        titulacao = scan.nextLine();
        System.out.println("Informe a formação");
        formacao = scan.nextLine();
        System.out.println("Informe a carga horária");
        cargaHoraria = scan.nextInt();
        System.out.println("Informe o salário");
        salario = scan.nextDouble();
        System.out.println("Informe a descrição das disciplinas");
        disciplinas = scan.nextLine();
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Titulação: " + titulacao);
        System.out.println("Formação: " + formacao);
        System.out.println("Carga horária: " + cargaHoraria);
        System.out.println("Salário: " + salario);
        System.out.println("Descrição das disciplinas: " + disciplinas);
    }

    public void alterar() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe qual valor deseja alterar:");
        System.out.println("1 - Nome");
        System.out.println("2 - Titulo");
        System.out.println("3 - Formação");
        System.out.println("4 - Carga horária");
        System.out.println("5 - Salário");
        System.out.println("6 - Descrição");

        int opcao = scan.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Informe o novo nome");
                nome = scan.nextLine();
                break;
            case 2:
                System.out.println("Informe a nova titulação");
                titulacao = scan.nextLine();
                break;
            case 3:
                System.out.println("Informe a nova formação");
                formacao = scan.nextLine();
                break;
            case 4:
                System.out.println("Informe a nova carga horária");
                cargaHoraria = scan.nextInt();
                break;
            case 5:
                System.out.println("Informe o novo salário");
                salario = scan.nextDouble();
                break;
            case 6:
                System.out.println("Informe a nova descrição");
                disciplinas = scan.nextLine();
                break;
            default:
        }
    }
}
