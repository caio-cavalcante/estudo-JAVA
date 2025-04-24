import java.util.*;

public class Biblioteca {
    Scanner scanner = new Scanner(System.in);
    Estante estante = new Estante();
    int opcao;

    public void menu() {
        do {
            System.out.println("\nBem-vindo à Biblioteca Virtual!");
            System.out.println("1. Cadastrar novo livro");
            System.out.println("2. Listar itens");
            System.out.println("3. Remover livro");
            System.out.println("4. Buscar livro");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Informe um número!");
                scanner.nextLine();
                continue;
            }

            switch (opcao) {
                case 1:
                    cadastrarLivro();
                    break;
                case 2:
                    estante.listarLivros();
                    break;
                case 3:
                    removerLivro();
                    break;
                case 4:
                    buscarLivro();
                    break;
                case 5:
                    System.out.println("Volte sempre!");
                    break;
                default:
                    System.out.println("Informe uma opção válida!");
                    break;
            }
        } while (opcao != 5);
    }

    private void cadastrarLivro() {
        scanner.nextLine();

        System.out.print("Informe o autor do livro: ");
        String autor = scanner.nextLine();
        System.out.print("Informe o título do livro: ");
        String titulo = scanner.nextLine();

        Livro livro = new Livro(new Autor(autor), titulo);

        estante.add(livro);
    }

    private void removerLivro() {
        scanner.nextLine();

        System.out.print("Informe o título do livro que deseja remover: ");
        String titulo = scanner.nextLine();

        estante.removeTitulo(titulo);
        System.out.println("Livro removido!");
    }

    private void buscarLivro() {
        scanner.nextLine();

        System.out.print("Informe o título do livro que deseja buscar: ");
        String titulo = scanner.nextLine();

        Livro livro = estante.compararTitulo(titulo);

        if (livro!= null) {
            livro.mostrarDetalhes();
        } else {
            System.out.println("Livro não encontrado.");
        }
    }
}
