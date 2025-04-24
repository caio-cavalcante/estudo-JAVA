/*
2)Utilizando os conhecimentos de O.O. construa um
programa utilizando as informações abaixo:
Uma televisão possui as seguintes características:
 tamanho de tela (em polegadas);
 volume: de 1 a 10 iniciando em 5 (somente no construtor);
 marca;
 voltagem (220 e 110);
 canal.
A televisão pode realizar as seguintes ações:
 ligar: ao ligar a televisão deve imprimir seu consumo. O
consumo deve ser definido pela voltagem multiplicada pela
quantidades de polegadas;
 desligar;
 aumentar e diminuir o volume;
 subir e descer canal.
*/

package questao2;

public class Televisao {
    public double tamanho;
    public int volume;
    public java.lang.String marca;
    public double voltagem;
    public int canal;

    public void ligar() {
        double consumo = tamanho * voltagem;
        System.out.println("Televisão " + marca + " ligada. Consumo de " + consumo);
    }

    public void desligar() {
        System.out.println("Televisão " + marca + " desligada");
    }

    public void aumentarVolume() {
        volume = volume + 1;
        System.out.println("Televisão " + marca + " volume " + volume);
    }

    public void diminuirVolume() {
        volume = volume - 1;
        System.out.println("Televisão " + marca + " volume " + volume);
    }

    public void subirCanal() {
        canal = canal + 1;
        System.out.println("Televisão " + marca + " canal " + canal);
    }

    public void descerCanal() {
        canal = canal - 1;
        System.out.println("Televisão " + marca + " canal " + canal);
    }
}

