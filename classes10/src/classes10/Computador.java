package classes10;

public class Computador {
    private String marca;
    private String modelo;
    private int memoriaRAM;
    private boolean ligado;

    public Computador(String marca, String modelo, int memoriaRAM) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaRAM = memoriaRAM;
        this.ligado = false;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void ligar() {
        if (!ligado) {
            System.out.println("Ligando o computador: " + marca + " " + modelo);
            ligado = true;
        } else {
            System.out.println("O computador já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            System.out.println("Desligando o computador: " + marca + " " + modelo);
            ligado = false;
        } else {
            System.out.println("O computador já está desligado.");
        }
    }

    public void executarPrograma(String programa) {
        if (ligado) {
            System.out.println("Executando o programa: " + programa);
        } else {
            System.out.println("O computador está desligado. Ligue-o primeiro.");
        }
    }

    public static void main(String[] args) {
        Computador computador = new Computador("Dell", "XPS 13", 16);
        computador.ligar();
        computador.executarPrograma("Word");
        computador.desligar();
    }
}
