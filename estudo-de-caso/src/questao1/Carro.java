/*
1) Utilizando os conhecimentos de O.O. construa um
programa utilizando as informações abaixo.
Um carro possui as seguintes características:
 modelo;
 velocidade;
 aceleração;
 marcha.
O carro pode realizar as seguintes ações:
 ligar e desligar;
 acelerar e desacelerar;
 virar a direita e esquerda;
 marcha para cima e para baixo.
*/

package questao1;

public class Carro {
    public java.lang.String modelo;
    public double velocidade;
    public double aceleracao;
    public int marcha;

    public void liga() {
        System.out.println(modelo + " está ligado.");
    }

    public void desliga() {
        System.out.println(modelo + " está desligado.");
    }

    public void acelerar() {
        velocidade = velocidade + aceleracao;
        System.out.println(modelo + " está acelerando. Agora a " + velocidade + "km/h");
    }

    public void frear() {
        velocidade = velocidade - aceleracao;
        System.out.println(modelo + " está freando. Agora a " + velocidade + "km/h");
    }

    public void virarEsquerda() {
        if (velocidade > 0) {
            System.out.println(modelo + " virou para esquerda.");
        } else {
            System.out.println(modelo + " está parado.");
        }
    }

    public void virarDireita() {
        if (velocidade > 0) {
            System.out.println(modelo + " virou para direita.");
        } else {
            System.out.println(modelo + " está parado.");
        }
    }

    public void subirMarcha() {
        if (aceleracao > 0) {
            marcha += 1;
            System.out.println(modelo + " agora está na " + marcha + "ª marcha.");
        } else {
            System.out.println(modelo + " está parado.");
        }
    }

    public void descerMarcha() {
        if (aceleracao > 0) {
            marcha -= 1;
            System.out.println(modelo + " agora está na " + marcha + "ª marcha.");
        } else {
            System.out.println(modelo + " está parado.");
        }
    }

}
