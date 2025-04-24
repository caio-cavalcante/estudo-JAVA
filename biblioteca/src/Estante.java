import java.util.*;

public class Estante {
    private List<Livro> livros;

    public Estante() {
        this.livros = new ArrayList<>();
    }

    public void add(Livro livro) {
        livros.add(livro);
        System.out.println(livro.getTitulo() + " adicionado à estante.");
    }

    public void remove(Livro livro) {
        livros.remove(livro);
        System.out.println(livro.getTitulo() + " removido da estante.");
    }

    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }

    public Livro compararTitulo(String titulo) {
        for (Livro livro : livros) {
            if(livro.getTitulo().equals(titulo)){
                System.out.println("Livro encontrado: " + livro);
                return livro;
            }
            System.out.println("Livro não encontrado.");
        }
        return null;
    }

    public void removeTitulo(String titulo) {
        livros.remove(compararTitulo(titulo));
    }
}
