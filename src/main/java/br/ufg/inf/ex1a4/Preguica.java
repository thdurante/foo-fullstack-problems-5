package br.ufg.inf.ex1a4;

public class Preguica extends Animal {

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Sei lá...");
    }

    public void subirNaArvore() {
        System.out.println("Preguiça subindo na árvore");
    }
}
