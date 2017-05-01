package br.ufg.inf;

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
    }
}
