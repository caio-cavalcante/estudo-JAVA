public class App {
    public static void main(String[] args) {
        Brinquedo caminhao = new Caminhao();
        Brinquedo helicoptero = new Helicoptero();
        Brinquedo navio = new Navio();

        ControleRemoto c1 = new ControleRemoto(caminhao);
        ControleRemoto c2 = new ControleRemoto(helicoptero);
        ControleRemoto c3 = new ControleRemoto(navio);

        c1.mover(caminhao);
        c2.mover(helicoptero);
        c3.mover(navio);
    }
}
