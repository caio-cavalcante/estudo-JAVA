import java.util.Scanner;

public class CadastroUsuario {
    public static void main(String[] args) throws Usuario.IdadeInvalidaException, Usuario.NomeInvalidoException {
        Usuario usuario = new Usuario();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um nome: ");
        usuario.setNome(scanner.nextLine());

        System.out.println("Informe uma idade: ");
        usuario.setIdade(scanner.nextInt());
    }
}
