package br.ufg.inf.ex1a4;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {

    private List<Jaula> jaulas;

    public Zoologico() {
        this.jaulas = new ArrayList<>();
    }

    public void adicionarJaula(Jaula jaula) {
        this.jaulas.add(jaula);
    }

    public List<Jaula> getJaulas() {
        return jaulas;
    }
}
