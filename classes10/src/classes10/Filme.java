package classes10;

public class Filme {
    private String titulo;
    private String diretor;
    private int duracaoMinutos;

    public Filme(String titulo, String diretor, int duracaoMinutos) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracaoMinutos = duracaoMinutos;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void assistir() {
        if (duracaoMinutos <= 120) {
            System.out.println("Assistindo ao filme: " + titulo);
        } else {
            System.out.println("Este filme é longo. Prepare-se para uma sessão estendida.");
        }
    }

    public static void main(String[] args) {
        Filme filme = new Filme("Matrix", "Wachowski Brothers", 136);
        filme.assistir();
    }
}
