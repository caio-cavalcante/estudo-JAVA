public class Filme extends Publicacao{
    private String diretor;
    private String atorPrincipal;
    private String sinopse;
    private int tempo;

    public Filme(String titulo, String autor, int ano, String genero, String editora, int quantidade, String diretor, String atorPrincipal, String sinopse, int tempo) {
        super(titulo, autor, ano, genero, editora, quantidade);
        this.diretor = diretor;
        this.atorPrincipal = atorPrincipal;
        this.sinopse = sinopse;
        this.tempo = tempo;
    }

    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Livro: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
        System.out.println("Gênero: " + genero);
        System.out.println("Editora: " + editora);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Diretor: " + diretor);
        System.out.println("Ator Principal: " + atorPrincipal);
        System.out.println("Sinopse: " + sinopse);
        System.out.println("Duração: " + tempo + " minutos");
    }

}
