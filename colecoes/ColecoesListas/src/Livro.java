public class Livro {
    private String isbn;
    private String autor;
    private String editora;
    private String titulo;

    public Livro(String isbn, String autor, String editora, String titulo) {
        this.isbn = isbn;
        this.autor = autor;
        this.editora = editora;
        this.titulo = titulo;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public String getAutor() {
        return this.autor;
    }

    public String getEditora() {
        return this.editora;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String toString() {
        return "Livro{ISBN='" + this.isbn + "', Autor='" + this.autor + "', Editora='" + this.editora + "', Título='" + this.titulo + "'}";
    }
}
