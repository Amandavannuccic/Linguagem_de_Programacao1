package classes10;

public class Estudante {
    private String nome;
    private int idade;
    private String curso;

    public Estudante(String nome, int idade, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCurso() {
        return curso;
    }

    public void estudar() {
        System.out.println(nome + " está estudando para o curso de " + curso);
    }

    public void fazerProva() {
        if (idade >= 16) {
            System.out.println(nome + " está fazendo uma prova do curso de " + curso);
        } else {
            System.out.println("Sou menor de idade e não posso fazer a prova.");
        }
    }

    public void socializar() {
        if (idade >= 18) {
            System.out.println(nome + " está socializando com outros estudantes");
        } else {
            System.out.println("Socialização limitada devido à idade.");
        }
    }

    public static void main(String[] args) {
        Estudante estudante = new Estudante("Maria", 20, "Engenharia");
        estudante.estudar();
        estudante.fazerProva();
        estudante.socializar();
    }
}

