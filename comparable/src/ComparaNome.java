import java.util.Comparator;

public class ComparaNome implements Comparator <Pessoa> {
    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        if (o1.getNome().compareTo(o2.getNome()) == 0) {
            System.out.println("Vocês são xarás!");
        } else {
            System.out.println("Nomes diferentes.");
        }
        return 0;
    }
}
