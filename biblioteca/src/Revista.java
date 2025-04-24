public class Revista extends ItemBiblioteca {
    private int edicao;
    
    public Revista(String titulo, int edicao) {
        super(titulo);
        this.edicao = edicao;
    }

    @Override
    public void mostrarDetalhes() {
        this.toString();
    }

    @Override
    public String toString() {
        return "Revista: " + titulo + ", Edição: " + edicao;
    }
}
