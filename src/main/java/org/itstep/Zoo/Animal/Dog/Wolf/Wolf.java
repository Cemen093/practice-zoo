package org.itstep.Zoo.Animal.Dog.Wolf;

import org.itstep.Zoo.Animal.Animal;

public class Wolf extends Animal {
    private final static String typeAnimal = "Волк";
    private final static String typeFood = "оленина";

    public Wolf(String nickname, int age, int weight) {
        super(typeAnimal, nickname, age, weight, typeFood);
    }
}
