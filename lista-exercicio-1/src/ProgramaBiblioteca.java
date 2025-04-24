public class ProgramaBiblioteca {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.publicacao("Core Java", "Cay S H", 2018, "Educação", "Pearson", 4, 11, "978-0135166307");

        Filme filme = new Filme();
        filme.publicacao("Matrix", "The Wachowskis", 1999, "SciFi", "Paramount", 2, "Lana e Lilly W.", "Keanu Reeves", "Em um futuro distópico..", 136);

        Publicacao[] publicacoes = {livro, filme};
        for (Publicacao publicacao : publicacoes) {
            publicacao.imprimir();
            System.out.println();
        }
    }
}
