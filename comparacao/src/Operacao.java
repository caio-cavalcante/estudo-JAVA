import java.util.*;

public class Operacao{
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        Conta conta1 = new Conta(1, "Ana", 700, 200);
        Conta conta2 = new Conta(3, "Breno", 2000, 300);
        Conta conta3 = new Conta(2, "Caio", 1000, 100);

        ArrayList<Conta> contas = new ArrayList<>();

        cliente.adicionarConta(conta1);
        cliente.adicionarConta(conta2);
        cliente.adicionarConta(conta3);

        System.out.println("Contas em ordem numérica:");
        cliente.ordenarNumero();
        cliente.imprimirContas();

        System.out.println("Contas em ordem alfabética:");
        cliente.ordenarTitular();
        cliente.imprimirContas();
    }
}
