public class Funcionario extends Calculo{
    public String nome;
    public long cpf;
    public long rg;
    private int salario;
    public String dataContratacao;

    public Funcionario(String nome,int salarioBase, int horasTrabalhadas, String dataContratacao, int matricula){
        Calculo funcionario = new Calculo();

        funcionario.calculaSalario(salarioBase, horasTrabalhadas);

        matricula = geraMatricula++;
    }

    public void imprimeDados(String nome, long cpf, long rg, int matricula, int salario, String dataContratacao, int salarioBase, int horasTrabalhadas){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("Matricula: " + matricula);
        System.out.println("Salario: " + salario);
        System.out.println("Data de contratacao: " + dataContratacao);
        System.out.println("Salario base: " + salarioBase);
        System.out.println("Horas trabalhadas: " + horasTrabalhadas);
    }
}