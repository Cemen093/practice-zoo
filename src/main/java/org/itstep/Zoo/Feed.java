package org.itstep.Zoo;

import java.util.Arrays;

public class Feed {
    private String[] nameFeed = new String[0];
    private int amount[] = new int[0];

    public Feed() {
    }

    public void addFeed(String nameFeed, int amount){
        for (int i = 0; i < this.nameFeed.length; i++) {
            if (this.nameFeed[i].equals(nameFeed)){
                this.amount[i] += amount;
                return;
            }
        }
        this.nameFeed = Arrays.copyOf(this.nameFeed, this.nameFeed.length + 1);
        this.nameFeed[this.nameFeed.length - 1] = nameFeed;
        this.amount = Arrays.copyOf(this.amount, this.amount.length + 1);
        this.amount[this.nameFeed.length - 1] = amount;
    }

    public boolean delFeed(String nameFeed, int amount){
        boolean check = false;
        for (int i = 0; i < this.nameFeed.length; i++) {
            if (this.nameFeed[i].equals(nameFeed)){
                if (this.amount[i] >= amount){
                    this.amount[i] -= amount;
                  return true;
                }
                else {return false;}
            }
        }
        return false;
    }

    public void show(){
        System.out.println();
        dividingLine(nameFeed.length + 1);

        System.out.printf("|%20s", "Название");
        for (int i = 0; i < nameFeed.length; i++) {
            System.out.printf("|%20s", nameFeed[i]);
        }
        System.out.println("|");

        System.out.printf("|%20s", "Количество");
        for (int i = 0; i < nameFeed.length; i++) {
            System.out.printf("|%20s", amount[i]);
        }
        System.out.println("|");

        dividingLine(nameFeed.length + 1);
    }

    private void dividingLine(int l){

        for (int i = 0; i < l; i++) {
            System.out.print("+--------------------");
        }
        System.out.print("+\n");
    }
}
