import java.util.*;

public class Loja {
    private String nome;
    private String ramo;
    private int anoFundacao;
    private List<Vendedor> vendedores;

    public Loja(String nome, String ramo, int anoFundacao) {
        this.nome = nome;
        this.ramo = ramo;
        this.anoFundacao = anoFundacao;
        this.vendedores = new ArrayList<Vendedor>();
    }

    public String getNome() {return nome;}

    public String getRamo() {return ramo;}

    public int getAnoFundacao() {return anoFundacao;}

    public List<Vendedor> getVendedores() {return vendedores;}

    public void admitirVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);
        System.out.println("Vendedor " + vendedor.nome + " admitido com sucesso!");
    }

    public void demitirVendedor(Vendedor vendedor) {
        vendedores.remove(vendedor);
        System.out.println("Vendedor " + vendedor.nome + " foi demitido.");
    }
}
