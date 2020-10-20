package org.itstep.Zoo.Animal.Cat.Panther;

import org.itstep.Zoo.Animal.Animal;

public class Panther extends Animal {
    private final static String typeAnimal = "Пантера";
    private final static String typeFood = "буйволятина";

    public Panther(String nickname, int age, int weight) {
        super(typeAnimal, nickname, age, weight, typeFood);
    }
}

