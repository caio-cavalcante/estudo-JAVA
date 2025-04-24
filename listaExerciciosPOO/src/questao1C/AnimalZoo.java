/*
Sabendo que um Animal para o sistema de cadastro do Jardim Zoológico
possui as seguintes características: Espécie, Data de Nascimento, Nome,
Número de Registro e Local de Nascimento. O objeto possui os seguintes
comportamentos: (i) cadastrar e alterar que recebem como parâmetro as
características do Animal; (ii) outro comportamento desse objeto é a
capacidade de imprimir as informações armazenadas nas suas
características.
*/

package questao1C;

import java.util.Scanner;

public class AnimalZoo {
    private String especie;
    private String dataNascimento;
    private String nome;
    private int numeroRegistro;
    private String localNascimento;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        AnimalZoo animal1 = new AnimalZoo();
        AnimalZoo animal2 = new AnimalZoo();

        animal1.cadastrar();
        animal2.cadastrar();
        animal1.listar();
        animal2.alterar();
        animal1.listar();
        animal2.listar();

        scan.close();
    }

    public void cadastrar() {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nInforme a espécie");
        especie = scan.nextLine();
        System.out.println("Informe a data de nascimento");
        dataNascimento = scan.nextLine();
        System.out.println("Informe o nome");
        nome = scan.nextLine();
        System.out.println("Informe o número de registro");
        numeroRegistro = scan.nextInt();
        System.out.println("Informe o local de nascimento");
        localNascimento = scan.nextLine();
    }

    public void listar() {
        System.out.println("\nEspécie: " + especie);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Nome: " + nome);
        System.out.println("Número de registro: " + numeroRegistro);
        System.out.println("Local de nascimento: " + localNascimento);
    }

    public void alterar() {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nInforme qual valor deseja alterar:");
        System.out.println("1 - Espécie");
        System.out.println("2 - Data de nascimento");
        System.out.println("3 - Nome");
        System.out.println("4 - Número de registro");
        System.out.println("5 - Local de nascimento");

        int opcao = scan.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Informe a nova espécie");
                especie = scan.nextLine();
                break;
            case 2:
                System.out.println("Informe a nova data de nascimento");
                dataNascimento = scan.nextLine();
                break;
            case 3:
                System.out.println("Informe o novo nome");
                nome = scan.nextLine();
                break;
            case 4:
                System.out.println("Informe o novo número de registro");
                numeroRegistro = scan.nextInt();
                break;
            case 5:
                System.out.println("Informe o novo local de nascimento");
                localNascimento = scan.nextLine();
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
