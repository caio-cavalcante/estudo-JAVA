/*
Sabendo que um Carro para o sistema de cadastro da loja XPTO Veículos
possui as seguintes características: Código, Marca, Cor, Modelo, Ano de
Fabricação, Número de Portas, Tipo de Combustível, Quantidade
Disponível, Preço e se carro é completo ou básico. O objeto Carro possui os
seguintes comportamentos: (i) cadastrar e alterar que recebem como
parâmetro as características do Carro; (ii) listar – comportamento
responsável por listar as informações do carro.
*/

package questao1A;

import java.util.Scanner;

public class CarroXPTO {
    private String codigo;
    private String marca;
    private String cor;
    private String modelo;
    private int ano;
    private int portas;
    private String combustivel;
    private int quantidade;
    private double preco;
    private String versao;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CarroXPTO carro1 = new CarroXPTO();
        CarroXPTO carro2 = new CarroXPTO();

        carro1.sets();
        carro2.sets();
        carro1.listar();
        carro2.listar();
        carro1.alterar();
        carro1.listar();

        scan.close();
    }

    public static String getCodigo(Scanner codigo) {
        System.out.println("\nInforme o codigo");
        return codigo.nextLine();
    }

    public void setCodigo() {
        Scanner scan = new Scanner(System.in);
        this.codigo = CarroXPTO.getCodigo(scan);
    }

    public static String getMarca(Scanner marca) {
        System.out.println("Informe a marca");
        return marca.nextLine();
    }

    public void setMarca() {
        Scanner scan = new Scanner(System.in);
        this.marca = CarroXPTO.getMarca(scan);
    }

    public static String getCor(Scanner cor) {
        System.out.println("Informe a cor");
        return cor.nextLine();
    }

    public void setCor() {
        Scanner scan = new Scanner(System.in);
        this.cor = CarroXPTO.getCor(scan);
    }

    public static String getModelo(Scanner modelo) {
        System.out.println("Informe o modelo");
        return modelo.nextLine();
    }

    public void setModelo() {
        Scanner scan = new Scanner(System.in);
        this.modelo = CarroXPTO.getModelo(scan);
    }

    public static int getAno(Scanner ano) {
        System.out.println("Informe o ano");
        return ano.nextInt();
    }

    public void setAno() {
        Scanner scan = new Scanner(System.in);
        this.ano = CarroXPTO.getAno(scan);
    }

    public static int getPortas(Scanner portas) {
        System.out.println("Informe a quantidade de portas");
        return portas.nextInt();
    }

    public void setPortas() {
        Scanner scan = new Scanner(System.in);
        this.portas = CarroXPTO.getPortas(scan);
    }

    public static String getCombustivel(Scanner combustivel) {
        System.out.println("Informe o tipo de combustivel");
        return combustivel.nextLine();
    }

    public void setCombustivel() {
        Scanner scan = new Scanner(System.in);
        this.combustivel = CarroXPTO.getCombustivel(scan);
    }

    public static int getQuantidade(Scanner quantidade) {
        System.out.println("Informe a quantidade disponível");
        return quantidade.nextInt();
    }

    public void setQuantidade() {
        Scanner scan = new Scanner(System.in);
        this.quantidade = CarroXPTO.getQuantidade(scan);
    }

    public static double getPreco(Scanner preco) {
        System.out.println("Informe o preço");
        return preco.nextDouble();
    }

    public void setPreco() {
        Scanner scan = new Scanner(System.in);
        this.preco = CarroXPTO.getPreco(scan);
    }

    public static String getVersao(Scanner versao) {
        System.out.println("Informe a versão");
        return versao.nextLine();
    }

    public void setVersao() {
        Scanner scan = new Scanner(System.in);
        this.versao = CarroXPTO.getVersao(scan);
    }

    public void sets() {
        setCodigo();
        setMarca();
        setCor();
        setModelo();
        setAno();
        setPortas();
        setCombustivel();
        setQuantidade();
        setPreco();
        setVersao();
    }

    public void listar() {
        System.out.println("\nCódigo: " + this.codigo);
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Quantidade de portas: " + portas);
        System.out.println("Tipo de combustível: " + combustivel);
        System.out.println("Quantidade disponível:  " + quantidade);
        System.out.printf("Preço: R$%.2f", preco);
        System.out.println("\nVersão: " + versao);
    }

    public void alterar() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe qual opção deseja alterar");
        System.out.println("1 - Código");
        System.out.println("2 - Marca");
        System.out.println("3 - Cor");
        System.out.println("4 - Modelo");
        System.out.println("5 - Ano");
        System.out.println("6 - Quantidade de portas");
        System.out.println("7 - Tipo de combustível");
        System.out.println("8 - Quantidade disponível");
        System.out.println("9 - Preço");
        System.out.println("10 - Versão");

        int opcao = scan.nextInt();

        switch (opcao) {
            case 1:
                setCodigo();
                break;
            case 2:
                setMarca();
                break;
            case 3:
                setCor();
                break;
            case 4:
                setModelo();
                break;
            case 5:
                setAno();
                break;
            case 6:
                setPortas();
                break;
            case 7:
                setCombustivel();
                break;
            case 8:
                setQuantidade();
                break;
            case 9:
                setPreco();
                break;
            case 10:
                setVersao();
                break;
            default:
                System.out.println("Opção Inválida");
        }
        scan.close();
    }
}
