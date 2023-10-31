package classes10;

public class Animal {
    private String nome;
    private String especie;
    private int idade;

    public Animal(String nome, String especie, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public int getIdade() {
        return idade;
    }

    public void emitirSom() {
        if (idade < 2) {
            System.out.println(nome + " é um filhote e está fazendo barulhos fofos.");
        } else {
            System.out.println(nome + " está fazendo barulhos comuns.");
        }
    }

    public void comer() {
        if (idade < 2) {
            System.out.println(nome + " está se alimentando com leite materno.");
        } else {
            System.out.println(nome + " está comendo ração.");
        }
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Rex", "Cachorro", 3);
        animal.emitirSom();
        animal.comer();
    }
}

