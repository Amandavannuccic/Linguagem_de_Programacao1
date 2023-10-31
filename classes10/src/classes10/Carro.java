package classes10;

//Classe Carro
public class Carro {
 private String marca;
 private String modelo;
 private int ano;
 private boolean ligado;

 public Carro(String marca, String modelo, int ano) {
     this.marca = marca;
     this.modelo = modelo;
     this.ano = ano;
     this.ligado = false;
 }

 public String getMarca() {
     return marca;
 }

 public String getModelo() {
     return modelo;
 }

 public int getAno() {
     return ano;
 }

 public void ligar() {
     if (!ligado) {
         System.out.println("Ligando o carro.");
         ligado = true;
     } else {
         System.out.println("O carro já está ligado.");
     }
 }

 public void desligar() {
     if (ligado) {
         System.out.println("Desligando o carro.");
         ligado = false;
     } else {
         System.out.println("O carro já está desligado.");
     }
 }

 public void acelerar(int velocidade) {
     if (ligado) {
         System.out.println("Acelerando o carro para " + velocidade + " km/h.");
     } else {
         System.out.println("Não é possível acelerar. O carro está desligado.");
     }
 }

 public static void main(String[] args) {
     Carro carro = new Carro("Toyota", "Corolla", 2022);
     carro.ligar();
     carro.acelerar(60);
     carro.desligar();
 }
}