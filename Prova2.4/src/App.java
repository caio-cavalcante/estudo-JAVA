import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        System.out.print("Informe o primeiro nome: ");
        pessoa1.setNome(scanner.nextLine());
        System.out.print("Informe a primeira idade: ");
        pessoa1.setIdade(scanner.nextInt());

        scanner.nextLine();

        System.out.print("Informe o segundo nome: ");
        pessoa2.setNome(scanner.nextLine());
        System.out.print("Informe a segunda idade: ");
        pessoa2.setIdade(scanner.nextInt());

        pessoa1.compareTo(pessoa2);
    }
}
