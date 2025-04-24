abstract class Membro {
    protected int matricula;
    protected String nome;
    protected double salario;

    protected void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected void setSalario(double salario) {
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}
