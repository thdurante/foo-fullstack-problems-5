package br.ufg.inf.ex1a4;

public abstract class Animal {

    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public abstract void emitirSom();
}
