package org.itstep.Zoo.Animal.Snake.Boa;

import org.itstep.Zoo.Animal.Animal;

public class Boa extends Animal {
    private final static String typeAnimal = "Удав";
    private final static String typeFood = "лягушки";

    public Boa(String nickname, int age, int weight) {
        super(typeAnimal, nickname, age, weight, typeFood);
    }
}
