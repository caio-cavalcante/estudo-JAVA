import java.sql.SQLOutput;

public class Publicacao {
    String titulo;
    String autor;
    int ano;
    String genero;
    String editora;
    int quantidade;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return ano;
    }

    public String getGenero() {
        return genero;
    }

    public String getEditora() {
        return editora;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void publicacao(String titulo, String autor, int ano, String genero, String editora, int quantidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.genero = genero;
        this.editora = editora;
        this.quantidade = quantidade;
    }

    public void imprimir() {
        System.out.println("Título: " + titulo + ".");
        System.out.println("Autor: " + autor + ".");
        System.out.println("Ano: " + ano + ".");
        System.out.println("Genero: " + genero + ".");
        System.out.println("Editora: " + editora + ".");
        System.out.println("Quantidade: " + quantidade + ".");
    }
}
