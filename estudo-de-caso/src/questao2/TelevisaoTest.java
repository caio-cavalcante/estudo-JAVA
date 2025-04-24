package questao2;

public class TelevisaoTest {
    public static void main(String[] args) {
        Televisao televisao1 = new Televisao();
        televisao1.tamanho = 50;
        televisao1.volume = 5;
        televisao1.marca = "Samsung";
        televisao1.voltagem = 220;
        televisao1.canal = 10;

        Televisao televisao2 = new Televisao();
        televisao2.tamanho = 39;
        televisao2.volume = 5;
        televisao2.marca = "LG";
        televisao2.voltagem = 110;
        televisao2.canal = 7;

        televisao1.ligar();
        televisao1.aumentarVolume();
        televisao1.descerCanal();
        televisao1.desligar();
        System.out.println("");

        televisao2.ligar();
        televisao2.diminuirVolume();
        televisao2.subirCanal();
        televisao2.desligar();
    }
}
