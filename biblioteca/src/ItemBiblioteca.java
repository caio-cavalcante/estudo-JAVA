abstract class ItemBiblioteca {
    protected String titulo;

    public ItemBiblioteca(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public abstract void mostrarDetalhes();
}
