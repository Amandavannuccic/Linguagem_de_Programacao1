package classes10;

public class Livro {
 private String titulo;
 private String autor;
 private int anoPublicacao;

 public Livro(String titulo, String autor, int anoPublicacao) {
     this.titulo = titulo;
     this.autor = autor;
     this.anoPublicacao = anoPublicacao;
 }

 public String getTitulo() {
     return titulo;
 }

 public String getAutor() {
     return autor;
 }

 public int getAnoPublicacao() {
     return anoPublicacao;
 }

 public void abrir() {
     System.out.println("Abrindo o livro: " + titulo);
 }

 public void fechar() {
     System.out.println("Fechando o livro: " + titulo);
 }

 public void ler() {
     if (anoPublicacao <= 2000) {
         System.out.println("Lendo o livro antigo: " + titulo);
     } else {
         System.out.println("Lendo o livro recente: " + titulo);
     }
 }

 public static void main(String[] args) {
     Livro livro = new Livro("Pai Rico Pai pobre", "Robert Kiyosaki e Sharon L. Lechter", 1997);
     livro.abrir();
     livro.ler();
     livro.fechar();
 }
}
