package questao1;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Toyota Corolla";
        carro.velocidade = 0;
        carro.aceleracao = 10;
        carro.marcha = 0;

        carro.liga();
        carro.subirMarcha();
        carro.acelerar();
        carro.virarDireita();
        carro.frear();
        carro.desliga();
    }
}
