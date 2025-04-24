public class Usuario {
    private String nome;
    private int idade;

    public void setNome(String nome) throws NomeInvalidoException {
        if (nome == null || nome.isEmpty()) {
            throw new NomeInvalidoException("Escreva um nome válido.");
        }
        this.nome = nome;
    }

    public void setIdade(int idade) throws IdadeInvalidaException{
        if (idade < 18 || idade > 100) {
            throw new IdadeInvalidaException("Escreva uma idade válida.");
        }
        this.idade = idade;
    }

    static class NomeInvalidoException extends Exception {
        public NomeInvalidoException(String mensagem) {
            super(mensagem);
        }
    }

    static class IdadeInvalidaException extends Exception {
        public IdadeInvalidaException(String mensagem) {
            super(mensagem);
        }
    }
}
