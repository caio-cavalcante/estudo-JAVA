public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro("isbn", "Autor 1", "ABC", "Livro 1");
        Livro livro2 = new Livro("isbn", "Autor 2", "ABC", "Livro 2");
        Livro livro3 = new Livro("isbn", "Autor 3", "ABC", "Livro 3");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        biblioteca.removerLivro(livro1);

        biblioteca.imprimirLista();

        biblioteca.existeLivro(livro1);

        biblioteca.obterLivro(livro2);

        biblioteca.listaVazia();
    }
}