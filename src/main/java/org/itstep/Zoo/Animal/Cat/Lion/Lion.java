package org.itstep.Zoo.Animal.Cat.Lion;

import org.itstep.Zoo.Animal.Animal;

public class Lion extends Animal {
    private final static String typeAnimal = "Лев";
    private final static String typeFood = "вискас";

    public Lion(String nickname, int age, int weight) {
        super(typeAnimal, nickname, age, weight, typeFood);
    }
}
