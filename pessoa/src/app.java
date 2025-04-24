import java.util.Scanner

public class app {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o nome");
        String nome = scan.next();

        System.out.println("Informe a idade");
        int idade = scan.nextInt();

        Pessoa pessoa = new Pessoa(nome, idade);

        System.out.println("O nome da pessoa é " + pessoa.nome);

        scan.close();
    }
}
