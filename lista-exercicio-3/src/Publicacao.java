public class Publicacao {
    public String titulo;
    public String autor;
    public int ano;
    public String genero;
    public String editora;
    public int quantidade;

    public Publicacao(String titulo, String autor, int ano, String genero, String editora, int quantidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.genero = genero;
        this.editora = editora;
        this.quantidade = quantidade;
    }

    public void imprimirDados(){}

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
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
}
