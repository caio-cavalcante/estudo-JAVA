public class Filme extends Publicacao{
    private String diretor;
    private String atorPrincipal;
    private String sinopse;
    private int duracao;

    public String getDiretor() {
        return diretor;
    }

    public String getAtorPrincipal() {
        return atorPrincipal;
    }

    public String getSinopse() {
        return sinopse;
    }

    public int getDuracao() {
        return duracao;
    }

    public void publicacao(String titulo, String autor, int ano, String genero, String editora, int quantidade, String diretor, String atorPrincipal, String sinopse, int duracao) {
        super.publicacao(titulo, autor, ano, genero, editora, quantidade);
        this.diretor = diretor;
        this.atorPrincipal = atorPrincipal;
        this.sinopse = sinopse;
        this.duracao = duracao;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Diretor: " + diretor + ".");
        System.out.println("Ator Principal: " + atorPrincipal + ".");
        System.out.println("Sinopse: " + sinopse + ".");
        System.out.println("Duração: " + duracao + " minutos.");
    }
}
