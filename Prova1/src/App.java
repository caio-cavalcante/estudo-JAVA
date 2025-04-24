public class App {
    public static void main(String[] args) {
        DAO dao = new DAO();

        Analista analista1 = new Analista(1, "Cleber");
        Programador prog1 = new Programador(2, "Luana");
        Programador prog2 = new Programador(3, "Vitória");

        Projeto p = new Projeto();
        p.setCodigo(1);
        p.setNome("IFBA");
        p.setDescricao("Descrição do Projeto");
        p.setResponsavel(analista1);
        p.setProgramador1(prog1);
        p.setProgramador2(prog2);
        dao.salvar(p);

        Projeto projeto_buscado = (Projeto) dao.buscar("IFBA");
        projeto_buscado.imprimeDados();
    }
}
