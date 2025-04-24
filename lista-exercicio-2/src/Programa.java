public class Programa {
    public static void main(String[] args) {
        Funcionario pessoa = new Funcionario("Caio", 7, 100, "31/07", 4);
        pessoa.calculaSalario(7, 100);

        pessoa.imprimeDados("Caio", 1112223334, 556667778, 4, pessoa.totalSalario,"31/07", 7, 100);
    }
}
