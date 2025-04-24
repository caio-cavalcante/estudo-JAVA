public class Conta implements Comparable<Conta> {
    private int numero;
    private String titular;
    private double limite;
    private double saldo;

    public Conta(int numero, String titular, double limite, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.limite = limite;
        this.saldo = saldo;
    }

    public int getNumero() {return numero;}

    public String getTitular() {return titular;}

    public double getLimite() {return limite;}

    public double getSaldo() {return saldo;}

    @Override
    public String toString() {
        return "Número= " + numero + ", Titular= " + titular + ", Limite de Crédito= " + limite + ", Saldo= " + saldo;
    }

    @Override
    public int compareTo(Conta outraConta) {
        return Integer.compare(this.numero, outraConta.numero);
    }
}
