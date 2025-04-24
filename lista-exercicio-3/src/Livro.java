public class Livro extends Publicacao{
    private int edicao;
    private int isbn;

    public Livro(String titulo, String autor, int ano, String genero, String editora, int quantidade, int edicao, int isbn) {
        super(titulo, autor, ano, genero, editora, quantidade);
        this.edicao = edicao;
        this.isbn = isbn;
    }

    public void imprimirDados(){
        super.imprimirDados();
        System.out.println("Livro: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
        System.out.println("Gênero: " + genero);
        System.out.println("Editora: " + editora);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Edição: " + edicao);
        System.out.println("ISBN: " + isbn);
    }

}
