package org.itstep.Zoo.Animal.Dog.Dingo;

import org.itstep.Zoo.Animal.Animal;

public class Dingo extends Animal {
    private final static String typeAnimal = "Динго";
    private final static String typeFood = "кролики";

    public Dingo(String nickname, int age, int weight) {
        super(typeAnimal, nickname, age, weight, typeFood);
    }
}
