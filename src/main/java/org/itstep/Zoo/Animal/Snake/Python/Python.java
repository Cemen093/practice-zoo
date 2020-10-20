package org.itstep.Zoo.Animal.Snake.Python;

import org.itstep.Zoo.Animal.Animal;

public class Python extends Animal {
    private final static String typeAnimal = "Питон";
    private final static String typeFood = "крысы";

    public Python(String nickname, int age, int weight) {
        super(typeAnimal, nickname, age, weight, typeFood);
    }
}
