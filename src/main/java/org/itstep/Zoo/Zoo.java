package org.itstep.Zoo;

import org.itstep.Time;
import org.itstep.Zoo.Animal.Animal;

import java.util.Arrays;

public class Zoo {
    private Animal[] animal = new Animal[0];
    private Feed feed = new Feed();

    public Zoo() {
    }

    public void addAnimal(Animal animal) {
        this.animal = Arrays.copyOf(this.animal, this.animal.length + 1);
        this.animal[this.animal.length - 1] = animal;

    }

    public void delAnimal(int index){
        Animal[] tmp = new Animal[animal.length - 1];
        System.arraycopy(animal, 0, tmp, 0, index);
        System.arraycopy(animal, index + 1, tmp, index, tmp.length - index);
        animal = tmp;
    }

    public void addTime(int index, Time time){
        animal[index].addTime(time);
    }

    public void show(){
        System.out.print("\n\n\n");
        String tmp = "+---------+----------+--------------------+----------+-----+" +
                "---------------------------------+---------------+----------+";
        System.out.println(tmp);
        System.out.printf("%1s%9s%1s%10s%1s%20s%1s%10s%1s%5s%1s%33s%1s%15s%1s%10s%1s",
                "|", "№ Вольера", "|", "тип", "|", "Кличка", "|", "Водраст", "|", "Вес", "|",
                "Время пребывания", "|", "Тип", "|", "Состояние", "|\n");
        System.out.println(tmp);

        for (int i = 0; i < this.animal.length; i++) {
            System.out.printf("%1s%-9s", "|", i + 1);
            System.out.println(this.animal[i].toString());
        }
        System.out.println(tmp);
    }

    public void addFeed(String nameFeed, int amount){
        feed.addFeed(nameFeed, amount);
    }

    public void nextDay(){
        for (int i = 0; i < animal.length; i++) {
            if (animal[i].isLive() && !feed.delFeed(animal[i].getTypeFood(), 1)){
                animal[i].notEat();
            }

            animal[i].addTime(new Time(0,0,1,0,0,0));
        }
    }

    public void feedShow(){
        feed.show();
    }

    public int size(){
        return animal.length;
    }
}
