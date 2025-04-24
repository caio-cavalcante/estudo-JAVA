public class Operacao {
    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor("Ana", 19);
        Vendedor vendedor2 = new Vendedor("Breno", 22);
        Vendedor vendedor3 = new Vendedor("Caio", 20);

        Loja loja = new Loja("InHome", "Vendas", 2024);

        loja.admitirVendedor(vendedor1);
        loja.admitirVendedor(vendedor2);
        loja.admitirVendedor(vendedor3);

        loja.demitirVendedor(vendedor2);
    }
}
