package br.ufg.inf.ex1a4;

import java.util.ArrayList;
import java.util.List;

public class Testa {
    public static void main(String[] args) {

        Veterinario veterinario = new Veterinario();

        List<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro("Spike", 7));
        animais.add(new Cavalo("Alazão", 12));
        animais.add(new Preguica("Zé", 3));

        for (Animal animal: animais) {
            // animal.emitirSom();
            veterinario.examinar(animal);
        }

        System.out.println("\n\n");

        Zoologico zoo = new Zoologico();

        zoo.adicionarJaula(new Jaula(new Cachorro("CH1", 7)));
        zoo.adicionarJaula(new Jaula(new Cachorro("CH2", 7)));
        zoo.adicionarJaula(new Jaula(new Cachorro("CH3", 7)));
        zoo.adicionarJaula(new Jaula(new Cachorro("CH4", 7)));
        zoo.adicionarJaula(new Jaula(new Cavalo("CV1", 7)));
        zoo.adicionarJaula(new Jaula(new Cavalo("CV2", 7)));
        zoo.adicionarJaula(new Jaula(new Cavalo("CV3", 7)));
        zoo.adicionarJaula(new Jaula(new Cavalo("CV4", 7)));
        zoo.adicionarJaula(new Jaula(new Preguica("PR1", 7)));
        zoo.adicionarJaula(new Jaula(new Preguica("PR2", 7)));

        for (Jaula jaula: zoo.getJaulas()) {
            Animal animal = jaula.getAnimal();
            animal.emitirSom();

            if(animal instanceof Cachorro) ((Cachorro) animal).correr();
            if(animal instanceof Cavalo) ((Cavalo) animal).correr();
        }
    }
}
