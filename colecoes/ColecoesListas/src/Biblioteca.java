import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        livros = new ArrayList<Livro>();
    }

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
        System.out.println("Livro adicionado!");
    }

    public void removerLivro(Livro livro) {
        this.livros.remove(livro);
        System.out.println("Livro removido!");
    }

    public void imprimirLista() {
        if (this.livros.isEmpty()) {
            System.out.println("A lista está vazia.");
        } else {
            for (Livro livro : livros) {
                System.out.println(livro.toString());
            }
        }

    }

    public void existeLivro(Livro livro) {
        if (this.livros.contains(livro)) {
            System.out.println("O livro existe.");
        } else {
            System.out.println("O livro não existe.");
        }

    }

    public Livro obterLivro(Livro livro) {
        if (this.livros.contains(livro)) {
            return livros.get(this.livros.indexOf(livro));
        } else {
            System.out.println("O livro não existe.");
            return null;
        }
    }

    public void listaVazia() {
        if (this.livros.isEmpty()) {
            System.out.println("A lista está vazia.");
        } else {
            System.out.println("A lista não está vazia.");
        }

    }
}

