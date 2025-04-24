public class Debito extends Operacao{
    public Debito(double valor) {
        this.valor = valor;
    }

    @Override
    public double operar() {
        return -valor;
    }
}
