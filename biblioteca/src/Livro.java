public class Livro extends ItemBiblioteca {
    private Autor autor;
    private Categoria categoria;
    private String titulo;

    public Livro(Autor autor, String titulo) {
        super(titulo);
        this.autor = autor;
        this.categoria = new Categoria("Indefinido");
    }

    public Livro(Autor autor, Categoria categoria, String titulo) {
        super(titulo);
        this.autor = autor;
        this.categoria = categoria;
    }

    @Override
    public void mostrarDetalhes() {
        this.toString();
    }

    @Override
    public String toString() {
        return "Livro: " + super.getTitulo() + ", Autor: "  +  autor + ", Categoria: " + categoria;
    }
}
