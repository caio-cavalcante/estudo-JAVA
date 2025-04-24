public class Livro extends Publicacao{
    private int edicao;
    private String isbn;

    public int getEdicao() {
        return edicao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void publicacao(String titulo, String autor, int ano, String genero, String editora, int quantidade, int edicao, String isbn) {
        super.publicacao(titulo, autor, ano, genero, editora, quantidade);
        this.edicao = edicao;
        this.isbn = isbn;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Edição: " + edicao + ".");
        System.out.println("ISBN: " + isbn + ".");
    }
}
