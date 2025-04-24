public class Credito extends Operacao{
    public Credito(double valor){
        this.valor = valor;
    }

    @Override
    public double operar() {
        return valor;
    }
}
