package org.itstep.Zoo.Animal;

import org.itstep.Time;

public abstract class Animal {
    //У животного есть кличка, возраст, вес, номер вольера, время пребывания в зоопарке и др. аттрибуты.
    protected String typeAnimal;
    protected String nickname;
    protected int age;
    protected int weight;
    protected Time timeSpentAtTheZoo  = new Time();
    protected String typeFood;
    protected boolean live = true;

    public Animal(String typeAnimal, String nickname, int age, int weight, String typeFood) {
        this.typeAnimal = typeAnimal;
        this.nickname = nickname;
        this.age = age;
        this.weight = weight;
        this.typeFood = typeFood;
    }

    public void changeNickname(String newNickname){
        nickname = newNickname;
    }
    
    public void addAge(){
        age++;
    }

    public void setWeight(int newWeight){
        weight = newWeight;
    }

    public void addTime(Time b){
        timeSpentAtTheZoo.addTime(b);
    }

    public String getTypeFood() {
        return typeFood;
    }

    public void notEat(){
        live = false;
    }

    public boolean isLive() {
        return live;
    }

    @Override
    public String toString(){
        //System.out.printf( "Кличка", "Водраст", "Вес", "№ Вольера", "Время пребывания", "Тип", "Состояние");

        return String.format("%1s%10s%1s%20s%1s%10s%1s%5s%1s%33s%1s%15s%1s%10s%1s",
                "|", typeAnimal,
                "|", nickname,
                "|", age,
                "|", weight,
                "|", timeSpentAtTheZoo.toString(),
                "|", typeFood,
                "|", live ? "live" : "not live",
                "|");
    }
}
