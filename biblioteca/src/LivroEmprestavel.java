public class LivroEmprestavel extends Livro implements Emprestimo {
    private boolean emprestado = false;

    public LivroEmprestavel(Autor autor, String titulo) {
        super(autor, titulo);
    }


    @Override
    public void emprestar() {
        if(!emprestado) {
            emprestado = true;
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("Livro já está emprestado!");
        }
    }

    @Override
    public void devolver() {
        if(emprestado) {
            emprestado = false;
            System.out.println("Livro devolvido com sucesso!");
        } else {
            System.out.println("Livro não está emprestado!");
        }
    }
}
