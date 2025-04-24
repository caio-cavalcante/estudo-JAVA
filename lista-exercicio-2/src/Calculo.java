public class Calculo{
    protected int totalSalario;
    private int matricula;
    private int salarioBase;
    private int horasTrabalhadas;
    protected static int geraMatricula = 0;

    public void calculaSalario(int salarioBase, int horasTrabalhadas){
        totalSalario = salarioBase * horasTrabalhadas;
    }

    public int getTotalSalario(){
        return totalSalario;
    }
}