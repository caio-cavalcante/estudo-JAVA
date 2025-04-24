public class ContaCorrente {
    double valor = 0;
    double saldo;
    double salarioAnual = 12000;

    public void executarOperacao(Operacao opr) {
        valor = valor + saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getSalarioAtual() {
        return salarioAnual;
    }
}
