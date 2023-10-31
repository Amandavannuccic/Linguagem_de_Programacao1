package classes10;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void comprar(int quantidade) {
        estoque += quantidade;
        System.out.println("Comprados " + quantidade + " unidades de " + nome);
    }

    public void vender(int quantidade) {
        if (estoque >= quantidade) {
            estoque -= quantidade;
            System.out.println("Vendidos " + quantidade + " unidades de " + nome);
        } else {
            System.out.println("Estoque insuficiente para vender " + quantidade + " unidades de " + nome);
        }
    }

    public void ajustarPreco(double novoPreco) {
        preco = novoPreco;
        System.out.println("Preço de " + nome + " ajustado para " + novoPreco);
    }

    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 1200.0, 10);
        produto.comprar(5);
        produto.vender(2);
        produto.ajustarPreco(1300.0);
    }
}
