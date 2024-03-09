package org.example;

import java.util.*;

public class SistemaVeterinario {
    private Map<Integer, Animal> animais;

    public SistemaVeterinario() {
        this.animais = new HashMap<>();
    }

    public void cadastrarAnimal(int id, String nome) {
        Animal animal = new Animal(id, nome);
        animais.put(id, animal);
    }

    public Animal buscarAnimal(int id) {
        return animais.get(id);
    }

    public void alterarAnimal(int id, String novoNome) {
        Animal animal = animais.get(id);
        if (animal != null) {
            animal.setNome(novoNome);
        }
    }

    public void excluirAnimal(int id) {
        animais.remove(id);
    }

    public List<Animal> listarAnimais() {
        return new ArrayList<>(animais.values());
    }
}
