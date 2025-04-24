public class App {
    public static void main(String[] args) {
        ContaCorrente cAlana = new ContaCorrente();
        ContaCorrente cBruno = new ContaCorrente();
        ContaCorrente cCaio = new ContaCorrente();

        Banco banco = new Banco("Alana", cAlana, "Bruno", cBruno, "Caio", cCaio);

        banco.transferir("Alana", "Bruno", 1000.00);
        System.out.println("Saldo da Alana: " + cAlana.getSaldo());
        System.out.println("Saldo do Bruno: " + cBruno.getSaldo());
        System.out.println();

        banco.transferir("Bruno", "Caio", 500.00);
        System.out.println("Saldo de Bruno: " + cBruno.getSaldo());
        System.out.println("Saldo do Caio: " + cCaio.getSaldo());
        System.out.println();

        banco.transferir("Caio", "Alana", 200.00);
        System.out.println("Saldo de Caio: " + cCaio.getSaldo());
        System.out.println("Saldo da Alana: " + cAlana.getSaldo());
    }
}
