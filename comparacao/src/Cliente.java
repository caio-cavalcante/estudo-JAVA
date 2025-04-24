import java.util.*;

public class Cliente {
    private List<Conta> contas;

    public Cliente() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public void ordenarNumero() {
        Collections.sort(contas);
    }

    public void ordenarTitular() {
        contas.sort(Comparator.comparing(Conta::getTitular));
    }

    public void imprimirContas() {
        for (Conta conta : contas) {
            System.out.println(conta);
        }
    }
}
