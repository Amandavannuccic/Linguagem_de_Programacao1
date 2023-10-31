package classes10;

public class Televisao {
    private String marca;
    private String modelo;
    private int tamanhoPolegadas;
    private int canalAtual;
    private boolean ligada;

    public Televisao(String marca, String modelo, int tamanhoPolegadas) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoPolegadas = tamanhoPolegadas;
        this.canalAtual = 1;
        this.ligada = false;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getTamanhoPolegadas() {
        return tamanhoPolegadas;
    }

    public void ligar() {
        if (!ligada) {
            System.out.println("Ligando a televisão.");
            ligada = true;
        } else {
            System.out.println("A televisão já está ligada.");
        }
    }

    public void desligar() {
        if (ligada) {
            System.out.println("Desligando a televisão.");
            ligada = false;
        } else {
            System.out.println("A televisão já está desligada.");
        }
    }

    public void mudarCanal(int novoCanal) {
        if (ligada) {
            canalAtual = novoCanal;
            System.out.println("Canal alterado para " + novoCanal);
        } else {
            System.out.println("Não é possível mudar de canal. A televisão está desligada.");
        }
    }

    public static void main(String[] args) {
        Televisao tv = new Televisao("Sony", "Bravia", 55);
        tv.ligar();
        tv.mudarCanal(5);
        tv.desligar();
    }
}
