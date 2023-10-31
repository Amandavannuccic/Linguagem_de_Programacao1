package classes10;

public class Celular {
    private String marca;
    private String modelo;
    private int bateria;

    public Celular(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = 100; 
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getBateria() {
        return bateria;
    }

    public void fazerLigacao(String numero) {
        if (bateria > 0) {
            System.out.println("Fazendo ligação para " + numero);
            bateria -= 10; 
        } else {
            System.out.println("Bateria fraca. Não é possível fazer ligações.");
        }
    }

    public void carregar() {
        if (bateria < 100) {
            System.out.println("Carregando o celular.");
            bateria = 100;
        } else {
            System.out.println("A bateria já está totalmente carregada.");
        }
    }

    public static void main(String[] args) {
        Celular celular = new Celular("Samsung", "Galaxy S21");
        celular.fazerLigacao("123456789");
        celular.carregar();
    }
}
