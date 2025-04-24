public class ProgramaBiblioteca {
    public static void main(String[] args) {
            Livro livro = new Livro("1984", "G. Orwell", 1949, "Distopia", "GCL", 4, 9, 978951045);

            Filme filme = new Filme("1984", "G. Orwell", 1984, "Ficção", "20th C. F", 7, "M. Radford", "J. Hurt", "Em um mundo...", 110);

            Publicacao[] publicacoes = {livro, filme};

        for (int i = 0; i < publicacoes.length; i++) {
            publicacoes[i].imprimirDados();
            System.out.println();
        }

    }
}
