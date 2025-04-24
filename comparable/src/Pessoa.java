public class Pessoa implements Comparable<Pessoa> {
    private int idade;
    private String nome;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Pessoa o) {
        if (this.idade > o.idade) {
            System.out.println("Você é mais velho!");
        } else if (this.idade < o.idade) {
            System.out.println("Você é mais novo!");
        } else {
            System.out.println("Vocês tem a mesma idade!");
        }

        return 0;
    }
}

