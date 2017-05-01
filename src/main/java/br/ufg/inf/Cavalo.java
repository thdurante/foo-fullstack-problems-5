package br.ufg.inf;

public class Cavalo extends Animal {

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Po co tó!");
    }

    public void correr() {
        System.out.println("Cavalo correndo...");
    }
}
