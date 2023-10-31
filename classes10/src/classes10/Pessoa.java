package classes10;


public class Pessoa {
private String nome;
private int idade;
private String endereco;

public Pessoa(String nome, int idade, String endereco) {
   this.nome = nome;
   this.idade = idade;
   this.endereco = endereco;
}

public String getNome() {
   return nome;
}

public int getIdade() {
   return idade;
}

public String getEndereco() {
   return endereco;
}

public void cumprimentar() {
   System.out.println("Olá, meu nome é " + nome);
}

public void trabalhar() {
   if (idade >= 18) {
       System.out.println("Estou trabalhando agora.");
   } else {
       System.out.println("Sou menor de idade e não posso trabalhar.");
   }
}

public void dormir() {
   if (idade >= 18) {
       System.out.println("Estou indo dormir.");
   } else {
       System.out.println("Vou dormir cedo, pois sou menor de idade.");
   }
}

public static void main(String[] args) {
   Pessoa pessoa = new Pessoa("João", 25, "Rua XYZ");
   pessoa.cumprimentar();
   pessoa.trabalhar();
   pessoa.dormir();
}
}

